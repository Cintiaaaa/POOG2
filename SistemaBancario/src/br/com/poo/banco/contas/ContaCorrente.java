package br.com.poo.banco.contas;

//definindo atributos da classe.

public class ContaCorrente {
	
	private String contaId;
	private String agencia;
	private String titular;
	private double saldo;
	private double chequeEspecial;
	private boolean clienteVIP;
	
	// construtores

	public ContaCorrente() 
	{
		
	}
	
	public ContaCorrente(String contaId, String agencia, String titular, double saldo, double chequeEspecial, boolean clienteVIP) 
	{
		this.contaId = contaId;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;
		this.chequeEspecial = chequeEspecial;
		this.clienteVIP = clienteVIP;
	}
	
	public String toString() {
		return "Número da conta: "+contaId+".\nAgência: "+agencia+".\nTitular: "+titular+".\nSaldo: R$"+saldo+".\nCheque Especial: "+chequeEspecial+".\nCliente VIP: "+clienteVIP+".";
	}

}
