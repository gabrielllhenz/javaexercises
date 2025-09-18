// 1) A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. 
// Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer saber quanto arrecadou com a venda 
// dos pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do total arrecadado). 
// Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos, escreva um programa em Java 
// para ler as quantidades de pães e de broas, e depois calcular os dados solicitados.

package javaapplication2;
import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float broa = 0, pao = 0;

        while (true) {
            System.out.printf("\nDigite 1 para broa, digite 2 para paozinho, digite 0 para finalizar.\n");
            int valor = entrada.nextInt();
            
            if (valor == 1) {
                broa++;
            } 
            if (valor == 2) {
                pao++;
            }
            if (valor == 0) {
                break;
            }
        }
        
        float totalArrecadado = (broa * 1.5) + (pao * 0.12);
        float poupanca = totalArrecadado * 0.1;
        
        System.out.printf("\nO valor total por %.2f broas e por %.2f paezinhos é igual a R$%.2f.\nDesse valor, você deve guardar R$%.2f na poupança.", broa, pao, totalArrecadado, poupanca);
    }
}
