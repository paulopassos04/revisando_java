package arrays_listas.exercicios.exe5;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	    System.out.print("Quantos numeros voce vai digitar? ");
	    int number = sc.nextInt();

	    double[] vetor = new double[number];

	    for (int i = 0; i< vetor.length; i++) {
	    	System.out.print("Digite um numero: ");
	        vetor[i] = sc.nextDouble();
	    }

	    double maior = vetor[0];
	    int posmaior = 0;

	    for (int i = 1; i < vetor.length; i++) {
	        if (vetor[i] > maior) {
	            maior = vetor[i];
	            posmaior = i;
	        }
	    }
		
	    System.out.printf("MAIOR VALOR = %.1f\n", maior);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);

		sc.close();
	}
}
