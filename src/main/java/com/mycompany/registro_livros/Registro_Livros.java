

package com.mycompany.registro_livros;

import INterfaces.CSVGenerator;

public class Registro_Livros {

    public static void main(String[] args) {
        
        Autor p = new Autor("Rookemaker","Dourados",19,"Masculino","Mestre");
        Livro l = new Livro("A arte nao precisa de explicação",p,"Globo","Sao paulo",1956,2);
        
        
        CSVGenerator csv = l;

        System.out.println(csv.generateCSV());
    }
}
