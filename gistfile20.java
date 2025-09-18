// 4) Escrever um programa em Java que cadastre o nome, a matrícula e duas notas de 10 alunos. 
// Em seguida imprima a matrícula, o nome e a média de cada um deles.

package com.mycompany.java1;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String[] a = new String[10]; 
        int[] b = new int[10]; 
        int[] nota1 = new int[10]; 
        int[] nota2 = new int[10]; 
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Nome: ");
            a[i] = e.next();
            System.out.printf("Matrícula: ");
            b[i] = e.nextInt();
            System.out.printf("Nota 1: ");
            nota1[i] = e.nextInt();
            System.out.printf("Nota 2: ");
            nota2[i] = e.nextInt();
            
            int media = (nota1[i] + nota2[i]) / 2;
            System.out.printf("%s, de matrícula %d, tem a média %d\n", a[i], b[i], media);
        }
    }
}
