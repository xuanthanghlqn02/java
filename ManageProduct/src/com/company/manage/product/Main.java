package com.company.manage.product;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ProductFunction PF = new ProductFunction();
        ArrayList<Product> listP = PF.getProducts();
        PF.show(listP);

        System.out.println("\n-----------------");

//        System.out.println("Search by the product name");
//        PF.searchByName(listP);

        System.out.println("\n-----------------");

//        System.out.println("Products with the quantity less than 5");
//        PF.getProductsLessThan5(listP);

        System.out.println("\n-----------------");
//        PF.searchByID(listP);
//        System.out.println("List of product after delete:");
//        PF.show(listP);

        System.out.println("\n-----------------");
//        PF.updateProductQuantity(listP);
//        System.out.println("List of product after update:");
//        PF.show(listP);

        System.out.println("\n-----------------");
//        PF.showProductLessThan50000(listP);
//        System.out.println();
//        PF.showProductInPriceRange(listP);

        System.out.println("\n-----------------");
        PF.filterByCategory(listP);
    }
}
