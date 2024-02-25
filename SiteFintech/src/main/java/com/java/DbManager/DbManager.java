package com.java.DbManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbManager {

	public static Connection getConnection() {
				
		Connection conexao = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM98527", "021291");
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possivel se conectar ao banco de dados!");
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("Biblioteca não encontrada!");
			
		}finally {
			System.out.println("Systema acessado com sucesso!");
		}
		return conexao;
	}
}
