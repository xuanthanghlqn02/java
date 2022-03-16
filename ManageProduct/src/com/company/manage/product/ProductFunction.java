package com.company.manage.product;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ProductFunction {

    static Scanner sc = new Scanner(System.in);

    public ArrayList<Product> getProducts() {
        Product p1 = new Product(1, "Intel core i3-10100", Category.CPU, 5, 140000L);
        Product p2 = new Product(2, "Intel core i3-12100", Category.CPU, 2, 60000L);
        Product p3 = new Product(3, "Gskill 8GB DDR4", Category.RAM, 10, 120000L);
        Product p4 = new Product(4, "Gigabyte H410M V2", Category.MAIN, 12, 240000L);
        Product p5 = new Product(5, "Asus B460", Category.MAIN, 12, 300000L);
        Product p6 = new Product(6, "Kingston 16GB DDR4", Category.RAM, 5, 40000L);

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
//        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the product name you want to search: ");
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

    public void searchByID(ArrayList<Product> list) {
//        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the product ID you want to search: ");
        int id = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (Product x : list) {
            if (x.getId() == id) {
                System.out.println(x);
                count++;
                System.out.print("Do you want to delete this product? Y/N: ");
                String anwser = sc.nextLine();
                if (anwser.equalsIgnoreCase("Y")) {
                    list.remove(x);
                    System.out.println("This product have been removed from the list!");
                    break;
                }

                if (anwser.equalsIgnoreCase("N")) {
                    System.out.println("No products have been removed from the list!");
                } else {
                    System.out.println("Do not have this choice!");
                }
                break;
            }
        }

        if (count == 0) {
            System.out.println("Do not have this product ID!");
        }
    }

    public void updateProductQuantity(ArrayList<Product> list) {
        System.out.print("What the product ID do you want to update?: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the quantity you want to update for this product ID: ");
        int quantity = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (Product x : list) {
            if (x.getId() == id) {
                x.setQuantity(quantity);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Do not have this product ID!");
        }
    }

    public void showProductLessThan50000(ArrayList<Product> list) {
        System.out.println("Price of products < 50000");
        for (Product x : list) {
            if (x.getPrice() < 50000) {
                System.out.println(x);
            }
        }
    }

    public void showProductInPriceRange(ArrayList<Product> list) {
        System.out.println("Enter the price range you want to show");
        System.out.print("From: ");
        long from = Long.parseLong(sc.nextLine());
        System.out.print("To: ");
        long to = Long.parseLong(sc.nextLine());
        System.out.println("List of products you want to show: ");
        for (Product x : list) {
            if (x.getPrice() >= from && x.getPrice() <= to) {
                System.out.println(x);
            }
        }
    }

    public void filterByCategory(ArrayList<Product> list) {
        System.out.println("Do you want to filter products by the product category? Please choose the number:");
        System.out.print("1: CPU \t");
        System.out.print("2: RAM \t");
        System.out.println("3: MAIN");
        System.out.print("Answer: ");
        int filter = Integer.parseInt(sc.nextLine());
        switch (filter) {
            case 1:
                for (Product x : list) {
                    if (x.getCategory() == Category.CPU) {
                        System.out.println(x);
                    }
                }
                break;
            case 2:
                for (Product x : list) {
                    if (x.getCategory() == Category.RAM) {
                        System.out.println(x);
                    }
                }
                break;
            case 3:
                for (Product x : list) {
                    if (x.getCategory() == Category.MAIN) {
                        System.out.println(x);
                    }
                }
                break;
            default:
                System.out.println("Do not have this choice!");
                System.out.println("The end!");
        }
    }
}
