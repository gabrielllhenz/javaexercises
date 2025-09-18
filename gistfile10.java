// 4) Três amigos, Carlos, André e Felipe, decidiram rachar igualmente a conta de um bar. 
// Faça um programa em Java para ler o valor total da conta e imprimir quanto cada um deve pagar, 
// mas faça com que Carlos e André não paguem centavos. 
// Ex: uma conta de R$1 01,53 resulta em R$33,00 para Carlos, R$33,00 para André e R$35,53 para Felipe.

package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double conta, felipe;
        int contapros2;
        
        System.out.printf("Digite o valor total da conta: ");
        conta = entrada.nextDouble();
        

        contapros2 = (int) (conta / 3);
        

        felipe = conta - (2 * contapros2);
        

        System.out.printf("Carlos e André irão pagar R$%d cada, e Felipe deverá pagar R$%.2f", contapros2, felipe);
    }
}
