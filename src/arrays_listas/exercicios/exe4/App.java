package arrays_listas.exercicios.exe4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	    System.out.print("Quantos numeros voce vai digitar? ");
	    int number = sc.nextInt();

	    int[] vetor = new int[number];

	    for (int i = 0; i < vetor.length; i++) {
	    	System.out.print("Digite um numero: ");
	        vetor[i] = sc.nextInt();
	    }

	    System.out.println("\nNUMEROS PARES:");

		int qtdpares = 0;
	    for (int i = 0; i < vetor.length; i++) {
	        if (vetor[i] % 2 == 0) {
	        	System.out.printf("%d  ", vetor[i]);
	            qtdpares++;
	        }
	    }

	    System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdpares);

		sc.close();
	}
}
