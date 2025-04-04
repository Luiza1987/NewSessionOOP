package enum1;

public class Basket {
    Product[] products; //Massiv productov
    int count; // Kolichestvo produktov

    //Constructor
    public Basket() {
        this.products = new Product[10]; // max 10 tovarov
        this.count = 0;
    }

    // metod dobavlenie tovara
    public void addProduct(Product product) {
        if (count < products.length) {
            products[count++] = product;
        }
    }

    //vycheslenie tovara
    public double getTotalPrice() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += products[i].price;
        }
        return total;
    }
}