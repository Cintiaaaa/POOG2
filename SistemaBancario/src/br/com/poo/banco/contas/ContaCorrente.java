package br.com.poo.banco.contas;

//definindo atributos da classe.

public class ContaCorrente extends Conta {
	
	private double chequeEspecial;
	private boolean clienteVIP;
	
	// construtores
	
	public ContaCorrente() {
		super();
    }

	public ContaCorrente(String contaId, String agencia, String titular, double saldo, double chequeEspecial) {
		super(contaId, agencia, titular, saldo);
		this.chequeEspecial = chequeEspecial;	

	}
		
	// método de saque
	
//	public boolean sacar(double valor)
//	{
//		if(this.saldo < valor)
//		{
//			return false;
//		}
//		else if(valor <= 0.0)
//		{
//			System.out.println("Valor inválido!");
//			return false;
//		}
//		else
//		{
//			this.saldo-=valor;
//			return true;
//		}
//	}
	
	// método de cobrança de taxa
	
//	public void gerarTaxa()
//	{
//		this.saldo-=13.90;
//	}
	
	
	//gets e sets
	

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	// informações da conta
	

}
