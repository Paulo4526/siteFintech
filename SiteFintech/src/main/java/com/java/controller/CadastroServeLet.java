package com.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.CadastroDAO.CadDAO;
import com.java.CadastroDAO.UsuDAO;
import com.java.FactoryDAO.FactoryDAO;
import com.java.entities.Cadastro;
import com.java.entities.Usuario;
import com.java.exception.DBException;

/**
 * Servlet implementation class CadastroServeLet
 */
@WebServlet("/cadastro")
public class CadastroServeLet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private CadDAO caDao = FactoryDAO.getCadDAO();
    private UsuDAO usDao = FactoryDAO.getUsuDAO();
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acao = request.getParameter("acao");
		
		switch (acao) {
		case "listar":
			List<Cadastro> lista = caDao.listar();
		    request.setAttribute("cadastro", lista);
		    request.getRequestDispatcher("showCadastro.jsp").forward(request, response);
		    break;
		}
		
		
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
String acao = request.getParameter("acao");
		
		switch (acao) {
		case "cadastrar":
			cadastrar(request,response);
		}
		
}



private void cadastrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String email = request.getParameter("email");
			String nome = request.getParameter("nome");
			String cpf = request.getParameter("cpf");
			String DtCadastro = request.getParameter("DtCadastro");
			LocalDate data = LocalDate.parse(DtCadastro);
			String senha = request.getParameter("senha");
			String confirmaSenha = request.getParameter("confirmaSenha");
			String profissao = request.getParameter("profissao");
			String apelido = request.getParameter("apelido");
			double salario = Double.parseDouble(request.getParameter("salario"));
			
			Cadastro cad = new Cadastro(cpf, email, senha, nome, data);
			caDao.cadastrar(cad);
			
			Usuario usu = new Usuario(cpf, apelido, profissao, salario);
			usDao.usuCad(usu);
			
			request.setAttribute("msg", "Cadastro Realizado ocm sucesso!");
			
			response.sendRedirect("cadSucesso.jsp");
			
		}catch(DBException db) {
			db.printStackTrace();
			response.sendRedirect("cadErro.jsp");
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Não foi possível realizar o cadastro!");
			response.sendRedirect("cadErro.jsp");
		}finally {
			
		}
		
	}
}

