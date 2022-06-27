package br.dio.exercicios.loops;
/* Par e Ímpar: Faça um programa que peça N números inteiros.
Calcule e mostre a quantidade de números pares e a quantidade de números impares. */

import java.util.Scanner;
public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantidade de numeros: ");
        int quantidadeNumeros = scanner.nextInt();
        int number;
        int count = 0;
        int par = 0;
        int impar = 0;
        do{
            System.out.print("Digite os numeros: ");
            number = scanner.nextInt();
            count += 1;

            if(number % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }while (count < quantidadeNumeros);

        System.out.println("Quantidade numeros pares: " + par);
        System.out.println("Quantidade numeros impares: " + impar);
    }
}
