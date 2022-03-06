package com.manage.product;

import java.util.ArrayList;
import java.util.Scanner;

public class Product_Methods extends Product {
    static Scanner sc = new Scanner(System.in);

    public Product_Methods(int id, String name, String type, int quatity, long price) {
        super(id, name, type, quatity, price);
    }


    public static ArrayList<Product> enterProduct() {
        ArrayList<Product> listProduct = new ArrayList<>();
        System.out.println("Nhap vao so san pham: ");
        int numberOfProduct = sc.nextInt();
        for (int i = 1; i < (numberOfProduct + 1); i++) {
            System.out.println("Nhap thong tin cho san pham thu " + i + ":");
            System.out.print("Nhap ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhap ten: ");
            String name = sc.nextLine();
            System.out.print("Nhap kieu san pham: ");
            String type = sc.nextLine();
            System.out.print("Nhap so luong san pham: ");
            int quatity = sc.nextInt();
            System.out.print("Nhap gia ban san pham: ");
            long price = sc.nextLong();
            Product p = new Product(id, name, type, quatity, price);
            listProduct.add(p);
        }
        return listProduct;
    }

    public static void showProduct(ArrayList<Product> listProduct) {
        for (Product x : listProduct) {
            System.out.println(x);
        }
    }
}
