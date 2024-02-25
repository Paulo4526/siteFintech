package com.java.CadastroDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.DbManager.DbManager;
import com.java.entities.Usuario;

public class UsuDAOImpl implements UsuDAO {
	
	Connection conexao = null;
	PreparedStatement sql = null;
	public void usuCad (Usuario usuCad) {
		
		try {
			conexao = DbManager.getConnection();
			sql = conexao.prepareStatement("INSERT INTO T_SIP_USUARIO (NR_CPF, NM_APELIDO, DS_OCUPACAO, VL_SALARIO)" + "VALUES(?,?,?,?)");
			Long numeroLongo = Long.parseLong(usuCad.getCpf());
			sql.setLong(1, numeroLongo);
			sql.setString(2, usuCad.getApelido());
			sql.setString(3, usuCad.getProfissao());
			sql.setDouble(4, usuCad.getSalario());
			sql.executeUpdate();
			
			System.out.println("Dados gravados com sucesso!");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				sql.close();
				conexao.close();
				System.out.println("conexão finalizada com sucesso!");
			}catch(SQLException e) {
				e.printStackTrace();
				System.err.println("Erro ao fechar a conexão!");
			}
		}
		
	}
}
