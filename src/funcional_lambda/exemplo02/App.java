package funcional_lambda.exemplo02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args){
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD case", 80.90));

        //list.removeIf(p -> p.getPrice() >= 100);
        //list.removeIf(new ProductPredicate());
        //list.removeIf(Product::staticProductPredicate);
        //list.removeIf(Product::NoStaticProductPredicate);
        
        Predicate<Product> pred1 = (product) -> product.getPrice() >= 100;

        list.removeIf(pred1);
        for(Product product : list){
            System.out.println(product);
        }
    }
    
}
