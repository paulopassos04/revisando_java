package generics.exemplo3;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args){

        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        //set.removeIf(x -> x.charAt(0) == 'T');

        for(String p : set){
            System.out.println(p);
        }
    }
}
