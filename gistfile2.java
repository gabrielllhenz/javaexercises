package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        // Fazer um programa em Java que pergunte um valor em graus Fahrenheit 
        // e imprime no vídeo o correspondente em graus Celsius usando as fórmulas que seguem.
        // a) Usar uma variável double para ler o valor em Fahrenheit e a fórmula C = (f - 32.0) * (5.0 / 9.0).
        // b) Usar uma variável int para ler o valor em Fahrenheit e a fórmula C = (f - 32) * (5 / 9).
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Informe um valor em Fahrenheit: \n");
        double f1 = entrada.nextDouble();
        double c1 = (f1 - 32.0) * (5.0 / 9.0);
        System.out.printf("%.2f Fahrenheit equivale a %.2f Celsius usando fórmula com double.\n", f1, c1);
        
        System.out.printf("Informe um valor em Fahrenheit (int): \n");
        int f2 = entrada.nextInt();
        int c2 = (f2 - 32) * (5 / 9);
        System.out.printf("%d Fahrenheit equivale a %d Celsius usando fórmula com int.\n", f2, c2);
    }
}