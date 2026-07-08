/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Processos;
import Fila.Fila;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class TesteProcessos {
    public static void main(String[] args) {
        Fila<Integer> filaProcessos = new Fila();
        Scanner entrada = new Scanner(System.in);
        
        while(true){
            mostrarMenu();
            int opcao = entrada.nextInt();
            
            if(opcao == 0){
                break;
            }
            
            switch(opcao){
                case 1: 
                    
                    System.out.println("Insira um número: ");
                    int processo = entrada.nextInt();
                    
                    filaProcessos.inserir(processo);
                    break;
                    
                case 2:
                    
                    if(!filaProcessos.empty()){
                        filaProcessos.remover();
                        System.out.println("Removido!");
                    } else {
                        System.out.println("Fila vazia");
                    }
                    
                    
                    break;
                    
                case 3:
                    
                    System.out.println("Sua fila:");
                    
                    filaProcessos.mostrar();
                    break;
                default:
                    System.out.println("Opção ivalida");
                    break;
            }
            
            
        }
    }
    
    public static void mostrarMenu() {
        System.out.println("---------- MENU ---------");
        System.out.println("1 - Novo processo");
        System.out.println("2 - Retirar processo");
        System.out.println("3 - Exibir processos");
        System.out.println("0 - Sair");
        System.out.println("Digite sua opção: ");
    }
    
    
}
