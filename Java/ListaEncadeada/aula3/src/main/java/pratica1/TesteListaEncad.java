/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica1;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class TesteListaEncad {
    public static void main(String[] args) {
        LinkedList<String> listaNomes = new LinkedList();
        Scanner entrada = new Scanner(System.in);
        String nome;
        
        while(true) {
            mostrarMenu();
            int opcao = entrada.nextInt();
            entrada.nextLine();
            
            if (opcao == 0)
            {
                break;
            }
            
            switch(opcao){
                case 1:
                    System.out.println("Digite o nome para inserir:");
                    nome = entrada.nextLine();
                    
                    listaNomes.add(nome);
                    break;
                case 2:
                    System.out.println("Digite o nome para buscar:");
                    nome = entrada.nextLine();
                    
                    if (listaNomes.indexOf(nome) == -1)
                    {
                        System.out.println("Não achei hein!");
                    }
                    else
                    {
                        System.out.println("ACHEEII ta no: " + listaNomes.indexOf(nome));
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome para deletar:");
                    nome = entrada.nextLine();
                    
                    listaNomes.remove(nome);
                    break;
                case 4:
                    for (int i = 0; i < listaNomes.size(); i++)
                    {
                        System.out.println(listaNomes.get(i));
                    }
                    break;
                default:
                    System.out.println("opção n encontrada");
                    break;
            }
        }
    }
    
    public static void mostrarMenu(){
        System.out.println("---------- MENU ----------");
        System.out.println("1 - para adicionar nome na lista.");
        System.out.println("2 - para buscar nome na lista.");
        System.out.println("3 - para remover nome na lista.");
        System.out.println("4 - para ler a lista.");
        System.out.println("0 - para sair.");
        System.out.println("Digite sua opção: ");
    }
}
