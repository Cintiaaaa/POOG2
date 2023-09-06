package br.com.poo.banco.pessoas;

import java.util.Date;

public class Diretor extends Funcionario {

	//construtor
	public Diretor() {
		super();
	}

	public Diretor(String nome, String cpf, String email, Date dataNasc, String cargo) {
		super(nome, cpf, email, dataNasc, cargo);
	}
}
