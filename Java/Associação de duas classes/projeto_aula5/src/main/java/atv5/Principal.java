/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv5;

/**
 *
 * @author Aluno
 */
public class Principal {
    public static void main(String[] args) {
        Autor autorLivro = new Autor("Machado de Assis", "Brasileiro");
        
        Livro meuLivro = new Livro("Memorias postumas", 1880, autorLivro);
        
        meuLivro.exibirLivro();
    }
}
