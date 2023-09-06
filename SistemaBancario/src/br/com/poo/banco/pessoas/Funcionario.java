package br.com.poo.banco.pessoas;

import java.util.Date;

public class Funcionario  {

	protected String nome;
	private String cpf;
	private String email;
	private Date dataNasc;
	protected String cargo;
	
	//construtor
	public Funcionario() {
		
	}
	public Funcionario(String nome, String cpf, String email, Date dataNasc, String cargo) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNasc = dataNasc;
		this.cargo = cargo;
	}
	
}
