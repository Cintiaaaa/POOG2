package br.com.poo.banco.pessoas;

import java.util.Date;

public class Presidente {
	
	private String nome;
	private String cpf;
	private String email;
	private Date dataNasc;
	private String cargo;
	
	//construtores
	
	public Presidente() {
		
	}
	public Presidente(String nome, String cpf, String email, Date dataNasc, String cargo) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNasc = dataNasc;
		this.cargo = cargo;
	}
	
	// gets
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEmail() {
		return email;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public String getCargo() {
		return cargo;
	}
	
	// set para promover / rebaixar pessoas
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
