package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {

        
        Scanner entrada = new Scanner(System.in);
        
        int[] a = new int[3];
        int aux;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Informe um valor: \n");
            a[i] = entrada.nextInt();
        }


        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (a[i] > a[j]) {
                    aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
            }
        }
        

        System.out.printf("\nOs valores informados em ordem decrescente são: %d, %d e %d", a[2], a[1], a[0]);
    }
}