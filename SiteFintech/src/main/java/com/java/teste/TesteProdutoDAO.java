package com.java.teste;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import com.java.CadastroDAO.CadDAO;
import com.java.FactoryDAO.FactoryDAO;
import com.java.entities.Cadastro;

public class TesteProdutoDAO {

	public static void main(String[] args) throws SQLException {
		
		CadDAO dao = FactoryDAO.getCadDAO();
		Cadastro cad = new Cadastro("41321125860", "paulosilvabueno@hotmail.com", "Bueninho1!", "Paulo Bueno", LocalDate.now());
		
		List<Cadastro> lista = dao.listar();
		for(Cadastro item: lista) {
			System.out.println(item.getCpf() + " " + item.getEmail() + " " + item.getSenha() + " " + item.getDtCadastro()+ " " + item.getNomeUsuario());
		}

	}

}
