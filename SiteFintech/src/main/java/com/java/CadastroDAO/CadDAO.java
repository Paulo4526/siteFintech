package com.java.CadastroDAO;


import java.util.List;

import com.java.entities.Cadastro;
import com.java.exception.DBException;

public interface CadDAO {
	public void cadastrar(Cadastro cadastrar) throws DBException;
	
	public List<Cadastro> listar();
	
	
}
