package enum1;

import java.util.Arrays;

public class Basket {
    private Product[] products;

    public Basket(Product[] products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return Arrays.stream(products).mapToDouble(Product::getPrice).sum();
    }

    public Product[] getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + Arrays.toString(products) +
                '}';
    }
}