package br.com.poo.banco.pessoas;

import java.util.Date;

public class Gerente {

	private String nome;
	private String cpf;
	private String email;
	private Date dataNasc;

	//construtores
	
	public Gerente() {
		
	}
	public Gerente(String nome, String cpf, String email, Date dataNasc) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNasc = dataNasc;
	}
}
