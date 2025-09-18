// Uma loja fornece 10% de desconto para funcionários e 5% de desconto para clientes VIPs. 
// Faça um programa que calcule o valor total a ser pago por uma pessoa. 
// O programa em Java deverá ler o valor total da compra efetuada e um código que identifique se o comprador é um cliente comum (1), funcionário (2) ou VIP (3).

package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float compra;
        int tipoCliente;
        
        // Leitura do valor da compra
        System.out.printf("Informe o valor de sua compra: ");
        compra = entrada.nextFloat();     
        
        // Leitura do tipo de cliente
        System.out.printf("Você é um cliente comum (1), funcionário (2) ou VIP (3)? ");
        tipoCliente = entrada.nextInt();     
        
        // Cálculo do valor com desconto dependendo do tipo de cliente
        switch (tipoCliente) {
            case 1:
                System.out.printf("Para clientes comuns infelizmente não temos nenhum desconto. Sua compra ficou: R$%.2f", compra);
                break;
            case 2:
                System.out.printf("Sua compra com 10%% de desconto ficou: R$%.2f", compra - compra * 0.10);
                break;
            case 3:
                System.out.printf("Sua compra com 5%% de desconto ficou: R$%.2f", compra - compra * 0.05);
                break;
            default:
                System.out.println("Código de cliente inválido.");
                break;
        }
    }
}
