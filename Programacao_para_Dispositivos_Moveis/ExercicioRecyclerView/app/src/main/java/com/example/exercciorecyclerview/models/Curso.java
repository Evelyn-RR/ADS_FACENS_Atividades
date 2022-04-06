package com.example.exercciorecyclerview.models;

public class Curso {
    private int codigo;
    private String nome;
    private int valor;
    private String dia;

    public Curso() {
    }

    public Curso(int codigo, String nome, int valor, String dia) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.dia = dia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}
