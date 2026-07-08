/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilha;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class testePilha {
    public static void main(String[] args) {
        Pilha<String> s = new Pilha();
        Pilha<String> s2 = new Pilha();
        Scanner entrada = new Scanner(System.in);
        
        while(true)
        {
            mostrarMenu();
            int opcao = entrada.nextInt();
            entrada.nextLine();
            
            if(opcao == 0)
            {
                break;
            }
            
            switch(opcao)
            {
                case 1:
                    System.out.println("Digite uma palavra: ");
                    String palavra = entrada.nextLine();
                    
                    s.push(palavra);
                    break;
                case 2:
                    s.mostraPilha();
                    break;
                case 3:
                    String i;
                    if(s.empty())
                    {
                        System.out.println("Sem palavras!"); 
                    }
                    else
                    {
                        i = s.pop();
                        s2.push(i); 
                    }

                    break;
                case 4: 
                    String j;
                    if(s2.empty())
                    {
                        System.out.println("Todas as palavras foram devolvidas!");
                    }
                    else
                    {
                        j = s2.pop();
                        s.push(j); 
                    }
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        }
    }
    
    public static void mostrarMenu()
    {
        System.out.println("---------------MENU----------------");
        System.out.println("1 - para adicionar uma palavra");
        System.out.println("2 - para visualizar o texto completo");
        System.out.println("3 - remover palavra");
        System.out.println("4 - devolver palavra");
        System.out.println("0 - para encerrar");
        System.out.println("Digite sua opção: ");
    }
}
