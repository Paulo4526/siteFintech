package com.java.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.CadastroDAO.ProvDAO;
import com.java.FactoryDAO.FactoryDAO;
import com.java.entities.Proventos;

/**
 * Servlet implementation class ProvSeverlet
 */
@WebServlet("/cadProv")
public class ProvSeverlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private ProvDAO cadProv;
    
    public void init() throws ServletException{
    	super.init();
    	cadProv = FactoryDAO.getProv();
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
		Proventos prov = cadProv.buscarId(id);
		request.setAttribute("cadProv", prov);
		request.getRequestDispatcher("editProventos.jsp").forward(request, response);
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Proventos> list = cadProv.listarProv();
		request.setAttribute("cadProv", list);
		request.getRequestDispatcher("showProventos.jsp").forward(request, response);
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
			String dsProventos = request.getParameter("dsProventos");
			double vlProventos = Double.parseDouble(request.getParameter("vlProventos"));
			String dtProventos = request.getParameter("dtProventos");
			LocalDate data = LocalDate.parse(dtProventos);
			String dsAdicionais = request.getParameter("dsAdicionais");
			
			Proventos prov = new Proventos(cpf, dsProventos, vlProventos, data, dsAdicionais);
			cadProv.inserirProv(prov);
			
			
			request.setAttribute("cadastrado", "Proventos cadastrado com sucesso!");
			
			
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Não foi possível realizar o cadastro!");
		}
		request.getRequestDispatcher("cadProventos.jsp").forward(request, response);
	}
	
	private void atualizar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			int codigo = Integer.parseInt(request.getParameter("codigo"));
			String cpf = request.getParameter("cpf");
			String dsProventos = request.getParameter("dsProventos");
			double vlProventos = Double.parseDouble(request.getParameter("vlProventos"));
			String dtProventos = request.getParameter("dtProventos");
			LocalDate data = LocalDate.parse(dtProventos);
			String dsAdicionais = request.getParameter("dsAdicionais");
			
			Proventos prov = new Proventos(codigo, cpf, dsProventos, vlProventos, data, dsAdicionais);
			cadProv.atualizarProv(prov);
			
			request.setAttribute("cadastrado", "Proventos cadastrado com sucesso!");
			
			
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
			Proventos prov = cadProv.removerProv(id);
			request.setAttribute("cadProv", prov);
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Não foi possível realizar o cadastro!");
		}
		listar(request, response);
		
	}
}
