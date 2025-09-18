// 1) Realize a leitura de oito elementos numéricos inteiros em um array A do tipo inteiro. 
// Construir um array B de mesma dimensão com os elementos do array A multiplicados por 3. 
// Apresentar o array B.

package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {

    public static void main(String[] args) {
       Scanner e = new Scanner(System.in);
       int i;
       int[] a = new int[8];  
       int[] b = new int[8];  

        for (i = 0; i < 8; i++) {  
            a[i] = e.nextInt();
        }

        for (i = 0; i < 8; i++) {  
            b[i] = a[i] * 3;
        }

        for (i = 0; i < 8; i++) {  
            System.out.printf("%d \t", b[i]);
        }
    }
}
