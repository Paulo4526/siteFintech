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
import com.java.entities.Proventos;
import com.java.exception.DBException;

public class ProvDAOImpl implements ProvDAO {

	Connection conexao = null;
	
	PreparedStatement sql = null;
	
	ResultSet result = null;
	
	Proventos prov = null;
	
	public void inserirProv (Proventos inserirProv) throws DBException {
		try {
			conexao = DbManager.getConnection();
			
			sql = conexao.prepareStatement("INSERT INTO T_SIP_PROVENTOS (CD_PROVENTOS, NR_CPF, DS_PROVENTOS, VL_PROVENTOS, DT_RECEBIMENTO, DS_OBSERVACAO)" + "VALUES(SQ_TB_PROVENTOS.NEXTVAL, ?,?,?,?,?)");
			Long numeroLongo = Long.parseLong(inserirProv.getCpf());
			sql.setLong(1, numeroLongo);
			sql.setString(2, inserirProv.getDsProventos());
			sql.setDouble(3, inserirProv.getVlProventos());
			LocalDate data = inserirProv.getDtProventos();
			sql.setDate(4, java.sql.Date.valueOf(data));
			sql.setString(5, inserirProv.getDsAdicionais());
			sql.executeUpdate();
			
			System.out.println("Cadastro Realizado com sucesso!");
			
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
	
	public List <Proventos> listarProv(){
		List <Proventos> lista = new ArrayList<Proventos>();
		
		try {
			
			conexao = DbManager.getConnection();
			
			sql = conexao.prepareStatement("SELECT * FROM T_SIP_PROVENTOS");
			
			result = sql.executeQuery();
			
			while(result.next()) {
				int cd = result.getInt("CD_PROVENTOS");
				String cpf = result.getString("NR_CPF");
				String dsProventos = result.getString("DS_PROVENTOS");
				double valor = result.getDouble("VL_PROVENTOS");
				Date dataBanco = result.getDate("DT_RECEBIMENTO");
				LocalDate data = dataBanco.toLocalDate();
				String dsAdicionais = result.getString("DS_OBSERVACAO");
				
				Proventos prov = new Proventos(cd, cpf, dsProventos, valor, data, dsAdicionais);
				lista.add(prov);
			}
			System.out.println("Dados pesquisados com sucesso!");
			
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
		return lista;
	}
	
	public void atualizarProv(Proventos atualizarProv)throws DBException{
		try {
			
			System.out.println("Atualização realizada!");
			conexao = DbManager.getConnection();
			
			sql = conexao.prepareStatement("UPDATE T_SIP_PROVENTOS SET NR_CPF =?, DS_PROVENTOS = ?, VL_PROVENTOS= ?, DT_RECEBIMENTO = ?, DS_OBSERVACAO = ? WHERE CD_PROVENTOs = ?");
			
			Long numeroLongo = Long.parseLong(atualizarProv.getCpf());
			sql.setLong(1, numeroLongo);
			sql.setString(2, atualizarProv.getDsProventos());
			sql.setDouble(3, atualizarProv.getVlProventos());
			LocalDate data = atualizarProv.getDtProventos();
			sql.setDate(4, java.sql.Date.valueOf(data));
			sql.setString(5, atualizarProv.getDsAdicionais());
			sql.setInt(6, atualizarProv.getCdProvento());
			sql.executeUpdate();
			
			
			
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
	
	public Proventos removerProv(int id){
		try {
			conexao = DbManager.getConnection();
			
			sql = conexao.prepareStatement("DELETE FROM T_SIP_PROVENTOS WHERE CD_PROVENTOS = ?");
			
			sql.setInt(1, id);
			
			sql.executeUpdate();
			
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
		return prov;
	}
	
	public Proventos buscarId(int id) {
		try {
			
			
			conexao = DbManager.getConnection();
			
			sql = conexao.prepareStatement("SELECT * FROM T_SIP_PROVENTOS WHERE CD_PROVENTOS = ?");
			sql.setInt(1, id);
			result = sql.executeQuery();
			
			if(result.next()) {
				int cd = result.getInt("CD_PROVENTOS");
				String cpf = result.getString("NR_CPF");
				String dsProventos = result.getString("DS_PROVENTOS");
				double valor = result.getDouble("VL_PROVENTOS");
				Date dataBanco = result.getDate("DT_RECEBIMENTO");
				LocalDate data = dataBanco.toLocalDate();
				String dsAdicionais = result.getString("DS_OBSERVACAO");
				
				prov = new Proventos(cd, cpf, dsProventos, valor, data, dsAdicionais);
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
		return prov;
	}
}
	

