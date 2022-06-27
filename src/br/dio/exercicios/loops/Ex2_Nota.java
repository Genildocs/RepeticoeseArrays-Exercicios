package br.dio.exercicios.loops;
/*Nota: Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.*/
import java.util.Scanner;
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        while (true){
            System.out.print("Digite uma nota de zero a dez: ");
            nota = scanner.nextInt();
            if(nota < 0 || nota > 10){
                System.out.println("Nota invalida!");
                continue;
            }else{
                break;
            }
        }
    }
}
