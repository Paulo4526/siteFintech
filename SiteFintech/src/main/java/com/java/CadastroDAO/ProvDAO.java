package com.java.CadastroDAO;

import java.util.List;

import com.java.entities.Proventos;
import com.java.exception.DBException;

public interface ProvDAO {
	public void inserirProv (Proventos inserirProv)throws DBException;
	
	public List <Proventos> listarProv();
	
	public void atualizarProv(Proventos atualizarProv)throws DBException;
	
	public Proventos removerProv(int id);
	
	public Proventos buscarId(int id);
}
