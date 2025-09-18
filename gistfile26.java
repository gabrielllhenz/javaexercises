// 2) Escreva um programa para escrever os números ímpares de 1 a 100, na ordem invertida.

package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.printf("%d \n", i);
            }
        }
    }
}
