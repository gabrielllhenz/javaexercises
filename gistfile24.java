// 4) Escreva um programa para ler 3 valores inteiros (considere que não serão lidos valores iguais) 
// e escrevê-los em ordem crescente.

package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        int[] A = new int[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite 1 número: \n");
            A[i] = e.nextInt();
        }

        int AUX;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (A[i] > A[j]) {
                    AUX = A[i];
                    A[i] = A[j];
                    A[j] = AUX;
                }
            }
        }
        
        System.out.print("Os números digitados em ordem crescente são: \n");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d \n", A[i]);
        }
    }
}
