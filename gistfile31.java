// 6) Escrever um programa que lê 5 valores para a, um de cada vez, e conta quantos destes valores são negativos, escrevendo esta informação.

package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        int cont = 0;
        int i;
        for (i = 0; i < 5; i++) {
            System.out.print("Digite 1 numero: \n");
            int N = e.nextInt();
            if (N < 0) {
                cont++;
            }
        }
        System.out.printf("Números negativos quantidade: %d\n", cont);
    }
}
