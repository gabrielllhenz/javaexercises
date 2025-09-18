package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
    
        int I = 0, P = 0, SP = 0, SG = 0;
        
        while (true) {
            System.out.print("\nDIGITE UM NUMERO POSITIVO: \n");
            int voto = e.nextInt();
            
            if (voto == 0) {
                break;
            }
            
            SG += voto;
            if (voto % 2 == 0) {
                P++;
                SP += voto;
            } else {
                I++;
            }
        }
        
        if (P > 0) {
            System.out.printf("""
                               CONTABILIDADE:
                               Ímpares = %d
                               Pares = %d
                               Média Pares = %.2f
                               Média Geral = %.2f
                               """, I, P, (float) SP / P, (float) SG / (I + P));
        } else {
            System.out.printf("""
                               CONTABILIDADE:
                               Ímpares = %d
                               Pares = %d
                               Não foi possível calcular a média dos pares (nenhum número par informado).
                               Média Geral = %.2f
                               """, I, P, (float) SG / (I + P));
        }
    }
}
