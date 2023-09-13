package br.com.poo.banco.pessoas;

import java.util.Date;

public class Diretor extends Funcionario {

	//construtor
	public Diretor() {
		super();
	}

	public Diretor(String nome, String cpf, String email, String cargo, Double salario, String senha) {
		super(nome, cpf, email, cargo, salario, senha);
	}
	
//	public String getCargo() {
//		return cargo;
//	}
}