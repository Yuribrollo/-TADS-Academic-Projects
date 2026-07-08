/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atv7;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class TesteAnimais {
    public static void main(String[] args) {
            ArrayList<AnimalInterface> meusAnimais = new ArrayList();
    
            meusAnimais.add(new Macaco("Donkey", 18));
            meusAnimais.add(new Macaco("Kong", 15));
            meusAnimais.add(new Leao("Simba", 10));
            meusAnimais.add(new Leao("Scar", 50));
            meusAnimais.add(new Elefante("Dumbo", 3));
            meusAnimais.add(new Leao("mae do Dumbo", 40));
            
            for(AnimalInterface animal: meusAnimais){
                System.out.println(animal.getNome());
                System.out.println(animal.getIdade());
                System.out.println(animal.emitirSom());
                System.out.println("");
            }
    }

}
