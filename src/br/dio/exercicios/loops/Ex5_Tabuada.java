package br.dio.exercicios.loops;
/*Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:*/
import java.util.Scanner;
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um numero para saber sua tabuada: ");
        int number = scanner.nextInt();
        System.out.println("Tabuada de: " + number);

        for(int i = 1; i <= 10; i++ ){
            System.out.println(number + " x " + i + " = " + number*i);
        }
    }
}
