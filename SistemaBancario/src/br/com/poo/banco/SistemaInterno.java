package br.com.poo.banco;

import br.com.poo.banco.contas.Conta;

public class SistemaInterno {

	public static void main(String[] args) {
		
		Conta ct = new Conta("00014-4","0001","Cíntia");
		
		ct.getContaId();
		ct.getAgencia();
		ct.getTitular();
		
		Conta c1 = new Conta("00014-4","0001","Cíntia");
		
		c1.informa();
		
		//c1.toString();
		
		//System.out.println(ct.getTitular());
		
	}

}
