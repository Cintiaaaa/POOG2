package br.com.poo.banco.contas;

//definindo atributos da classe.

public class ContaPoupanca {
	
	private double rendimento;

// construtores
	
	public ContaPoupanca() 
	{
		
	}
	
	public ContaPoupanca(String contaId, String agencia, String titular, double saldo, double rendimento) 
	{
		this.contaId = contaId;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;
		this.rendimento = rendimento;
	}
	
	// método do rendimento da poupança
	
//	public void gerarRend()
//	{
//		this.saldo += saldo * 0.006;
//	}
	
	// informações da conta
	
	public String toString() {
		return "Número da conta: "+contaId+".\nAgência: "+agencia+".\nTitular: "+titular+".\nSaldo: R$"+saldo+".\nRendimento: "+rendimento+".";
	}

}
