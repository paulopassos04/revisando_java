package arrays_listas.exemplo4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args){

        List<String> list1 = new ArrayList<>();

        list1.add("Maria");
        list1.add("Alex");
        list1.add("Boy");
        list1.add("Anna");
        list1.add(2, "Marco");
        list1.add("Ammanda");
        list1.add("Amelia");

        System.out.println(list1.size());
        
        for(String x : list1){
            System.out.println(x);
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //list1.remove("Anna");
        list1.removeIf(x -> x.charAt(0) == 'M');

        for(String x : list1){
            System.out.println(x);
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Index of Boy " +list1.indexOf("Boy"));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        List<String> result = list1.stream()
            .filter(x -> x.charAt(0) == 'A')
            .collect(Collectors.toList());

        System.out.print(result);

        for(String x : result){
            System.out.println(x);
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        String name = list1.stream()
            .filter(x -> x.charAt(0) == 'A')
            .findFirst()
            .orElse(null);

        System.out.println(name);

    }
}
