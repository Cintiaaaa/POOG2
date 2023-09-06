package br.com.poo.banco.contas;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Conta {
	
	private String contaId;
	private String agencia;
	private String titular;
	private double saldo;
	
	
	private static Logger logger = Logger.getLogger(Conta.class.getName());
	
	// construtores

		public Conta() 
		{
			
		}
		
		public Conta(String contaId, String agencia, String titular, double saldo) 
		{
			this.contaId = contaId;
			this.agencia = agencia;
			this.titular = titular;
			this.saldo = saldo;
			
		}

		// gets e sets
		
		public String getContaId() {
			return contaId;
		}

		public String getAgencia() {
			return agencia;
		}

		public String getTitular() {
			return titular;
		}
		
		public double getSaldo() {
			return saldo;
		}
		
		// informações da conta
		

		public static Logger getLogger() {
			return logger;
		}

		public String toString() 
		{
			return "Número da conta: "+contaId+".\nAgência: "+agencia+".\nTitular: "+titular+".";
		}
		
		// logger para exibir infos no sistema interno
		
		public String informa()
		{
			logger.log(Level.INFO, "Número da conta: {0}.\nAgência: {1}.\nTitular: {2}.",new Object[] {contaId, agencia, titular});
			return contaId;
		}
		
		

		
}

