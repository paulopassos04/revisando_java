package arrays_listas.exercicios.exe2;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?");
        int number = sc.nextInt();

        double[] vetor = new double[number];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < vetor.length; i++) {
            sum += vetor[i];
        }

        System.out.print("VALORES = ");

        for (int i= 0; i<vetor.length; i++) {
	    	System.out.printf("%.1f  ", vetor[i]);
	    }

        double media = sum / vetor.length;

        System.out.printf("\nSOMA = %.2f\n", sum);
	    System.out.printf("MEDIA = %.2f\n", media);

        sc.close();
    }

}
