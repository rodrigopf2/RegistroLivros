
package com.mycompany.registro_livros;


public class Livro {
    
    
    private String NomeLivro;
    private Autor autor;
    private String Editora;
    private String Cidade;
    private int Ano_de_Fab;
    private int N_Edicao;

 
    public Livro(String nomeLivro, Autor autor, String editora, String cidade, int ano_de_Fab, int n_Edicao) {
        NomeLivro = nomeLivro;
        this.autor = autor;
        Editora = editora;
        Cidade = cidade;
        Ano_de_Fab = ano_de_Fab;
        N_Edicao = n_Edicao;
    }






    public void Imprimir(){       
        System.out.println("Nome: "+NomeLivro);
        System.out.println("Autor: "+ getAutor());
        System.out.println("Editora: "+Editora);
        System.out.println("Cidade: "+Cidade);
        System.out.println("Ano de fabricação "+Ano_de_Fab);
        System.out.println("Edicao de numero "+N_Edicao);
        
    }






    public String getNomeLivro() {
        return NomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        NomeLivro = nomeLivro;
    }


    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String editora) {
        Editora = editora;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }


    public int getAno_de_Fab() {
        return Ano_de_Fab;
    }


    public void setAno_de_Fab(int ano_de_Fab) {
        Ano_de_Fab = ano_de_Fab;
    }


    public int getN_Edicao() {
        return N_Edicao;
    }


    public void setN_Edicao(int n_Edicao) {
        N_Edicao = n_Edicao;
    }

 
}
