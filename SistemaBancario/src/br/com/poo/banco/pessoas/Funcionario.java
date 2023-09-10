package br.com.poo.banco.pessoas;

import java.util.Date;

public class Funcionario  {

	protected String nome;
	private String cpf;
	private String email;
	private Date dataNasc;
	private String cargo;
	private double salario;
	private String senha;
	
	//construtor
	public Funcionario() {
		
	}
	public Funcionario(String nome, String cpf, String email, Date dataNasc, String cargo, double salario, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNasc = dataNasc;
		this.cargo = cargo;
		this.salario = salario;
		this.senha = senha;
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		if (this.cargo == "presidente") {
			this.cargo = cargo;			
		}
	}
}