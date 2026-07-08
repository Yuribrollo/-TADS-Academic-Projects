/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Fila;

import java.util.LinkedList;

/**
 *
 * @author Aluno
 */
public class Fila<T> {

    public LinkedList<T> itens;
    
    public Fila(){
        itens = new LinkedList();
    }
    
    public boolean empty(){
        if(itens.size() == 0){
            return true;
        } else{
            return false;
        }
    }
    
    public T remover(){
        if(this.empty()){
            System.out.println("Underflow na Fila.");
            System.exit(0);
        }
        return itens.removeFirst();
    }
    
    public void inserir(T elt){
        itens.addLast(elt);
    }
    
    public void mostrar(){
        for(T elt : itens){
            System.out.println(elt + " ");
        }
        
        System.out.println();
       
        
    }
    
  }    
