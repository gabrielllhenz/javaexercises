package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        // Solicita 2 números e informa:
        // a) A soma dos números;
        // b) O produto do primeiro número pelo quadrado do segundo;
        // c) O quadrado do primeiro número;
        // d) A raiz quadrada da soma dos quadrados;
        // e) O seno da diferença do primeiro número pelo segundo;
        // f) O módulo do primeiro número.
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Informe um valor: \n");
        int a = entrada.nextInt();
        System.out.printf("Informe um valor: \n");
        int b = entrada.nextInt();
        
        int soma = a + b;
        int produto = a * (b * b);
        int quadradoPrimeiro = a * a;
        double raizSomaQuadrados = Math.sqrt((a * a) + (b * b));
        

        System.out.printf("\nA soma e %d", soma);
        System.out.printf("\nO produto do primeiro numero pelo quadrado do segundo e %d", produto);
        System.out.printf("\nO quadrado do primeiro numero e %d", quadradoPrimeiro);
        System.out.printf("\nA raiz quadrada da soma dos quadrados e %.2f", raizSomaQuadrados);
    }
}