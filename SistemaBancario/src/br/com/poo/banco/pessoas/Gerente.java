package br.com.poo.banco.pessoas;

import java.util.Date;

public class Gerente extends Funcionario {

	String agencia;

	public Gerente() {
		super();

	}

	public Gerente(String nome, String cpf, String email, String cargo, Double salario, String senha,
			String agencia) {
		super(nome, cpf, email, cargo, salario, senha);
		this.agencia = agencia;
	}

}

//gets sets
