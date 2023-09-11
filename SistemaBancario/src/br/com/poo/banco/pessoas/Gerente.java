package br.com.poo.banco.pessoas;

import java.util.Date;

public class Gerente extends Funcionario {

	String agencia;

	public Gerente() {
		super();

	}

	public Gerente(String nome, String cpf, String email, Date dataNasc, String cargo, double salario, String senha,
			String agencia) {
		super(nome, cpf, email, dataNasc, cargo, salario, senha);
		this.agencia = agencia;
	}

}

//gets sets
