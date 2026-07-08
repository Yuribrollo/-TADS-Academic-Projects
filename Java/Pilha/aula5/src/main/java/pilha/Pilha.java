package pilha;

import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Pilha<T> {
    private LinkedList<T> itens;
    
    public Pilha()
    {
        itens = new LinkedList();
    }
    
    public boolean empty(){
        if(itens.size() == 0)
        {
            return true;
        }
        return false;
    }
    
    public T pop(){
        if(empty())
        {
            System.out.println("Stack underflow.");
            System.exit(0);
            return null;
        }
        else
        {
            return itens.removeLast();
        }
    }
    
    public T Stacktop(){
        if(empty())
        {
            System.out.println("Stack underflow.");
            System.exit(0);
            return null;
        }
        else
        {
            return itens.getLast();
        }
    }
    
    public void push(T i){
        //itens.addFirst(i);
        itens.addLast(i);
    }
    
    public void mostraPilha()
    {
        if(!empty())
        {
            System.out.println("Estado da pilha: ");
            for (T i : itens)
            {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println("");
        }
        else
        {
            System.out.println("Pilha vazia!");
        }
    }    


    
}
