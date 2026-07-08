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
public class TesteAtendimento {
    
    public static void main(String[] args) {
        Fila<String> filaAtendimento = new Fila();
        Fila<String> filaPrioritaria = new Fila();
        Fila<String> atendidos = new Fila();
        Scanner entrada = new Scanner(System.in);
        String senha;
        int contP = 0;
        int contA = 0;
        while(true){
            mostrarMenu();
            int opcao = entrada.nextInt();
            String palavra = entrada.nextLine();
            
            if(opcao == 0){
                break;
            }
            
            switch(opcao){
                case 1: 

                    int tamanho = filaPrioritaria.itens.size();
                    if(tamanho < 5){
                        contP ++;
                        String num = String.valueOf(contP);
                        senha = "p" + num;
                        filaPrioritaria.inserir(senha);
                        System.out.println("Adicionado!" + senha);
                        break;
                    } else {
                        System.out.println("Fila cheia!");
                        break;
                    }
                                  
                case 2:

                    int tamanhoA = filaAtendimento.itens.size();
                    if(tamanhoA < 5){
                        contA ++;
                        String numA = String.valueOf(contA);
                        senha = "N" + numA;
                        filaAtendimento.inserir(senha);
                        System.out.println("Adicionado!" + senha);
                        break;
                    } else {
                        System.out.println("Fila cheia!");
                        break;
                    }
                  
                case 3:
                    String atendido;
                    if(!filaPrioritaria.empty()){
                        atendido = filaPrioritaria.remover();
                        System.out.println(atendido + " atendido!");
                        
                        int tam = atendidos.itens.size();
                        if(tam < 5){
                            atendidos.inserir(atendido);
                            break;
                        } else {
                            atendidos.remover();
                            atendidos.inserir(atendido);
                            break;
                        }
                    } else {
                        if(!filaAtendimento.empty()){
                            atendido = filaAtendimento.remover();
                            System.out.println(atendido + " atendido!");
                            int tam = atendidos.itens.size();
                            if(tam < 5){
                                atendidos.inserir(atendido);
                                break;
                            } else {
                                atendidos.remover();
                                atendidos.inserir(atendido);
                                break;
                            }
                        } else {
                            System.out.println("Fila vazia");
                            break;
                        }
                    }
                    
                case 4:
                    System.out.println("Fila priritaria:");
                    filaPrioritaria.mostrar();
                    System.out.println();
                    System.out.println("Fila normal: ");
                    filaAtendimento.mostrar(); 
                    break;
                case 5:
                    System.out.println("Historico: ");
                    atendidos.mostrar();
                    break;
                default:
                    System.out.println("Opção ivalida");
                    break;
            }
            
            
        }
    }
    
    public static void mostrarMenu() {
        System.out.println("---------- MENU ---------");
        System.out.println("1 - Entrar na fila prioritária");
        System.out.println("2 - Entrar na fila normal");
        System.out.println("3 - Atender");
        System.out.println("4 - Mostrar filas");
        System.out.println("5 - Mostrar historico");
        System.out.println("0 - Sair");
        System.out.println("Digite sua opção: ");
    }
    
    
}
