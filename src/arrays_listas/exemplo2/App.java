package arrays_listas.exemplo2;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de produtos: ");
        int n = sc.nextInt();

        Product[] vetor = new Product[n]; 

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vetor[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            sum += vetor[i].getPrice();
        }

        double avg = sum / n;
        System.out.println("AVERAGE PRICE =  %.2f%n" +avg);

        sc.close();
    }
    
}
