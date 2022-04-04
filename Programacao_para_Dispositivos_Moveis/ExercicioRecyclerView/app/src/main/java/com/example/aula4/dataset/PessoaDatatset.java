package com.example.aula4.dataset;

import com.example.aula4.models.Pessoa;

import java.util.ArrayList;

public class PessoaDatatset {
    private static ArrayList<Pessoa> pessoas;

    public static ArrayList<Pessoa> getItens(){
        pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1, "Rafael Moreno", "111111"));
        pessoas.add(new Pessoa(2, "José da Silva", "222222"));
        pessoas.add(new Pessoa(3, "Patricia Soares", "333333"));
        pessoas.add(new Pessoa(4, "Evelyn Rodrigues", "444444"));
        pessoas.add(new Pessoa(5, "Joaquim Rocha", "555555"));
        pessoas.add(new Pessoa(6, "Alexsander Oliveira", "666666"));
        pessoas.add(new Pessoa(7, "Nayane Nunes", "777777"));
        pessoas.add(new Pessoa(8, "Maria Pereira", "888888"));
        pessoas.add(new Pessoa(9, "Felipe Cruz", "999999"));

        return pessoas;
    }

    public static void addPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

}
