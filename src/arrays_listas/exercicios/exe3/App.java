package arrays_listas.exercicios.exe3;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas? ");
        int number = sc.nextInt();

        Person[] vetorPersons = new Person[number];

        for (int i = 0; i < vetorPersons.length; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Height: ");
            double height = sc.nextDouble();

            vetorPersons[i] = new Person(name, age, height);
        }

        double sum = 0.0;
        for (int i = 0; i < vetorPersons.length; i++) {
            sum += vetorPersons[i].getHeight();
        }

        double avg = sum / vetorPersons.length;

        int minors = 0;
        for (int i = 0; i < vetorPersons.length; i++) {
            if(vetorPersons[i].getAge() < 16){
                minors++;
            }
        }

        double percentage_minors = ((double)minors / number) * 100.0;

        System.out.printf("\nAltura media = %.2f\n", avg);
	    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentage_minors);

        for (int i = 0; i < vetorPersons.length; i++) {
            if(vetorPersons[i].getAge() < 16){
                System.out.printf("%s\n", vetorPersons[i].getName());
            }
        }

        sc.close();
    }
    
}
