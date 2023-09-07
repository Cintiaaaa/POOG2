package br.com.poo.banco.contas;

//definindo atributos da classe.

public class ContaPoupanca extends Conta {
	
	private double rendimento;

// construtores
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String contaId, String agencia, String titular, double saldo) {
		super(contaId, agencia, titular, saldo);
		this.rendimento = 0.006;
	}
	
	public double getSaldoPoupanca() {
		return getSaldo();
	}
	//get do rendimento
	public double getRendimento() {
		return rendimento;
	}
		
	// esse método faz o cálculo do rendimento e atualiza o saldo
	public void gerarRend(){
		double saldoAtual = getSaldo();
		double calculoRendimento = saldoAtual * this.rendimento;
		double novoSaldo = saldoAtual + calculoRendimento;
		setSaldo(novoSaldo);
	}
	
	// informações da conta
	
}