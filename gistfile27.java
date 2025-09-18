// 3) Escreva um programa para escrever os números de 1 a 10 e se o número escrito é par ou ímpar.

package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d = ímpar \n", i);
            } else {
                System.out.printf("%d = par \n", i);
            }
        }
    }
}
