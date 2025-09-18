package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
// Escreva um programa que leia 50 valores e encontre o maior e o menor deles. Mostre o resultado.\\
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
      int aux, maior=0, menor=10000000;
   
       
    for (int i=0; i<5; i++){
        System.out.print("Digite um número: ");
        aux = e.nextInt();
        
        if (aux>maior){
            maior=aux;
        }
        if (aux<menor){
            menor=aux;
        }
        
    }
     
    System.out.printf("Maior= %d /n Menor= %d", maior,menor);
    
    }
    
}
