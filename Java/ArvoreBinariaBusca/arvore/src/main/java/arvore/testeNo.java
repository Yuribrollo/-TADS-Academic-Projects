/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvore;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author OKS
 */
public class testeNo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int conteudo;
        no raiz = null; 
        
        while(true){
            Menu();
            int opcao;
            opcao = entrada.nextInt();
            if(opcao == 0){
                break;
            }
            
            switch(opcao){
                case 1:
                    System.out.println("No: ");
                    conteudo = entrada.nextInt();
                    no<Integer> novoNo = new no(conteudo, null, null);
                    
                    if (raiz == null){
                        raiz = novoNo;
                        System.out.println("Raiz: " + raiz.cont);
                    } else{
                        no noAtual = raiz;
                        while (noAtual != novoNo){
                            if (novoNo.cont >= noAtual.cont){
                                if(noAtual.dir != null){
                                    noAtual = noAtual.dir;
                                    System.out.println("no atual" + noAtual.cont);
                                } else {
                                    System.out.println("No pai: " + noAtual.cont);
                                    noAtual.dir = novoNo;
                                    System.out.println("Nova subArvore: " + noAtual.dir.cont);
                                    noAtual = novoNo;
                                }
                            } else {
                                if(novoNo.cont < noAtual.cont){
                                    if (noAtual.esq != null){
                                        noAtual = noAtual.esq;
                                        System.out.println("no atual" + noAtual.cont);
                                    } else {
                                        System.out.println("No pai: " + noAtual.cont);
                                        noAtual.esq = novoNo;
                                        System.out.println("Nova subArvore: " + noAtual.esq.cont);
                                        noAtual = novoNo;
                                    }
                                }
                            }
                        }
                    }
                break;
                case 2:
                    System.out.println("Valor a ser verificado: ");
                    conteudo = entrada.nextInt();
                    
                    no noAtual = raiz; 
                    
                    while(noAtual != null && noAtual.cont != conteudo){
                        if(noAtual.cont > conteudo){
                            noAtual = noAtual.esq;
                        } else if (noAtual.cont < conteudo){
                            noAtual = noAtual.dir;
                        }
                    }
                    if(noAtual == null){
                        System.out.println("Valor nao encontrado");
                    } else {
                        System.out.println("Valor encontrado");
                    }
                    
                break;
                case 3: 
                    System.out.println("Valor a ser removido");
                    
                    conteudo = entrada.nextInt();
                    no pai = null;
                    noAtual = raiz; 
                    
                    while(noAtual != null && noAtual.cont != conteudo){
                        if(noAtual != null && noAtual.cont > conteudo){
                            pai = noAtual;
                            noAtual = noAtual.esq;
                            System.out.println("No atual esq: " + noAtual.cont);
                        } else if (noAtual != null && noAtual.cont < conteudo){
                            pai = noAtual;
                            noAtual = noAtual.dir;
                            System.out.println("No atual esq: " + noAtual.cont);
                        } 
                    }
                    
                    if (noAtual == null){
                        System.out.println("Valor nao encontrado!");
                        break;
                    }
                    
                    System.out.println("Nó atual: " + noAtual.cont);
                    System.out.println("Nó pai: " + pai.cont);
                    
                    if (noAtual.esq == null && noAtual.dir == null){
                        if(pai.cont < noAtual.cont){
                            pai.dir = null;
                        } else if (pai.cont > noAtual.cont){
                            pai.esq = null;
                        }
                    } else if (noAtual.esq == null || noAtual.dir == null) {
                        
                        no filho;

                        if (noAtual.esq != null) {
                            filho = noAtual.esq;
                        } else {
                            filho = noAtual.dir;
                        }

                        if (pai == null) {
                            raiz = filho;
                        } 
                        else if (pai.esq == noAtual) {
                            pai.esq = filho;
                        } 
                        else {
                            pai.dir = filho;
                        }
                    }else if (noAtual.esq != null && noAtual.dir != null) {

                        no auxPai = noAtual;
                        no aux = noAtual.esq;

                        while (aux.dir != null) {
                            auxPai = aux;
                            aux = aux.dir;
                        }

                        noAtual.cont = aux.cont;

                        if (auxPai == noAtual) {
                            
                            auxPai.esq = aux.esq;
                        } else {
                            auxPai.dir = aux.esq;
                        }
                    }
                    
                break;
                case 4:
                    Pilha<no> pilha = new Pilha();
                    
                    noAtual = raiz;
                    
                    while(noAtual != null || !pilha.empty()){
                        while (noAtual != null){
                            pilha.push(noAtual);
                            noAtual = noAtual.esq;
                        }
                        
                       noAtual = pilha.pop();
                       System.out.println(noAtual.cont);
                       
                       noAtual = noAtual.dir;
                    }
                break;
                
                case 5:
                    System.out.println("Começando inserçao automatica");
                    
                    Random gerador = new Random(); 
                    
                    for(int i = 0; i < 100; i++){
                        conteudo = gerador.nextInt(1000); 
                        no<Integer> novoAutom = new no(conteudo, null, null);
                        
                        if (raiz == null){
                            raiz = novoAutom;
                        } else{
                            noAtual = raiz;
                            while (noAtual != novoAutom){
                                if (novoAutom.cont >= noAtual.cont){
                                    if(noAtual.dir != null){
                                        noAtual = noAtual.dir;
                                    } else {
                                        noAtual.dir = novoAutom;
                                        noAtual = novoAutom;
                                    }
                                } else {
                                    if(novoAutom.cont < noAtual.cont){
                                        if (noAtual.esq != null){
                                            noAtual = noAtual.esq;
                                        } else {
                                            noAtual.esq = novoAutom;
                                            noAtual = novoAutom;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    System.out.println("Inserçao automatica feita com sucesso!");
                break;

                case 6:
                    Pilha<no> pilhaDre = new Pilha();
                    noAtual = raiz;
                    
                    while(noAtual != null || !pilhaDre.empty()){
                        while (noAtual != null){
                            pilhaDre.push(noAtual);
                            noAtual = noAtual.dir; 
                        }
                        
                        noAtual = pilhaDre.pop();
                        System.out.println(noAtual.cont);
                        
                        noAtual = noAtual.esq; 
                    }
                break;

                case 7: 
                    if (raiz == null) {
                        System.out.println("Altura da arvore");
                    } else {
                        no[] fila = new no[2000]; 
                        int inicio = 0;
                        int fim = 0;
                        
                        fila[fim] = raiz;
                        fim++;
                        int alturaArvore = -1;

                        while (inicio < fim) {
                            int tamanhoNivel = fim - inicio;
                            alturaArvore++; 
                            
                            for (int i = 0; i < tamanhoNivel; i++) {
                                no noRemovido = fila[inicio];
                                inicio++;
                                
                                if (noRemovido.esq != null) {
                                    fila[fim] = noRemovido.esq;
                                    fim++;
                                }
                                if (noRemovido.dir != null) {
                                    fila[fim] = noRemovido.dir;
                                    fim++;
                                }
                            }
                        }
                        System.out.println("A altura da arvore eh: " + alturaArvore);
                    }
                break;

                case 8: 
                    System.out.println("Valor a ser verificado para o no seguinte: ");
                    conteudo = entrada.nextInt();
                    no sucessor = null;
                    noAtual = raiz;

                    while (noAtual != null) {
                        if (noAtual.cont > conteudo) {
                            sucessor = noAtual; 
                            noAtual = noAtual.esq; 
                        } else {
                            noAtual = noAtual.dir; 
                        }
                    }
                    
                    if(sucessor != null) {
                        System.out.println("O no seguinte eh: " + sucessor.cont);
                    } else {
                        System.out.println("Nao existe no seguinte.");
                    }
                break;
            }
        }
    }        
    
    public static void Menu(){
        System.out.println("aperte 0 para fechar o programa;");
        System.out.println("aperte 1 para adicionar um no;");
        System.out.println("aperte 2 para buscar um no;");
        System.out.println("aperte 3 para remover um no;");
        System.out.println("aperte 4 para fazer a varredura e-r-d;");
        System.out.println("aperte 5 para insercao automatica (100 numeros);");
        System.out.println("aperte 6 para varredura d-r-e;");
        System.out.println("aperte 7 para ver a altura da arvore;");
        System.out.println("aperte 8 para encontrar o no seguinte;");
    }
}


