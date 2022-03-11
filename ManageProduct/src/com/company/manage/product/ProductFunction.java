package com.company.manage.product;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ProductFunction {
    public ArrayList<Product> getProducts() {
        Product p1 = new Product(1, "Intel core i3-10100", Category.CPU, 5, 4000000L);
        Product p2 = new Product(2, "Intel core i3-12100", Category.CPU, 2, 5000000L);
        Product p3 = new Product(3, "Gskill 8GB DDR4", Category.RAM, 10, 800000L);
        Product p4 = new Product(4, "Gigabyte H410M V2", Category.MAIN, 12, 2000000L);
        Product p5 = new Product(5, "Asus B460", Category.MAIN, 12, 3000000L);
        Product p6 = new Product(6, "Kingston 16GB DDR4", Category.RAM, 5, 1000000L);

        ArrayList<Product> listProducts = new ArrayList<>();
        listProducts.add(p1);
        listProducts.add(p2);
        listProducts.add(p3);
        listProducts.add(p4);
        listProducts.add(p5);
        listProducts.add(p6);

        return listProducts;
    }

    public void show(ArrayList<Product> list) {
        for (Product x : list) {
            System.out.println(x);
        }
    }

    public void searchByName(ArrayList<Product> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name you want to search: ");
        String name = sc.nextLine();
        int count = 0;
        for (Product x : list) {
            if (x.getName().toLowerCase().contains(name)) {
                System.out.println(x);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Do not have this product name!");
        }
    }

    public void getProductsLessThan5(ArrayList<Product> list) {
        for (Product x : list) {
            if (x.getQuantity() < 5) {
                System.out.println(x);
            }
        }
    }
}
