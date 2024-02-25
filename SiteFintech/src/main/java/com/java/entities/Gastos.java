package com.java.entities;


import java.time.LocalDate;

public class Gastos {
	private int cdGasto;
	private String cpf;
	private String dsGastos;
	private double vlGastos;
	private LocalDate dtGasto;
	private String dsAdicionais;
	
	public Gastos(int cdGasto, String cpf, String DsGastos, double VlGastos, LocalDate DtGasto, String DsAdicionais) {
		super();
		this.cpf = cpf;
		this.dsGastos = DsGastos;
		this.vlGastos = VlGastos;
		this.dtGasto = DtGasto;
		this.dsAdicionais = DsAdicionais;
		this.cdGasto = cdGasto;
	}
	
	
	
	public Gastos(String cpf, String DsGastos, double VlGastos, LocalDate DtGasto, String DsAdicionais) {
		super();
		this.cpf = cpf;
		this.dsGastos = DsGastos;
		this.vlGastos = VlGastos;
		this.dtGasto = DtGasto;
		this.dsAdicionais = DsAdicionais;
	}
	
	
	public Gastos(int cdGastos) {
		super();
		this.cdGasto = cdGastos;
	}
	
	public Gastos() {
		
	}
	
	
	public int getCdGasto() {
		return cdGasto;
	}

	public void setCdGasto(int cdGasto) {
		this.cdGasto = cdGasto;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDsGastos() {
		return dsGastos;
	}
	public void setDsGastos(String dsGastos) {
		this.dsGastos = dsGastos;
	}
	public double getVlGastos() {
		return vlGastos;
	}
	public void setVlGastos(double vlGastos) {
		this.vlGastos = vlGastos;
	}
	public LocalDate getDtGasto() {
		return dtGasto;
	}
	public void setDtGasto(LocalDate dtGasto) {
		this.dtGasto = dtGasto;
	}
	public String getDsAdicionais() {
		return dsAdicionais;
	}
	public void setDsAdicionais(String dsAdicionais) {
		this.dsAdicionais = dsAdicionais;
	}



	@Override
	public String toString() {
		return "Gastos [cdGasto=" + cdGasto + ", cpf=" + cpf + ", DsGastos=" + dsGastos + ", VlGastos=" + vlGastos
				+ ", DtGasto=" + dtGasto.toString() + ", DsAdicionais=" + dsAdicionais + "]";
	}

	

	
	
	
	
	
	
}
