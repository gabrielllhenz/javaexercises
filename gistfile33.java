// 1) Escrever um programa que leia o sexo e a altura de 50 pessoas. Calcule e escreva:
// - A maior e a menor altura.
// - A média das alturas das mulheres.
// - A média geral das alturas.

package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
         Scanner e = new Scanner(System.in);
         int MAIOR = 0, MENOR = 10000, MEDIAM = 0, CONT = 0, MEDIA = 0, ALTURA;
         for (int i = 0; i < 50; i++) {
             System.out.print("\nDigite o sexo de uma pessoa (código=1, masculino código=2, feminino): \n");
             int V = e.nextInt();
             System.out.print("\nDigite a ALTURA em cm: \n");
             ALTURA = e.nextInt();
             MEDIA += ALTURA;
             if (ALTURA > MAIOR) {
                 MAIOR = ALTURA;
             }
             if (ALTURA < MENOR) {
                 MENOR = ALTURA;
             }
             if (V == 2) {
                 MEDIAM += ALTURA;
                 CONT++;
             }
         }
         System.out.printf("Maior = %d cm \nMenor = %d cm \nMédia Mulheres = %d cm \nMédia = %d cm \n", MAIOR, MENOR, MEDIAM / CONT, MEDIA / 50);
    }
}
