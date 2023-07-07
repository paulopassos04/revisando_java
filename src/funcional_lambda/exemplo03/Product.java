package funcional_lambda.exemplo03;

public class Product {

    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static void staticPriceUpdate(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }

    public void NotStaticPriceUpdate() {
        setPrice(getPrice() * 1.1);
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", price='" + getPrice() + "'" +
                "}";
    }

}
