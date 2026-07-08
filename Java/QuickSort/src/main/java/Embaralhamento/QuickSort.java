/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Embaralhamento;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuickSort {
    
    public static void main(String[] args) throws InterruptedException  {
        int opcao = 0;
        
        
        Scanner entrada = new Scanner(System.in);
        
        while(true){
            Menu();
            opcao = entrada.nextInt();
            if(opcao == 0){
                break;
            }
            
            switch(opcao){
                case 1: 
                    fazLista(100);
                break;
                case 2: 
                    fazLista(10000);
                break;
                case 3:
                    fazLista(100000);
                break;
                default:
                    System.out.println("Número inválido!");
                break;
                    
            }
        }
        
        
        
    }

    
    public static int fazLista(int tam) throws InterruptedException{
        Integer[] numeros = new Integer[tam];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        
        List<Integer> lista = Arrays.asList(numeros);
        Collections.shuffle(lista);
        
        System.out.println("");
        System.out.println("Array embaralhado:");
        System.out.println(Arrays.toString(numeros));

        // ⏱️ INÍCIO DA MEDIÇÃO
        long inicio = System.nanoTime();

        quickSort(numeros, 0, numeros.length - 1);

        // ⏱️ FIM DA MEDIÇÃO
        long fim = System.nanoTime();

        System.out.println("\nArray ordenado:");
        System.out.println(Arrays.toString(numeros));

        double duracao = fim - inicio;

        System.out.println("");
        System.out.println("\nTempo de execução:");
        System.out.println(duracao + " nanossegundos");
        System.out.println((duracao / 1_000_000.0) + " milissegundos");
        System.out.println((duracao / 1_000_000_000.0) + " segundos");
        System.out.println("");
        return 0;
    }


    public static void quickSort(Integer[] arr, int low, int high) throws InterruptedException {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(Integer[] arr, int low, int high) throws InterruptedException {
        int pivot = arr[high];
        //System.out.println("\nPivot: " + pivot + " (posição " + high + ")");

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(Integer[] arr, int i, int j) throws InterruptedException {
        //System.out.println("Trocando " + arr[i] + " com " + arr[j]);

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        //System.out.println(Arrays.toString(arr));

        //Thread.sleep(1000); 
        
        //return Arrays.toString(arr
        
    }
    
    public static void Menu(){
        
        System.out.println("Aperte 1 para 100");
        System.out.println("Aperte 2 para 10000");
        System.out.println("Aperte 3 para 100000");
       }
    
}