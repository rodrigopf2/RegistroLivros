package com.mycompany.registro_livros;

public class Autor extends Pessoa {
    protected String Genero,Formacao;

    public Autor(String nome, String cidade_Nascimento, int idade, String genero, String formacao) {
        super(nome, cidade_Nascimento, idade);
        Genero = genero;
        Formacao = formacao;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getFormacao() {
        return Formacao;
    }

    public void setFormacao(String formacao) {
        Formacao = formacao;
    }

    
    
}
