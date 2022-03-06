package exersice.product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductFunction {

    static Scanner sc = new Scanner(System.in);

    public static ArrayList<Product> getProducts() {
        ArrayList<Product> Products = new ArrayList<>();

        Product p1 = new Product(1, "i3-10100", Category.CPU, 5, 4000000);
        Product p2 = new Product(2, "G-Skill 8GB DDR4 2666", Category.RAM, 2, 1000000);
        Product p3 = new Product(3, "H410M-H V2", Category.MAINBOARD, 3, 1500000);
        Product p4 = new Product(4, "G6400", Category.CPU, 10, 2000000);
        Product p5 = new Product(5, "Kingston 8GB DDR4 3200", Category.RAM, 12, 1200000);

        Products.add(p1);
        Products.add(p2);
        Products.add(p3);
        Products.add(p4);
        Products.add(p5);

        return Products;
    }

    public static void showProducts(ArrayList<Product> list) {
        System.out.println("List of all products");
        for (Product x : list) {
            System.out.println(x);
        }
    }

    public static void searchProductName(ArrayList<Product> list) {
        System.out.print("Enter the name of the product you want to search: ");
        String searchNameSring = sc.nextLine();
        int count = 0;
        for (Product x : list) {
            if (x.getName().equalsIgnoreCase(searchNameSring)) {
                System.out.println(x);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Do not have the product name you want to search!");
        }
    }

    public static void getQuatityOfProduct(ArrayList<Product> list) {
        for (Product x : list) {
            if (x.getQuatity() < 5) {
                System.out.println(x);
            }
        }
    }

    public static void searchProductByID(ArrayList<Product> list) {
        System.out.print("Enter the ID of the product you want to search: ");
        int id = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (Product x : list) {
            if (x.getId() == id) {
                System.out.println(x);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Do not find this product ID!");
        }
    }
}
