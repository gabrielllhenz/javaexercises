// 5) Elabore um programa em Java que leia dois valores do usuário e a operação que ele deseja executar 
// (Operações: soma, subtração, divisão, multiplicação). Execute a operação desejada e imprima na tela.

package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float num1, num2;
        int operacao;
        
        System.out.printf("Me dê um valor: ");
        num1 = entrada.nextFloat();     
        System.out.printf("Me dê outro valor: ");
        num2 = entrada.nextFloat();  
        
        System.out.printf("Escolha a operação: soma(1), subtração(2), divisão(3), multiplicação(4): ");
        operacao = entrada.nextInt();     
        
        switch (operacao) {
            case 1:
                System.out.printf("A soma dos seus valores foi %.2f + %.2f = %.2f", num1, num2, num1 + num2);
                break;
            case 2:
                System.out.printf("A subtração dos seus valores foi %.2f - %.2f = %.2f", num1, num2, num1 - num2);
                break;
            case 3:
                if (num2 != 0) {
                    System.out.printf("A divisão dos seus valores foi %.2f / %.2f = %.2f", num1, num2, num1 / num2);
                } else {
                    System.out.println("Erro: Não é possível dividir por zero.");
                }
                break;
            case 4:
                System.out.printf("A multiplicação dos seus valores foi %.2f X %.2f = %.2f", num1, num2, num1 * num2);
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
    }
}
