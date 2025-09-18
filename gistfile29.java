// 5) Escrever um programa que lê um valor N inteiro e positivo e que calcula e escreve o valor de E.  
// E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / N!

package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
         Scanner e = new Scanner(System.in);
         System.out.print("Digite um número: ");
         int N = e.nextInt();
         double E = 1;
         
         for (int i = 1; i <= N; i++) {
             int A = 1;
             for (int j = 1; j <= i; j++) {
                 A *= j;
             }              
             E += (float) 1 / A;
         }
         System.out.printf("%f", E);
    }
}
