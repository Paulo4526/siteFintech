package com.java.entities;

import java.time.LocalDate;

public class Proventos {
	private int cdProvento;
	private String cpf;
	private String dsProventos;
	private double vlProventos;
	private LocalDate dtProventos;
	private String dsAdicionais;
	
	
	public Proventos() {
		
	}
	
	public Proventos (int cdProvento) {
		super();
		this.cdProvento = cdProvento;
	}
	
	public Proventos (String cpf, String dsProventos, double vlProventos, LocalDate dtProventos, String dsAdicionais) {
		super();
		this.cpf = cpf;
		this.dsProventos = dsProventos;
		this.vlProventos = vlProventos;
		this.dtProventos = dtProventos;
		this.setDsAdicionais(dsAdicionais);
	}
	
	public Proventos (int cdProvento, String cpf, String dsProventos, double vlProventos, LocalDate dtProventos, String dsAdicionais ) {
		super();
		this.cdProvento = cdProvento;
		this.cpf = cpf;
		this.dsProventos = dsProventos;
		this.vlProventos = vlProventos;
		this.dtProventos = dtProventos;
		this.setDsAdicionais(dsAdicionais);
		
	}
	
	
	
	

	public int getCdProvento() {
		return cdProvento;
	}

	public void setCdProvento(int cdProvento) {
		this.cdProvento = cdProvento;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDsProventos() {
		return dsProventos;
	}
	public void setDsProventos(String dsProventos) {
		this.dsProventos = dsProventos;
	}
	public double getVlProventos() {
		return vlProventos;
	}
	public void setVlProventos(double vlProventos) {
		this.vlProventos = vlProventos;
	}
	public LocalDate getDtProventos() {
		return dtProventos;
	}
	public void setDtProventos(LocalDate dtProventos) {
		this.dtProventos = dtProventos;
	}

	public String getDsAdicionais() {
		return dsAdicionais;
	}

	public void setDsAdicionais(String dsAdicionais) {
		this.dsAdicionais = dsAdicionais;
	}

	@Override
	public String toString() {
		return "Proventos [cpf=" + cpf + ", dsProventos=" + dsProventos + ", vlProventos=" + vlProventos
				+ ", dtProventos=" + dtProventos.toString() + ", dsAdicionais=" + dsAdicionais + "cdProvento" + cdProvento + "]";
	}
	
	
	
	
	
	
}
