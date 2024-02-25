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
import com.java.entities.Gastos;
import com.java.exception.DBException;

public class GastoDAOImpl implements GastoDAO{
	
	Connection conexao = null;
	
	PreparedStatement sql = null;
	
	ResultSet result = null;
	
	Gastos gasto = null;
	
	public void inserirGastos (Gastos inserirGastos) throws DBException {
		try {
			conexao = DbManager.getConnection();
			
			sql = conexao.prepareStatement("INSERT INTO T_SIP_GASTOS(CD_GASTOS, NR_CPF, DS_GASTOS, VL_GASTOS, DT_GASTOS, DS_OBSERVACAO)" + "VALUES(SQ_TB_GASTOS.NEXTVAL, ?,?,?,?,?)");
			Long numeroLongo = Long.parseLong(inserirGastos.getCpf());
			sql.setLong(1, numeroLongo);
			sql.setString(2, inserirGastos.getDsGastos());
			sql.setDouble(3, inserirGastos.getVlGastos());
			LocalDate date = inserirGastos.getDtGasto();
			sql.setDate(4, java.sql.Date.valueOf(date));
			sql.setString(5, inserirGastos.getDsAdicionais());
			sql.executeUpdate();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao gravar as informações no banco de dados!");
			throw new DBException("Erro ao atualizar");
		}finally {
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
	
	public List<Gastos> listaGastos(){
		List<Gastos> lista = new ArrayList<Gastos>(); 
		
		try {
			conexao = DbManager.getConnection();
			sql = conexao.prepareStatement("SELECT * FROM T_SIP_GASTOS");
			result = sql.executeQuery();
			
			while(result.next()) {
				int codigo = result.getInt("CD_GASTOS");
				String cpf = result.getString("NR_CPF");
				String dsGastos = result.getString("DS_GASTOS");
				double vlGastos = result.getDouble("VL_GASTOS");
				Date dataBanco = result.getDate("DT_GASTOS");
				LocalDate data = dataBanco.toLocalDate();
				String dsAdicionais = result.getString("DS_OBSERVACAO");
				
				Gastos add = new Gastos(codigo, cpf, dsGastos, vlGastos, data, dsAdicionais);
				lista.add(add);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao gravar as informações no banco de dados!");
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
	
	public void atualizarGasto(Gastos atualizarGasto)throws DBException{
		try {
			
			conexao = DbManager.getConnection();
			
			sql = conexao.prepareStatement("UPDATE T_SIP_GASTOS SET NR_CPF =?, DS_GASTOS = ?, VL_GASTOS= ?, DT_GASTOS = ?, DS_OBSERVACAO = ? WHERE CD_GASTOS = ?");
			
			Long numeroLongo = Long.parseLong(atualizarGasto.getCpf());
			sql.setLong(1, numeroLongo);
			sql.setString(2, atualizarGasto.getDsGastos());
			sql.setDouble(3, atualizarGasto.getVlGastos());
			LocalDate data = atualizarGasto.getDtGasto();
			sql.setDate(4, java.sql.Date.valueOf(data));
			sql.setString(5, atualizarGasto.getDsAdicionais());
			sql.setInt(6, atualizarGasto.getCdGasto());
			sql.executeUpdate();
			
			System.out.println("Gastos atualizados com sucesso!");
			
			
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
	
	public Gastos removerGasto(int id){
		try {
			conexao = DbManager.getConnection();
			
			sql = conexao.prepareStatement("DELETE FROM T_SIP_GASTOS WHERE CD_GASTOS = ?");
			
			sql.setInt(1, id);
			
			sql.executeUpdate();
			
			System.out.println("Gasto excluido com sucesso!");
			
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
		return gasto;
	}
	
	public Gastos buscarId(int id) {
		try {
			
			conexao = DbManager.getConnection();
			
			sql = conexao.prepareStatement("SELECT * FROM T_SIP_GASTOS WHERE CD_GASTOS = ?");
			sql.setInt(1, id);
			result = sql.executeQuery();
			
			if(result.next()) {
				int cd = result.getInt("CD_GASTOS");
				String cpf = result.getString("NR_CPF");
				String dsProventos = result.getString("DS_GASTOS");
				double valor = result.getDouble("VL_GASTOS");
				Date dataBanco = result.getDate("DT_GASTOS");
				LocalDate data = dataBanco.toLocalDate();
				String dsAdicionais = result.getString("DS_OBSERVACAO");
				
				gasto = new Gastos(cd, cpf, dsProventos, valor, data, dsAdicionais);
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
		return gasto;
	}
}
