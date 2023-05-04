package arrays_listas.exercicios.exe6;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
	    int number = sc.nextInt();

	    int[] a = new int[number];
	    int[] b = new int[number];
	    int[] c = new int[number];

	    System.out.println("Digite os valores do vetor A:");

	    for (int i = 0; i < number; i++) {
			a[i] = sc.nextInt();
	    }

	    System.out.println("Digite os valores do vetor B:");

	    for (int i = 0; i < number; i++) {
	        b[i] = sc.nextInt();
	    }

	    for (int i = 0; i < number; i++) {
	        c[i] = a[i] + b[i];
	    }

	    System.out.println("VETOR RESULTANTE:");

	    for (int i = 0; i < number; i++) {
	    	System.out.printf("%d\n", c[i]);
	    }
        
        sc.close();
    }

}
