package br.com.poo.banco.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.contas.ContaCorrente;
import br.com.poo.banco.contas.ContaPoupanca;

public class LeituraEscrita {
	
	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";
	
	//criando método leitor do banco.txt
	public static void leitor(String path) throws IOException
	{
		
			BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO+path+EXTENSAO));
			
			String linha = "";
			while(true)
			{
				linha = buffRead.readLine();
				if(linha != null)
				{
					String[] dados = linha.split(";");
					
					//ContaPoupança: String tipo, String contaId, String agencia, String cpf, String senha, Double saldo
					//ContaCorrente: String tipo, String contaId, String agencia, String cpf, String senha, Double saldo, Double chequeEspecial
					if(dados[0].equalsIgnoreCase("POUPANCA"))
					{
						ContaPoupanca cp = new ContaPoupanca(dados[0], dados[1], dados[2], dados[3], dados[4], Double.parseDouble(dados[5]));
						//na primeira coluna, fica o identificador único. Nesse caso, cpf.
						Conta.mapaContas.put(dados[3], cp);
						System.out.println(cp);
					}
					
					else if(dados[0].equalsIgnoreCase("CORRENTE")) 
					{
						ContaCorrente cc = new ContaCorrente(dados[0], dados[1], dados[2], dados[3], dados[4], Double.parseDouble(dados[5]),Double.parseDouble(dados[6]));
						Conta.mapaContas.put(dados[3], cc);
					}
					
					else if(dados[0].equalsIgnoreCase("CLIENTE")) 
					{
						
					}
					
					else if(dados[0].equalsIgnoreCase("GERENTE")) 
					{
						
					}
					
					else if(dados[0].equalsIgnoreCase("DIRETOR")) 
					{
						
					}
					
					else if(dados[0].equalsIgnoreCase("PRESIDENTE")) 
					{
						
					}
				}
				else
				{
					break;
				}

			}
			buffRead.close();
			//System.out.println(Conta.mapaContas);
	}
	
	//criando método escritor no banco.txt
	public static void escritor(String path) throws IOException
	{
		String escreve;
		Scanner sc = new Scanner(System.in);
		
		BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO+path+EXTENSAO, true));
		
		//o ",true" verifica se tem algo escrito e escreve depois
		
		System.out.println("Escreva algo: ");
		escreve = sc.nextLine();
		buffWriter.append(escreve+"\n");
		
		sc.close();
		buffWriter.close();

	}

}
