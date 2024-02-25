package com.java.FactoryDAO;

import com.java.CadastroDAO.CadDAO;
import com.java.CadastroDAO.CadDAOImpl;
import com.java.CadastroDAO.GastoDAO;
import com.java.CadastroDAO.GastoDAOImpl;
import com.java.CadastroDAO.InvesDAO;
import com.java.CadastroDAO.InvesDAOImpl;
import com.java.CadastroDAO.ProvDAO;
import com.java.CadastroDAO.ProvDAOImpl;
import com.java.CadastroDAO.UsuDAO;
import com.java.CadastroDAO.UsuDAOImpl;

public class FactoryDAO {
	public static CadDAO getCadDAO() {
		return new CadDAOImpl();
	}
	
	public static UsuDAO getUsuDAO() {
		return new UsuDAOImpl();
	}
	
	public static GastoDAO getGastos() {
		return new GastoDAOImpl();
	}
	
	public static InvesDAO getInves() {
		return new InvesDAOImpl();
	}
	
	public static ProvDAO getProv() {
		return new ProvDAOImpl();
	}
}
