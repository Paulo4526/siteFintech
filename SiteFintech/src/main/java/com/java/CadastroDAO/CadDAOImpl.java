package com.java.CadastroDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.DbManager.DbManager;
import com.java.entities.Cadastro;
import com.java.exception.DBException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CadDAOImpl implements CadDAO{
	
	Connection conexao = null;
	PreparedStatement sql = null;
	ResultSet result = null;
	
	public void cadastrar (Cadastro cadastrar) throws DBException {
	
		try {
			conexao = DbManager.getConnection();
			sql = conexao.prepareStatement("INSERT INTO T_SIP_CADASTRO(NR_CPF, DS_EMAIL, SENHA, NM_USUARIO, DT_CADASTRO)" + "VALUES(?,?,?,?,?)");
			Long numeroLongo = Long.parseLong(cadastrar.getCpf());
			sql.setLong(1, numeroLongo);
			sql.setString(2, cadastrar.getEmail());
			sql.setString(3, cadastrar.getSenha());
			sql.setString(4, cadastrar.getNomeUsuario());
			LocalDate data = cadastrar.getDtCadastro();
			sql.setDate(5, java.sql.Date.valueOf(data));
			
			
			sql.executeUpdate();
			System.out.println("Dados gravados com sucesso!");
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao gravar as informações no banco de dados!");
			throw new DBException("Erro ao atualizar");
		}finally{
			try {
				conexao.close();
				sql.close();
				System.out.println("Banco de dados Finalizado com sucesso!");
			}catch(SQLException e) {
				e.printStackTrace();
				System.out.println("Não foi possível gravar os dados");
			}
		}
	 }
	
	public List<Cadastro> listar(){
		List<Cadastro> lista = new ArrayList<Cadastro>();
		
		try {
			conexao = DbManager.getConnection();
			
			 sql = conexao.prepareStatement("SELECT * FROM T_SIP_CADASTRO");
			 result = sql.executeQuery();
			 
			 while(result.next()) {
				String cpf = result.getString("NR_CPF"); 
				String email = result.getString("DS_EMAIL");
				String senha = result.getString("SENHA");
				String nome = result.getString("NM_USUARIO");
				Date dataBanco = result.getDate("DT_CADASTRO");
				LocalDate dt_cadastro = dataBanco.toLocalDate();
				
				Cadastro cad = new Cadastro(cpf, email, senha, nome, dt_cadastro);
				
				lista.add(cad);
				
			 }
			 
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conexao.close();
				sql.close();
				result.close();
				System.out.println("Banco de dados Finalizado com sucesso!");
			}catch(SQLException e) {
				e.printStackTrace();
				System.out.println("Não foi possível gravar os dados");
			}
		}
		return lista;
	}
}
