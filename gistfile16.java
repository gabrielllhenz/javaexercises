// Faça um programa, utilizando while, que permita o usuário fazer contas de adição enquanto quiser.

package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {

    public static void main(String[] args) {
        int V = 1;
        Scanner e = new Scanner(System.in);

        while (V == 1) {
            System.out.printf("Digite o primeiro número: ");
            int n = e.nextInt();

            System.out.printf("Digite o segundo número: ");
            int m = e.nextInt();

            System.out.printf("\nA soma de %d e %d = %d\n", n, m, n + m);

            System.out.printf("\nVocê deseja fazer uma conta de adição? Sim(1) Não(2): ");
            V = e.nextInt();
        }

        System.out.println("Programa encerrado.");
    }
}
