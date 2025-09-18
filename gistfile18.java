// 2) Efetuar a leitura de um array A do tipo inteiro com dez elementos. 
// Construir um array B de mesmo tipo, sendo cada elemento do array B o fatorial do elemento correspondente do array A. 
// Apresentar o array B.

package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {

    public static void main(String[] args) {
       Scanner e = new Scanner(System.in);
       int i;
       int[] a = new int[10];
       int[] b = new int[10];

        for (i = 0; i < 10; i++) {
            a[i] = e.nextInt();
        }

        for (i = 0; i < 10; i++) {
            b[i] = a[i];
            for (int j = a[i] - 1; j > 0; j--) {
                b[i] *= j;
            }
        }

        for (i = 0; i < 10; i++) {
            System.out.printf("%d \t", b[i]);
        }
    }
}
