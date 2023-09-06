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

	
	public double getSaldo() {
		return saldo;
	}
	//get do rendimento
	public double getRendimento() {
		return rendimento;
	}
		
	// método do rendimento da poupança
	public void gerarRend(){
		double rend = saldo * this.rendimento;
		saldo += rend;	
	}
	
	// informações da conta
	
}
