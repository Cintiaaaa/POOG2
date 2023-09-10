package br.com.poo.banco.pessoas;

import java.util.Date;

public class Diretor extends Funcionario {

	//construtor
	public Diretor() {
		super();
	}

	public Diretor(String nome, String cpf, String email, Date dataNasc, String cargo, double salario, String senha) {
		super(nome, cpf, email, dataNasc, cargo, salario, senha);
	}
	
//	public String getCargo() {
//		return cargo;
//	}
}