package techmaster.product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductFunction productFunction = new ProductFunction();
        List<Product> products = productFunction.createProducts();

        System.out.println(products);
    }
}
