package br.com.poo.banco.pessoas;

import java.util.Date;

public class Presidente {
	
	private String nome;
	private String cpf;
	private String email;
	private Date dataNasc;
	
	//construtores
	
	public Presidente() {
		
	}
	public Presidente(String nome, String cpf, String email, Date dataNasc) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNasc = dataNasc;
	}
}
