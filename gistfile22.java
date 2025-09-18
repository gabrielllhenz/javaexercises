// 2) Faça um programa que calcule e mostre a área de um trapézio. Sabe-se que:
// A = ((basemaior + basemenor) * altura) / 2
// Lembre-se a base maior e a base menor devem ser números maiores que zero.

package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Digite a base menor: \n");
        int A = e.nextInt();
        System.out.print("Digite a base maior: \n");
        int B = e.nextInt();
        System.out.print("Digite a altura: \n");
        int C = e.nextInt();
        
        if ((A > 0) && (B > 0) && (C > 0)) {
            System.out.printf("\nA área do trapézio é %d \n", (((A + B) * C) / 2));
        }
    }
}
