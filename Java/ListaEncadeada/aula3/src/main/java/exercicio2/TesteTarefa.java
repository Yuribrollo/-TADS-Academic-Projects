package exercicio2;


import java.util.LinkedList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author OKS
 */
public class TesteTarefa {
    public static void main(String[] args) {
        LinkedList<Tarefa> listaTarefas = new LinkedList();
        Scanner entrada = new Scanner(System.in);
        int num;
        String descX;
        int opcao;
        boolean achei = false;
        
        while(true){
            menu();
            
            opcao = entrada.nextInt();
            
            if (opcao == 0)
            {
                System.out.println("Tchau!");
                break;
            }
            
            switch(opcao)
            {
                case 1:
                    int idx;
                    String statusX;
                    System.out.println("Digite o id: ");
                    idx = entrada.nextInt();
                    System.out.println("Digite a descricao: ");
                    entrada.nextLine();
                    descX = entrada.nextLine();
                    System.out.println("Digite o status: ");
                    statusX = entrada.nextLine();
                    Tarefa X = new Tarefa(idx, descX, statusX);
                    listaTarefas.add(X);
                    System.out.println("Pronto!");
                    break;
                case 2:
                    achei = false;
                    entrada.nextLine();
                    System.out.println("Digite a descricao da tarefa: ");
                    descX = entrada.nextLine();
                    
                    for (int i = 0; i < listaTarefas.size(); i++)
                    {
                        Tarefa t = listaTarefas.get(i);
                        if(descX.equals(t.getDesc()))
                        {
                           achei = true;
                           listaTarefas.remove(i);
                           System.out.println("Removido!");
                           break;
                        }
                    }
                    if (achei == false){
                        System.out.println("Tarefa nao encontrada.");
                        break;
                    }
                    break;  
                case 3: 
                    System.out.println("------- IDS TAREFAS ---------");
                    for(int i = 0; i < listaTarefas.size(); i++)
                    {
                       Tarefa t = listaTarefas.get(i);
                       System.out.println(t.getId()); 
                    }
                    System.out.println("-----------------------------");
                    break;
                case 4:
                    achei = false;
                    System.out.println("Digite o id da tarefa: ");
                    num = entrada.nextInt();
                    
                    for (int i = 0; i < listaTarefas.size(); i++)
                    {
                        Tarefa t = listaTarefas.get(i);
                        
                        if(num == t.getId())
                        {
                           achei = true;
                           t.lerTarefa(num); 
                        } 
                    }
                    if (achei == false){
                        System.out.println("Tarefa nao encontrada.");
                        break;
                    }
                    System.out.println("-----------------------------");
                    break;
                case 5:
                    achei = false;
                    System.out.println("Digite o id da Tarefa: ");
                    num = entrada.nextInt();
                    
                    for (int i = 0; i < listaTarefas.size(); i++)
                    {
                        Tarefa t = listaTarefas.get(i);
                        if(num == t.getId())
                        {
                           achei = true;
                            System.out.println("Removido!");
                           listaTarefas.remove(i);
                           break;
                        }
                    }
                    if (achei == false){
                        System.out.println("Tarefa nao encontrada.");
                        break;
                    }
                    break;
                case 6:
                    achei = false;
                    System.out.println("Digite o id da Tarefa: ");
                    num = entrada.nextInt();
                    
                    for (int i = 0; i < listaTarefas.size(); i++)
                    {
                      Tarefa t = listaTarefas.get(i);
                      
                      if(num == t.getId())
                      {
                          achei = true;
                          System.out.println("Achei na posicao " + i);
                          break;
                      }

                    }
                    
                    if (achei == false){
                        System.out.println("Tarefa nao encontrada.");
                    }
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
                }
            
        }
    }
    
    public static void menu(){
        System.out.println("---------- MENU ----------");
        System.out.println("1 - Adicionar uma tarefa.");
        System.out.println("2 - Remover uma tarefa (descricao).");
        System.out.println("3 - Exibir ids.");
        System.out.println("4 - Exibir informações da tarefa.");
        System.out.println("5 - Remover uma tarefa (id).");
        System.out.println("6 - Verificar tarefa na lista.");
        System.out.println("0 - Sair.");
        System.out.println("Digite sua opcao: ");
    }
}
