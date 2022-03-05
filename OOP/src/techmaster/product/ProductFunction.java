package techmaster.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductFunction {
    public List<Product> createProducts() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        System.out.print("Enter the number of the product: ");
        int numberOfProduct = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= numberOfProduct; i++) {
            System.out.println("Enter the info of the product " + i + " :");

            System.out.print("ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("quality: ");
            int quanlity = Integer.parseInt(sc.nextLine());

            System.out.print("price: ");
            long price = Long.parseLong(sc.nextLine());

            Product product = new Product();

            Category category = null;
            while (true) {
                System.out.print("Please choose the categoryStr of product: ");
                String categoryStr = sc.nextLine();
                if (categoryStr.equalsIgnoreCase("CPU")) {
                    category = Category.CPU;
                    break;
                } else if (categoryStr.equalsIgnoreCase("RAM")) {
                    category = Category.RAM;
                    break;
                } else if (categoryStr.equalsIgnoreCase("MAINBOARD")) {
                    category = Category.MAINBOARD;
                    break;
                }
            }

            product.setCategory(category);
            product.setId(id);
            product.setName(name);
            product.setPrice(price);
            product.setQuatity(quanlity);

            products.add(product);
        }

        return products;
    }
}
