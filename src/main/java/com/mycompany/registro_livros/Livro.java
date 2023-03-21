
package com.mycompany.registro_livros;
import java.util.Scanner;

public class Livro extends Autor {
    
    
    private String Nome;
    Autor autor = new Autor();
    private String Editora;
    private String Cidade;
    private int Ano_de_Fab;
    private int N_Edicao;

    public Livro() {}
   
    public Livro(String Nome, String Autor, String Editora, String Cidade, int Ano_de_Fab, int N_Edicao) {
        this.Nome = Nome;
        
        this.Editora = Editora;
        this.Cidade = Cidade;
        this.Ano_de_Fab = Ano_de_Fab;
        this.N_Edicao = N_Edicao;
    }
     public void Imprimir(){       
        System.out.println("Nome: "+Nome);
        System.out.println("Autor: "+Autor);
        System.out.println("Editora: "+Editora);
        System.out.println("Cidade: "+Cidade);
        System.out.println("Ano de fabricação "+Ano_de_Fab);
        System.out.println("Edicao de numero "+N_Edicao);
        
    }

    public String getNome() {
        return Nome;
    }

    public String getAutor() {
        return Autor;
    }

    public String getEditora() {
        return Editora;
    }

    public String getCidade() {
        return Cidade;
    }

    public int getAno_de_Fab() {
        return Ano_de_Fab;
    }

    public int getN_Edicao() {
        return N_Edicao;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public void setEditora(String editora) {
        Editora = editora;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public void setAno_de_Fab(int ano_de_Fab) {
        Ano_de_Fab = ano_de_Fab;
    }

    public void setN_Edicao(int n_Edicao) {
        N_Edicao = n_Edicao;
    }
    
    
}
