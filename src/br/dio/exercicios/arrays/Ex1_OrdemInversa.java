package br.dio.exercicios.arrays;
//Ordem Inversa: Faça um Programa que leia um vetor de 6 números inteiros e mostre-os na ordem inversa.

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int [] array = {5, 15, 80, 35, 45, 60};
        int count = 0;
        System.out.println("Laço while");
        while(count <= array.length-1){
            System.out.print(array[count]+ " ");
            count ++;
        }
        System.out.println("\n");
        System.out.println("Laço for");
        for( int i = (array.length-1); i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
