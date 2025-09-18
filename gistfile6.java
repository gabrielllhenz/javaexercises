// 4) Escreva um programa em Java para ler 5 valores A, B, C, D e E e escreva-os na ordem que foram lidos.  
// Após, escreva o maior e o menor valores.

package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] a = new int[5];
        int maior = 0, menor = 100000;

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um valor: \n");
            a[i] = entrada.nextInt();
        }
        
        System.out.printf("\nOs numeros digitados sao: \n");
        for (int i = 0; i < 5; i++) {
            System.out.printf("\t%d", a[i]);
        }

        for (int i = 0; i < 5; i++) {
            if (a[i] > maior) {
                maior = a[i];
            }
            if (a[i] < menor) {
                menor = a[i];
            }
        }
        
        System.out.printf("\nO menor valor eh %d e o maior eh %d \n", menor, maior);
    }
}
