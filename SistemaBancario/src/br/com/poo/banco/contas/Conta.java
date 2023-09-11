package br.com.poo.banco.contas;

import java.util.logging.Level;
import java.util.logging.Logger;
import br.com.poo.banco.pessoas.Cliente;

public class Conta {

	private String contaId;
	private String agencia;
	private String senha;
	private double saldo;
	private String cpf;

	private static Logger logger = Logger.getLogger(Conta.class.getName());

	// construtores

	public Conta() {

	} 

	public Conta(String contaId, String agencia, String cpf, String senha) {
		this.contaId = contaId;
		this.agencia = agencia;
		this.saldo = 0.00;
		this.cpf = cpf;
		this.senha = senha;
	}

	public Boolean logIn(String cpf, String senha) {

		if (this.cpf.equals(cpf) && this.senha.equals(senha)) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
	
	// gets e sets

	public String getSenha() {
		return senha;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getContaId() {
		return contaId;
	}

	public String getAgencia() {
		return agencia;
	}

//	public Cliente getTitular() {
//		return titular;
//	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// informações da conta

	public static Logger getLogger() {
		return logger;
	}

	public String toString() {
		return "Número da conta: " + contaId + ".\nAgência: " + agencia + ".";
	}

	// logger para exibir infos no sistema interno

	public String informa() {
		logger.log(Level.INFO, "Número da conta: {0}.\nAgência: {1}.\nTitular: {2}.",
				new Object[] { contaId, agencia});
		return contaId;
	}

}