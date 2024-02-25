package com.java.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.CadastroDAO.GastoDAO;
import com.java.FactoryDAO.FactoryDAO;
import com.java.entities.Gastos;
import com.java.exception.DBException;
/**
 * Servlet implementation class GastosSeverlet
 */
@WebServlet("/cadGasto")
public class GastosSeverlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private GastoDAO cadGasto;

	
	public void init() throws ServletException{
    	super.init();
    	cadGasto = FactoryDAO.getGastos();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		
		switch(acao) {
		case "listar":
			listar(request, response);
			break;
		case "editar":
			editar(request, response);
			break;
		}
	}

	

	private void editar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("codigo"));
		Gastos gasto = cadGasto.buscarId(id);
		request.setAttribute("cadGasto", gasto);
		request.getRequestDispatcher("editGasto.jsp").forward(request, response);
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Gastos> list = cadGasto.listaGastos();
		request.setAttribute("cadGasto", list);
		request.getRequestDispatcher("showGastos.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String acao = request.getParameter("acao");
		
		switch(acao) {
		case "excluir":
			excluir(request,response);
			break;
		case "cadastrar":
			cadastrar(request, response);
			break;
		case "atualizar":
			atualizar(request, response);
			break;
		
		}
		
	}

	private void cadastrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String cpf = request.getParameter("cpf");
			String dsProventos = request.getParameter("dsGasto");
			double vlProventos = Double.parseDouble(request.getParameter("vlGasto"));
			String dtProventos = request.getParameter("dtGasto");
			LocalDate data = LocalDate.parse(dtProventos);
			String dsAdicionais = request.getParameter("dsAdicionais");
			
			Gastos gasto = new Gastos(cpf, dsProventos, vlProventos, data, dsAdicionais);
			cadGasto.inserirGastos(gasto);
			
			
			request.setAttribute("cadastrado", "Gastos cadastrado com sucesso!");
			
			
		}catch(DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Não foi possível realizar o cadastro!");
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Não foi possível realizar o cadastro!");
		}
		request.getRequestDispatcher("cadGasto.jsp").forward(request, response);
	}
	
	private void atualizar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			int codigo = Integer.parseInt(request.getParameter("codigo"));
			String cpf = request.getParameter("cpf");
			String dsProventos = request.getParameter("dsGasto");
			double vlProventos = Double.parseDouble(request.getParameter("vlGasto"));
			String dtProventos = request.getParameter("dtGasto");
			LocalDate data = LocalDate.parse(dtProventos);
			String dsAdicionais = request.getParameter("dsAdicionais");;
			
			Gastos gasto = new Gastos(codigo, cpf, dsProventos, vlProventos, data, dsAdicionais);
			cadGasto.atualizarGasto(gasto);
			
			request.setAttribute("cadastrado", "Gasto atualizado com sucesso!");
			
			
		}catch(DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Não foi possível atualizar a tabela!");
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Não foi possível atualizar a tabela!");
		}
		listar(request, response);
	}
	
	private void excluir(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("codigo"));
		try {
			Gastos gasto = cadGasto.removerGasto(id);
			request.setAttribute("cadGasto", gasto);
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Não foi possível realizar o cadastro!");
		}
		listar(request, response);
		
	}
}
