package br.com.poo.banco.contas;
import br.com.poo.banco.pessoas.Cliente;

//definindo atributos da classe.

public class ContaPoupanca extends Conta {
	
	private double rendimento;

// construtores
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String contaId, String agencia, String cpf, String senha) {
		super(contaId, agencia, cpf, senha);
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