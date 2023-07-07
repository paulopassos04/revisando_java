package funcional_lambda.exemplo03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD case", 80.90));

        //list.forEach(new PriceUpdate());
        //list.forEach(Product::staticPriceUpdate);
        //list.forEach(Product::NotStaticPriceUpdate);

        Consumer<Product> cons1 = product -> product.setPrice(product.getPrice() * 1.1);

        list.forEach(product -> product.setPrice(product.getPrice() * 1.1));

        list.forEach(System.out::println);
    }

}
