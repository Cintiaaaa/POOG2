package br.com.poo.banco.pessoas;

import java.util.Date;

public class Presidente extends Funcionario{
	
	public Presidente() {
		super();

	}
	public Presidente(String nome, String cpf, String email, Date dataNasc, String cargo) {
		super(nome, cpf, email, dataNasc, cargo);
	}
	
	// gets
	public String getNome() {
		return this.getNome();
	}
	public String getCpf() {
		return cpf;
	}
	public String getEmail() {
		return email;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public String getCargo() {
		return cargo;
	}
	
	// set para promover / rebaixar pessoas
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
