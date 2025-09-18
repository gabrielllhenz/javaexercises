package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        // Lê 3 valores A, B e C e os exibe em ordem crescente.
        
        Scanner entrada = new Scanner(System.in);
        
        int[] a = new int[3];
        int aux;

        // Solicita os 3 valores ao usuário
        for (int i = 0; i < 3; i++) {
            System.out.printf("Informe um valor: \n");
            a[i] = entrada.nextInt();
        }


        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (a[i] > a[j]) {
                    aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
            }
        }
        
        // Exibe os valores ordenados
        System.out.printf("\nOs valores informados em ordem crescente são: %d, %d e %d", a[0], a[1], a[2]);
    }
}