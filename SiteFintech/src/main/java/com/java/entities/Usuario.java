package com.java.entities;

public class Usuario {
	private String cpf;
	private String apelido;
	private String profissao;
	private double salario;
	
	
	public Usuario (String cpf, String apelido, String profissao, double salario) {
		super();
		this.cpf = cpf;
		this.apelido = apelido;
		this.profissao = profissao;
		this.salario = salario;
	}
	
	public Usuario () {
		
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Usuario [cpf=" + cpf + ", apelido=" + apelido + ", profissao=" + profissao + ", salario=" + salario
				+ "]";
	}
	
	
	
	
}
