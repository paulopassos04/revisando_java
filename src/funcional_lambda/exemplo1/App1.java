package funcional_lambda.exemplo1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App1 {
    public static void main(String[] args){

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

        //list.sort(new MyComparator());

        /* 
         *  Comparator<Product> comp1 = new Comparator<Product>() {
                public int compare(Product p1, Product p2){
                    return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
                }
            };
        */
       
        Comparator<Product> comp2 = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for(Product product : list){
            System.out.println(product);
        }
    }
}
