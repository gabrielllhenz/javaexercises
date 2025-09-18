package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        // Fazer um programa em Java que pergunta um valor em metros 
        // e imprime o correspondente em decímetros, centímetros e milímetros.
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Informe um valor em metros: \n");
        float b = entrada.nextFloat();
        
        System.out.printf("\n %.2f metros equivale a %.2f decímetros, %.2f centímetros e %.2f milímetros.", b, b * 10, b * 100, b * 1000);
    }
}
