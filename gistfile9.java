// 3) Faça um programa em Java para ler três notas de um aluno em uma disciplina 
// e imprimir a sua média conforme a opção (1 - média ponderada, 2 - média aritmética).

package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float somaNotas = 0, somaPesos = 0;


        for (int i = 0; i < 3; i++) {
            System.out.printf("\nInforme a nota %d: \n", i + 1);
            somaNotas += entrada.nextFloat();
            
            System.out.printf("\nInforme o peso da nota %d: \n", i + 1);
            somaPesos += entrada.nextFloat();
        }


        float mediaAritmetica = somaNotas / 3;
        float mediaPonderada = somaNotas / somaPesos;
        

        System.out.printf("\nSua média aritmética é %.2f e sua média ponderada é %.2f", mediaAritmetica, mediaPonderada);
    }
}
