package br.com.poo.banco.contas;

import br.com.poo.banco.pessoas.Cliente;

//definindo atributos da classe.

public class ContaCorrente extends Conta {

	private Double chequeEspecial;
	private boolean clienteVIP;

	// construtores

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String tipo, String contaId, String agencia, String cpf, String senha, Double saldo, Double chequeEspecial) {
		super(tipo, contaId, agencia, cpf, senha, saldo);
		this.chequeEspecial = chequeEspecial;

	}

	// método de cobrança de tarifa

	public void gerarTarifa() {
		double novoSaldo = this.getSaldo() - 13.90;
		this.setSaldo(novoSaldo);

	}

	// gets e sets

	public void setChequeEspecial(Double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	// informações da conta

}
