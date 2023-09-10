package br.com.poo.banco.pessoas;

import java.util.Date;

public class Cliente {

	private String nome;
	private String cpf;
	private String email;
	private Date dataNasc;
	// private String senha;

	// construtores

	public Cliente() {

	}

	public Cliente(String nome, String cpf, String email, Date dataNasc) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNasc = dataNasc;
		// this.senha = senha;
	}

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

}
