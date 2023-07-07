package funcional_lambda.exemplo03;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product>{

    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
    
}
