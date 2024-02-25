package com.java.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.CadastroDAO.InvesDAO;
import com.java.FactoryDAO.FactoryDAO;

import com.java.entities.Investimento;
import com.java.exception.DBException;


/**
 * Servlet implementation class InvesSeverlet
 */
@WebServlet("/cadInvestimento")
public class InvesSeverlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private InvesDAO cadInves;
	
	public void init() throws ServletException{
    	super.init();
    	cadInves = FactoryDAO.getInves();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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
		Investimento invest = cadInves.buscarId(id);
		request.setAttribute("cadInvestimento", invest);
		request.getRequestDispatcher("editInvestimento.jsp").forward(request, response);
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Investimento> list = cadInves.ListarInv();
		request.setAttribute("cadInvestimento", list);
		request.getRequestDispatcher("showInvestimento.jsp").forward(request, response);
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
			String dsProventos = request.getParameter("dsIvestimento");
			double vlProventos = Double.parseDouble(request.getParameter("vlInvestimento"));
			String dtProventos = request.getParameter("dtInvestimento");
			LocalDate data = LocalDate.parse(dtProventos);
			String dsAdicionais = request.getParameter("dsAdicionais");
			
			Investimento invest = new Investimento(cpf, dsProventos, vlProventos, data, dsAdicionais);
			cadInves.inserirInves(invest);
			
			
			request.setAttribute("cadastrado", "Investimento cadastrado com sucesso!");
			
			
		}catch(DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Não foi possível realizar o cadastro!");
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Não foi possível realizar o cadastro!");
		}
		request.getRequestDispatcher("cadInvestimento.jsp").forward(request, response);
	}
	
	private void atualizar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			int codigo = Integer.parseInt(request.getParameter("codigo"));
			String cpf = request.getParameter("cpf");
			String dsProventos = request.getParameter("dsIvestimento");
			double vlProventos = Double.parseDouble(request.getParameter("vlInvestimento"));
			String dtProventos = request.getParameter("dtInvestimento");
			LocalDate data = LocalDate.parse(dtProventos);
			String dsAdicionais = request.getParameter("dsAdicionais");
			
			Investimento invest = new Investimento(codigo, cpf, dsProventos, vlProventos, data, dsAdicionais);
			cadInves.atualizarInves(invest);
			
			request.setAttribute("cadastrado", "Investimento atualizado com sucesso!!");
			
			
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Não foi possível realizar o cadastro!");
		}
		listar(request, response);
	}
	
	private void excluir(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			int id = Integer.parseInt(request.getParameter("codigo"));
		try {
			Investimento invest = cadInves.removerInves(id);
			request.setAttribute("cadInvestimento", invest);
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Não foi possível realizar o cadastro!");
		}
		listar(request, response);
		
	}
}