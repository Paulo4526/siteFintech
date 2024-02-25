package com.java.CadastroDAO;

import java.util.List;

import com.java.entities.Gastos;
import com.java.exception.DBException;

public interface GastoDAO {
	public void inserirGastos (Gastos inserirGastos)throws DBException;
	
	public List<Gastos> listaGastos();
	
	public void atualizarGasto(Gastos atualizarGasto)throws DBException;
	
	public Gastos removerGasto(int id);
	
	public Gastos buscarId(int id);
}
