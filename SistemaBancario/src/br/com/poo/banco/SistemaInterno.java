package br.com.poo.banco;

import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.io.LeituraEscrita;
import br.com.poo.banco.pessoas.Cliente;
import br.com.poo.banco.pessoas.Diretor;

public class SistemaInterno {

	public static void main(String[] args) throws IOException {
		
		// lendo o banco.txt
		LeituraEscrita.leitor("banco");
		
		DecimalFormat df = new DecimalFormat("#,###.00");



		Date data = new Date();
		DateFormat dataNasc = DateFormat.getDateInstance(DateFormat.MEDIUM);

		// Teste mudança de cargo
		//Diretor diretor = new Diretor("Maria", "9665", "maria@mail.com", data, "diretor(a)", 20000.00, "123");



		// gera o rendimento
		// poupanca.gerarRend();

		// System.out.println("Saldo da poupança após o rendimento: " +
		// poupanca.getSaldo());

		//////////////
//		Cliente cliente1 = new Cliente("Maria", "12345678910", "maria@mail.com", data);
//		Conta contaCliente1 = new Conta("990", "5454-3", "12345678910", "123", 0.00);
//
//		System.out.println(contaCliente1);
//		// System.out.println(contaCliente1.getTitular().getNome());
//		System.out.println(contaCliente1.logIn("12345678910", "123"));

	}

}