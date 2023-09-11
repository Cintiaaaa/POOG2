package br.com.poo.banco.contas;

import br.com.poo.banco.pessoas.Cliente;

//definindo atributos da classe.

public class ContaCorrente extends Conta {

	private double chequeEspecial;
	private boolean clienteVIP;

	// construtores

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String contaId, String agencia, String cpf, String senha, double chequeEspecial,
			double saldo) {
		super(contaId, agencia, cpf, senha, saldo);
		this.chequeEspecial = chequeEspecial;

		Conta cc = new Conta();
		cc.getSaldo();

	}

	// método de cobrança de taxa

	public void gerarTaxa() {
		double novoSaldo = this.getSaldo() - 13.90;
		this.setSaldo(novoSaldo);

	}

	// gets e sets

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	// informações da conta

}
