// 2) Faça um programa, utilizando while, que mostre na tela de 0 até N, em que N é o limite inserido pelo usuário.

package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {

    public static void main(String[] args) {
        int a = 0;
        Scanner e = new Scanner(System.in);


        System.out.printf("Digite o limite (N): ");
        int n = e.nextInt();


        while (a <= n) {
            System.out.print(a + "\t");  
            a++; 
        }
    }
}
