/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv5;

/**
 *
 * @author Aluno
 */
public class Livro {
    private String titulo;
    private int anoPublicacao;
    private Autor autor;

    public Livro(String titulo, int anoPublicacao, Autor autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public void exibirLivro(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Publicacao: " + this.anoPublicacao);
        System.out.println("Autor : " + autor.getNome());
    }
}
