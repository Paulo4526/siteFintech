package com.java.CadastroDAO;

import java.util.List;

import com.java.entities.Investimento;
import com.java.exception.DBException;

public interface InvesDAO {
	public void inserirInves (Investimento inserirInves)throws DBException;
	
	public List<Investimento> ListarInv();
	
	public void atualizarInves(Investimento atualizarInves)throws DBException;
	
	public Investimento removerInves(int id);
	
	public Investimento buscarId(int id);
}
