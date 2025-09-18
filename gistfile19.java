// 3) Ler dois vetores A e B com 8 elementos cada um. 
// Construir um vetor Java, na qual cada elemento de C é a subtração do elemento correspondente a A com B. 
// Apresentar o vetor C.

package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {

    public static void main(String[] args) {
       Scanner e = new Scanner(System.in);
       int i;
       int[] a = new int[8];
       int[] b = new int[8];
       int[] c = new int[8];

        for (i = 0; i < 8; i++) {
            a[i] = e.nextInt();
        }

        for (i = 0; i < 8; i++) {
            b[i] = e.nextInt();
        }

        for (i = 0; i < 8; i++) {
            c[i] = a[i] - b[i];
        }

        for (i = 0; i < 8; i++) {
            System.out.printf("%d \t", c[i]);
        }
    }
}
