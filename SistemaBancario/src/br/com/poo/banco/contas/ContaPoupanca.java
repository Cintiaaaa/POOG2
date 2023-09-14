package br.com.poo.banco.contas;
import br.com.poo.banco.pessoas.Cliente;

//definindo atributos da classe.

public class ContaPoupanca extends Conta {
	
	private Double rendimento;

// construtores
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String tipo, String contaId, String agencia, String cpf, String senha, Double saldo) {
		super(tipo, contaId, agencia, cpf, senha, saldo);
		this.rendimento = 0.006;
	}
	
	public Double getSaldoPoupanca() {
		return getSaldo();
	}
	//get do rendimento
	public Double getRendimento() {
		return rendimento;
	}
	
	// método rendimento por dias
	// rende 0,02% ao dia
	
		public void gerarRend(double valor, int dias) {
			double rendimento = (0.00002 * dias);
			
			//de onde vem o valor e os dias
			//criar um scanner para ler valor e dias
			
			double valorRendido = valor * rendimento;
			double saldoAtualizado = valor + valorRendido;
			
		}
	
	// informações da conta
	
}