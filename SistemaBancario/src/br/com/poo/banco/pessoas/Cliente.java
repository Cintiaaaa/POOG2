package br.com.poo.banco.pessoas;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Cliente {

	private String nome;
	private String cpf;
	private String email;
	private String senha;
	
	//criando o mapacliente
	public static Map<String, Cliente> mapaClientes = new HashMap<>();

	// construtores

	public Cliente() {

	}

	public Cliente(String nome, String cpf, String email, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}
	
	


}
