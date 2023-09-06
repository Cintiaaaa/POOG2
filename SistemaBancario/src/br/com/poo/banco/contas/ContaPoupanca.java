package br.com.poo.banco.contas;

//definindo atributos da classe.

public class ContaPoupanca extends Conta {
	
	private double rendimento;

// construtores
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String contaId, String agencia, String titular, double saldo, double rendimento) {
		super(contaId, agencia, titular, saldo);
		this.rendimento = rendimento;
	}

	
	//get do rendimento
		public double getRendimento() {
			return rendimento;
		}
		
//	// método do rendimento da poupança
//	public void gerarRend(){
//		this.getSaldo() += getSaldo() * 0.006;
//	}
	
	// informações da conta
	
}
