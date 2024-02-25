package com.java.entities;

import java.time.LocalDate;

public class Cadastro {
	
	private String cpf;
	private String email;
	private String senha;
	private String nomeUsuario;
	private LocalDate dtCadastro;
	
	public Cadastro () {
		super();
	}
	
	public Cadastro (String cpf, String email, String senha, String nomeUsuario, LocalDate dtCadastro) {
		super();
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		this.nomeUsuario = nomeUsuario;
		this.dtCadastro = dtCadastro;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public LocalDate getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(LocalDate dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	@Override
	public String toString() {
		return "Cadastro [cpf=" + cpf + ", email=" + email + ", senha=" + senha + ", nomeUsuario=" + nomeUsuario
				+ ", dtCadastro=" + dtCadastro.toString() + "]";
	}
	
	
	
	
	
}
