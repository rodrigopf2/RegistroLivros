package com.mycompany.registro_livros;

public class Pessoa {
    protected String Nome,Cidade_Nascimento;
    protected int idade;

    
    

    public Pessoa(String nome, String cidade_Nascimento, int idade) {
        Nome = nome;
        Cidade_Nascimento = cidade_Nascimento;
        this.idade = idade;
    }




    public String getNome() {
        return Nome;
    }




    public void setNome(String nome) {
        Nome = nome;
    }




    public String getCidade_Nascimento() {
        return Cidade_Nascimento;
    }




    public void setCidade_Nascimento(String cidade_Nascimento) {
        Cidade_Nascimento = cidade_Nascimento;
    }




    public int getIdade() {
        return idade;
    }




    public void setIdade(int idade) {
        this.idade = idade;
    }
    

    
    
}
