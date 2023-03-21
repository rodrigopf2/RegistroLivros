package com.mycompany.registro_livros;

public abstract class Pessoa {
    protected String Nome,Cidade_Nascimento;
    protected int idade;
    public String getNome() {
        return Nome;
    }
    public String getCidade_Nascimento() {
        return Cidade_Nascimento;
    }
    public int getIdade() {
        return idade;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public void setCidade_Nascimento(String cidade_Nascimento) {
        Cidade_Nascimento = cidade_Nascimento;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }


    
    
}
