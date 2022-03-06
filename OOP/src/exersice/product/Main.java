package exersice.product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Get the list of all products
        ProductFunction pf = new ProductFunction();

        ProductFunction.showProducts(ProductFunction.getProducts());
        System.out.println("\n---------------------------");

//        Search product name
        ProductFunction.searchProductName(ProductFunction.getProducts());
        System.out.println("\n---------------------------");
//        Get products with quatiry < 5
        System.out.println("Get products with their quatity < 5");
        ProductFunction.getQuatityOfProduct(ProductFunction.getProducts());
        System.out.println("\n---------------------------");

//        Search product by ID
        ProductFunction.searchProductByID(ProductFunction.getProducts());
    }
}
