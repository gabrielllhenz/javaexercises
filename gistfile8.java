// 2) Escreva um programa em Java para ler o nome e a idade de uma pessoa, 
// e exibir quantos dias de vida ela possui. Considere sempre anos completos, 
// e que um ano possui 365 dias.

package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade;
        String nome;

        System.out.printf("\nInforme sua idade: \n");
        idade = entrada.nextInt();
        
        System.out.printf("\nInforme seu nome: \n");
        nome = entrada.next();
        
        System.out.printf("\n%s, você já viveu %d dias.\n", nome, idade * 365);
    }
}
