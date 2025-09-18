// 1) Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. 
// A senha válida é o número 1234. Devem ser impressas as seguintes mensagens:
// ACESSO PERMITIDO caso a senha seja válida. 
// ACESSO NEGADO caso a senha seja inválida.

package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Digite a senha: \n");
        int A = e.nextInt();
        
        switch (A) {
            case 1234 -> System.out.print("\nACESSO PERMITIDO\n");
            default -> System.out.print("\nACESSO NEGADO\n");
        }
    }
}
