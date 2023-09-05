package br.com.poo.banco.pessoas;

import java.util.Date;

public class Diretor {
	
	private String nome;
	private String cpf;
	private String email;
	private Date dataNasc;
	private String cargo;
	
	//construtores
	
	public Diretor() {
		
	}
	public Diretor(String nome, String cpf, String email, Date dataNasc, String cargo) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNasc = dataNasc;
		this.cargo = cargo;
	}
}
