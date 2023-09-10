package br.com.poo.banco;

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.pessoas.Cliente;
import br.com.poo.banco.pessoas.Presidente;
import br.com.poo.banco.pessoas.Diretor;
import br.com.poo.banco.contas.ContaPoupanca;
import java.text.DateFormat;
import java.util.Date;

public class SistemaInterno {

	public static void main(String[] args) {

//		Conta ct = new Conta("00014-4","0001","Cíntia", 100);
//		
//		ct.getContaId();
//		ct.getAgencia();
//		ct.getTitular();
//		
//		Conta c1 = new Conta("00014-4","0001","Cíntia", 200);
//		
//		c1.informa();

		Date data = new Date();
		DateFormat dataNasc = DateFormat.getDateInstance(DateFormat.MEDIUM);

		// Teste mudança de cargo
		Diretor diretor = new Diretor("Maria", "9665", "maria@mail.com", data, "diretor(a)", 20000.00, "123");

		// Presidente presidente = new Presidente("Pedro", "9874", "mail@mail.com",
		// data, "presidente", 50000.00, "123");

		// System.out.println("Nome do presidente: " + presidente.getNome());

		// presidente.mudaCargo(diretor, "vice-presidente");

		// System.out.println("Novo cargo da diretora: " + diretor.getCargo());

		// Teste saldo ContaPoupanca
		// ContaPoupanca poupanca = new ContaPoupanca("00015-4","0003","Julia", 300);

		// gera o rendimento
		// poupanca.gerarRend();

		// System.out.println("Saldo da poupança após o rendimento: " +
		// poupanca.getSaldo());

		//////////////
		Cliente cliente1 = new Cliente("Maria", "12345678910", "maria@mail.com", data);
		Conta contaCliente1 = new Conta("990", "5454-3", "12345678910", "123");

		System.out.println(contaCliente1);
		// System.out.println(contaCliente1.getTitular().getNome());
		System.out.println(contaCliente1.logIn("12345678910", "123"));

	}

}