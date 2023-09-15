package br.com.poo.banco.pessoas;

import java.util.Date;

public class Gerente extends Funcionario {

    String agencia;

    public Gerente() {
        super();

    }

    public Gerente(String cargo, String nome, String cpf, String email, Double salario, String senha,String agencia) {
        super(cargo, nome, cpf, email, salario, senha);
        this.agencia = agencia;
    }

}

//gets sets
