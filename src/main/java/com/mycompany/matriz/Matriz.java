package com.mycompany.matriz;
import java.util.Scanner;
public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[10];
        int soma = 0;
        for(int i = 0; i < 10; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }
        System.out.println("Soma dos elementos: "+soma);
    }
}
