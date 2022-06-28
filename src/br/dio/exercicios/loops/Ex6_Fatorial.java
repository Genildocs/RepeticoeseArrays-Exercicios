package br.dio.exercicios.loops;
// Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
import java.util.Scanner;
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fatorial de: " );
        int numeroFatorial = scanner.nextInt();

        int multiplicacao = 1;
        for(int i = numeroFatorial; i >= 1; i--){

                multiplicacao *= i;
        }System.out.println(numeroFatorial+"!= "+multiplicacao);
    }
}
