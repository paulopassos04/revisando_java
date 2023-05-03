package arrays_listas.exercicios.exe1;

import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int number = sc.nextInt();

        int[] vetor = new int[number];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] < 0){
                System.out.println("NUMERO NEGATIVO: " +vetor[i]);
            }
        }


        sc.close();
    }
    
}
