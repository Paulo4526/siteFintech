package com.java.entities;

import java.time.LocalDate;

public class Investimento {

	private int cdInvestimento;
	private String cpf;
	private String dsInvestimento;
	private double vlInvestimento;
	private LocalDate dtInvestimento;
	private String dsAdicionais;
	
	
	

	public Investimento () {
		super();
	}
	
	public Investimento(String cpf, String dsInvestimento, double vlInvestimento, LocalDate dtInvestimento, String dsAdicionais) {
		super();
		this.cpf = cpf;
		this.dsInvestimento = dsInvestimento;
		this.vlInvestimento = vlInvestimento;
		this.dtInvestimento = dtInvestimento;
		this.dsAdicionais = dsAdicionais;
		
	}
	
	public Investimento(int cdInvestimento, String cpf, String dsInvestimento, double vlInvestimento, LocalDate dtInvestimento, String dsAdicionais) {
		super();
		this.cpf = cpf;
		this.dsInvestimento = dsInvestimento;
		this.vlInvestimento = vlInvestimento;
		this.dtInvestimento = dtInvestimento;
		this.dsAdicionais = dsAdicionais;
		this.cdInvestimento = cdInvestimento;
		
	}
	
	
	
	public int getCdInvestimento() {
		return cdInvestimento;
	}

	public void setCdInvestimento(int cdInvestimento) {
		this.cdInvestimento = cdInvestimento;
	}

	public void setDtInvestimento(LocalDate dtInvestimento) {
		this.dtInvestimento = dtInvestimento;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDsInvestimento() {
		return dsInvestimento;
	}
	public void setDsInvestimento(String dsInvestimento) {
		this.dsInvestimento = dsInvestimento;
	}
	public double getVlInvestimento() {
		return vlInvestimento;
	}
	public void setVlInvestimento(double vlInvestimento) {
		this.vlInvestimento = vlInvestimento;
	}
	public LocalDate getDtInvestimento() {
		return dtInvestimento;
	}
	public void setDtIvestimento(LocalDate dtInvestimento) {
		this.dtInvestimento = dtInvestimento;
	}
	public String getDsAdicionais() {
		return dsAdicionais;
	}
	public void setDsAdicionais(String dsAdicionais) {
		this.dsAdicionais = dsAdicionais;
	}

	@Override
	public String toString() {
		return "Investimento [cdInvestimento=" + cdInvestimento + ", cpf=" + cpf + ", dsInvestimento=" + dsInvestimento
				+ ", vlInvestimento=" + vlInvestimento + ", dtInvestimento=" + dtInvestimento.toString() + ", dsAdicionais="
				+ dsAdicionais + "]";
	}

	
	
	
	
	
}
