// 3) As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia,
// e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs
// compradas, calcule e escreva o valor total da compra.

package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Digite a quantidade de maçãs: \n");
        int A = e.nextInt();
        
        if (A < 12 && A > 0) {
            System.out.printf("\nO valor é R$ %.2f\n", A * 0.30);
        }
        if (A >= 12) {
            System.out.printf("\nO valor é R$ %.2f\n", A * 0.25);
        }
    }
}
