package com.java.CadastroDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.java.DbManager.DbManager;
import com.java.entities.Investimento;
import com.java.exception.DBException;

public class InvesDAOImpl implements InvesDAO{
	
	Connection conexao = null;
	
	PreparedStatement sql = null;
	
	ResultSet result = null;
	
	Investimento invest = null;
	
	public void inserirInves (Investimento inserirInves) throws DBException{
		
		try {
			conexao = DbManager.getConnection();
			
			sql = conexao.prepareStatement("INSERT INTO T_SIP_INVESTIMENTOS (CD_INVESTIMENTO, NR_CPF, DS_INVESTIMENTO, VL_INVESTIMENTO, DT_INVESTIMENTO, DS_OBSERVACAO)" + "VALUES(SQ_TB_INVESTIMENTO.NEXTVAL, ?,?,?,?,?)");
			Long numeroLongo = Long.parseLong(inserirInves.getCpf());
			sql.setLong(1, numeroLongo);
			sql.setString(2, inserirInves.getDsInvestimento());
			sql.setDouble(3, inserirInves.getVlInvestimento());
			LocalDate date = inserirInves.getDtInvestimento();
			sql.setDate(4, java.sql.Date.valueOf(date));
			sql.setString(5, inserirInves.getDsAdicionais());
			sql.executeUpdate();
			
			System.out.println("Dados inseridos com sucesso!");
			
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.err.println("Não foi possível acessar o banco de dados!");
			throw new DBException("Erro ao atualizar");
			
		}finally {
			try {
				conexao.close();
				sql.close();
				System.out.println("Servidor encerrado com sucesso!");
			}catch(SQLException e) {
				e.printStackTrace();
				System.err.println("Não foi possível encerrar o servidor.");
			}
		}
	}
	
	public List<Investimento> ListarInv(){
		List<Investimento> lista = new ArrayList<Investimento>();
		
		try {
			conexao = DbManager.getConnection();
			sql = conexao.prepareStatement("SELECT * FROM T_SIP_INVESTIMENTOS");
			result = sql.executeQuery();
			
			while(result.next()) {
				int codigo = result.getInt("CD_INVESTIMENTO");
				String cpf = result.getString("NR_CPF");
				String investimento = result.getString("DS_INVESTIMENTO");
				double vlInvestimento = result.getDouble("VL_INVESTIMENTO");
				Date dataBanco = result.getDate("DT_INVESTIMENTO");
				LocalDate data = dataBanco.toLocalDate();
				String dsAdicionais = result.getString("DS_OBSERVACAO");
				
				Investimento inv = new Investimento(codigo, cpf, investimento, vlInvestimento, data, dsAdicionais);
				lista.add(inv);
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.err.println("Não foi possível acessar o banco de dados!");
			
		}finally {
			try {
				conexao.close();
				sql.close();
				System.out.println("Servidor encerrado com sucesso!");
			}catch(SQLException e) {
				e.printStackTrace();
				System.err.println("Não foi possível encerrar o servidor.");
			}
		}
		return lista;
	}

	public void atualizarInves(Investimento atualizarInves)throws DBException{
		try {
			
			conexao = DbManager.getConnection();
			
			sql = conexao.prepareStatement("UPDATE T_SIP_INVESTIMENTOS SET NR_CPF =?, DS_INVESTIMENTO = ?, VL_INVESTIMENTO= ?, DT_INVESTIMENTO = ?, DS_OBSERVACAO = ? WHERE CD_INVESTIMENTO = ?");
			
			Long numeroLongo = Long.parseLong(atualizarInves.getCpf());
			sql.setLong(1, numeroLongo);
			sql.setString(2, atualizarInves.getDsInvestimento());
			sql.setDouble(3, atualizarInves.getVlInvestimento());
			LocalDate data = atualizarInves.getDtInvestimento();
			sql.setDate(4, java.sql.Date.valueOf(data));
			sql.setString(5, atualizarInves.getDsAdicionais());
			sql.setInt(6, atualizarInves.getCdInvestimento());
			sql.executeUpdate();
			
			System.out.println("Dados atualizados com sucesso!");
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw new DBException("Erro ao atualizar");
		}finally {
			try {
				conexao.close();
				sql.close();
				System.out.println("Servidor encerrado com sucesso!");
			}catch(SQLException e) {
				e.printStackTrace();
				System.err.println("Não foi possível encerrar o servidor.");
			}
				
		}
	}
	
	public Investimento removerInves(int id){
		try {
			conexao = DbManager.getConnection();
			
			sql = conexao.prepareStatement("DELETE FROM T_SIP_INVESTIMENTOS WHERE CD_INVESTIMENTO = ?");
			
			sql.setInt(1, id);
			
			sql.executeUpdate();
			
			System.out.println("Investimento excluido com sucesso!");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conexao.close();
				sql.close();
				System.out.println("Servidor encerrado com sucesso!");
			}catch(SQLException e) {
				e.printStackTrace();
				System.err.println("Não foi possível encerrar o servidor.");
			}
				
		}
		return invest;
	}
	
	public Investimento buscarId(int id){
try {
			
			conexao = DbManager.getConnection();
			
			sql = conexao.prepareStatement("SELECT * FROM T_SIP_INVESTIMENTOS WHERE CD_INVESTIMENTO = ?");
			sql.setInt(1, id);
			result = sql.executeQuery();
			
			if(result.next()) {
				int cd = result.getInt("CD_INVESTIMENTO");
				String cpf = result.getString("NR_CPF");
				String dsProventos = result.getString("DS_INVESTIMENTO");
				double valor = result.getDouble("VL_INVESTIMENTO");
				Date dataBanco = result.getDate("DT_INVESTIMENTO");
				LocalDate data = dataBanco.toLocalDate();
				String dsAdicionais = result.getString("DS_OBSERVACAO");
				
				invest = new Investimento(cd, cpf, dsProventos, valor, data, dsAdicionais);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conexao.close();
				sql.close();
				result.close();
				System.out.println("Servidor encerrado com sucesso!");
			}catch(SQLException e) {
				e.printStackTrace();
				System.err.println("Não foi possível encerrar o servidor.");
			}
		}
		return invest;
	}
}
