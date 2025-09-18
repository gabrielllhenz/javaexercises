package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
    
        int A = 0, B = 0, C = 0, D = 0, E = 0, F = 0;
        
        while (true) {
            System.out.print("\nVOTE (1-4 para candidatos, 5 para nulo, 6 para branco, 0 para encerrar): \n");
            int voto = e.nextInt();
            
            if (voto == 0) {
                break; 
            }
            if (voto == 1) {
                A++;
            } else if (voto == 2) {
                B++;
            } else if (voto == 3) {
                C++;
            } else if (voto == 4) {
                D++;
            } else if (voto == 5) {
                E++; 
            } else if (voto == 6) {
                F++;
            } else {
                System.out.println("Voto inválido. Tente novamente.");
            }
        }
        
        System.out.printf("""
                          APURAÇÃO DOS VOTOS:
                          Candidato 1 = %d
                          Candidato 2 = %d
                          Candidato 3 = %d
                          Candidato 4 = %d
                          Nulos = %d
                          Brancos = %d
                          """, A, B, C, D, E, F);
    }
}
