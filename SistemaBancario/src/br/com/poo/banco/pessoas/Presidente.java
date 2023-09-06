package br.com.poo.banco.pessoas;
import java.util.logging.Logger;

import java.util.Date;
import java.util.logging.Level;

public class Presidente extends Funcionario{
	private Funcionario funcionario;
	
	public Presidente() {
		super();

	}
	public Presidente(String nome, String cpf, String email, Date dataNasc, String cargo) {
		super(nome, cpf, email, dataNasc, cargo);
		this.funcionario = funcionario;
	}
	
	// gets
	public String getNome() {
		return nome;
	}

	public Funcionario mudaCargo(Funcionario func, String cargo) {
		func.cargo = cargo;
		return func;
	}
}

