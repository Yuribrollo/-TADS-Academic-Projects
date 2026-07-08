/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class TesteForma {
    public static void main(String[] args) {
        ArrayList<Forma> listaFormas = new ArrayList();
       
        listaFormas.add(new Quadrado(2));
        listaFormas.add(new Quadrado(90));
        listaFormas.add(new Reatngulo(2, 10));
        listaFormas.add(new Reatngulo(2, 130));
        
        for(Forma minhaForma : listaFormas){
                System.out.println("Area: " + minhaForma.getArea());
                System.out.println("Perimetro: " + minhaForma.getPerimetro());
        }
    }
}
