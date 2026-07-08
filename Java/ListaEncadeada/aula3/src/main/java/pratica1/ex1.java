/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;



/**
 *
 * @author Aluno
 */
public class ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> listaNum = new LinkedList();
        Scanner entrada = new Scanner(System.in);
        int num;
        boolean achei = false; 
        
        while(true) {
            menu();
            int opcao = entrada.nextInt();
            entrada.nextLine();
            
            if (opcao == 0)
            {
                System.out.println("Tchau!");
                break;
            }
            
        
            switch(opcao){
                
                case 1:
                    System.out.println("Digite o numero:");
                    num = entrada.nextInt();
                    listaNum.add(num);
                    break;
                case 2: 
                    System.out.println("Digite o numero:");
                    num = entrada.nextInt();
                    listaNum.addFirst(num);
                    break;
                case 3:
                    System.out.println("Digite o numero:");
                    num = entrada.nextInt();
                    achei = false;
                    for(int i = 0; i < listaNum.size(); i++){
                        if (num == listaNum.get(i)){
                            achei = true;
                            System.out.println("Removido!");
                            listaNum.remove(i);
                        }
                    }
                    if (achei == false){
                        System.out.println("Item nao encontrado.");
                        break;
                    }
                    break;
                case 4:
                    Collections.sort(listaNum);
                    System.out.println("Organizado!");
                    break;
                case 5:
                    System.out.println("Leitura: ");
                    for (int i = 0; i < listaNum.size(); i++)
                    {
                        System.out.println(listaNum.get(i));
                    }
                    System.out.println("Feito!");
                    break;
                case 6:
                    System.out.println("Calculando: ");
                    double soma = 0;
                    for(int i = 0; i < listaNum.size(); i++)
                    {
                        soma += listaNum.get(i);
                        
                    }
                    int qtd = listaNum.size();
                    soma = soma / qtd;
                    System.out.println("Media: " + soma);
                    break;
                default:
                    System.out.println("Essa opcao nao existe");
                    break;
            }   
            
        }
    }
    
    public static void menu()
    {
        System.out.println("---------- MENU ----------");
        System.out.println("1 - para adicionar numero no fim da lista.");
        System.out.println("2 - para adicionar numero no inicio da lista..");
        System.out.println("3 - para remover numero na lista.");
        System.out.println("4 - para organizar a lista.");
        System.out.println("5 - para ler a lista.");
        System.out.println("6 - para calcular a media.");
        System.out.println("0 - para sair.");
        System.out.println("Digite sua opcao: ");
    }
}  

   
    
