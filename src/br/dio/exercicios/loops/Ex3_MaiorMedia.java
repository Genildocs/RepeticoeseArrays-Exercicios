package br.dio.exercicios.loops;
/* Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números. */
import java.util.Scanner;

public class Ex3_MaiorMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        int count = 0;
        int soma = 0;
        int maior = 0;

        do{
            System.out.print("Numeros: ");
            number = scanner.nextInt();
            count ++;
            soma += number;
            if(number > maior){
                maior = number ;
            }

        }while(count < 5);
        System.out.println("Meu maior numero é: " +  maior);
        System.out.println("A soma dos numeros é: " + soma + " e a media é: " + soma/5);
    }
}
