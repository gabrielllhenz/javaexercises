// 4) Escreva um programa que lê um valor e escreva a tabuada deste valor.

package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
         Scanner e = new Scanner(System.in);
         System.out.print("Digite um número: ");
         int A = e.nextInt();
         for (int i = 1; i <= 10; i++) {
             System.out.printf("%d \n ", A * i);
         }
    }
}
