package generics.exemplo1;

import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        PrintService<String> printService = new PrintService<>();

        System.out.print("How many values ? ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            String value = sc.next();
            printService.add(value);
        }

        printService.print();
        System.out.println("First: " + printService.first());

        sc.close();
    }
}
