/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atv7;

/**
 *
 * @author Aluno
 */
public class Elefante implements AnimalInterface{
    private String nome;
    private int idade;

    public Elefante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    
    
    public String getNome(){
        return "Nome: " + this.nome;
    }
    
    public int getIdade(){
        System.out.print("Idade: ");
        return this.idade;
    }
    
        public String emitirSom(){
        return "Som: fuuuum uuuuh ";
    }
    
    
}
