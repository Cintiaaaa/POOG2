package br.com.poo.banco.contas;

public class Conta {
	
	private String contaId;
	private String agencia;
	private String titular;
	
	// construtores

		public Conta() 
		{
			
		}
		
		public Conta(String contaId, String agencia, String titular) 
		{
			this.contaId = contaId;
			this.agencia = agencia;
			this.titular = titular;
		}

}

