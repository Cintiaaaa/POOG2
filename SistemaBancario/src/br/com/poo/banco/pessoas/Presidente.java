package br.com.poo.banco.pessoas;
import java.util.logging.Logger;

import java.util.Date;
import java.util.logging.Level;

public class Presidente extends Funcionario{
	
	public Presidente() {
		super();

	}
	public Presidente(String nome, String cpf, String email, String cargo, Double salario, String senha) {
		super(nome, cpf, email, cargo, salario, senha);
	}
	
	// gets
	public String getNome() {
		return nome;
	}

	public Funcionario mudaCargo(Funcionario func, String novoCargo) {
		func.setCargo(novoCargo);
		return func;
	}
}