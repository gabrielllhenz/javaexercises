// Escreva um programa em Java utilizando o comando switch que imprima um mês de acordo com o número digitado pelo usuário.

package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int mes;
        
        // Solicita ao usuário o número do mês
        System.out.printf("Digite o número do mês (janeiro(1), fevereiro(2), março(3), abril(4), maio(5), junho(6), julho(7), agosto(8), setembro(9), outubro(10), novembro(11), dezembro(12)): ");
        mes = entrada.nextInt();     

        // Utiliza o comando switch para imprimir o mês correspondente
        switch (mes) {
            case 1: 
                System.out.println("Janeiro");
                break;
            case 2: 
                System.out.println("Fevereiro");
                break;
            case 3: 
                System.out.println("Março");
                break;
            case 4: 
                System.out.println("Abril");
                break;
            case 5: 
                System.out.println("Maio");
                break;
            case 6: 
                System.out.println("Junho");
                break;
            case 7: 
                System.out.println("Julho");
                break;
            case 8: 
                System.out.println("Agosto");
                break;        
            case 9: 
                System.out.println("Setembro");
                break;
            case 10: 
                System.out.println("Outubro");
                break;
            case 11: 
                System.out.println("Novembro");
                break;
            case 12: 
                System.out.println("Dezembro");
                break;        
            default: 
                System.out.println("Este número não corresponde a um mês.");
                break;        
        }
    }
}
