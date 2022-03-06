//package techmaster.product;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class ProductFunction {
//    static Scanner sc = new Scanner(System.in);
//
//    public static ArrayList<Product> createProducts() {
////        Scanner sc = new Scanner(System.in);
//        ArrayList<Product> products = new ArrayList<>();
//
//        System.out.print("Enter the number of the product: ");
//        int numberOfProduct = Integer.parseInt(sc.nextLine());
//
//        for (int i = 1; i <= numberOfProduct; i++) {
//            System.out.println("Enter the info of the product " + i + ":");
//
//            System.out.print("ID: ");
//            int id = Integer.parseInt(sc.nextLine());
//
//            System.out.print("Name: ");
//            String name = sc.nextLine();
//
////            Category category = null;
////            while (true) {
////                System.out.print("Please choose the category of product(include CPU or RAM or MAINBOARD): ");
////                String categoryStr = sc.nextLine();
////                if (categoryStr.equalsIgnoreCase("CPU")) {
////                    category = Category.CPU;
////                    break;
////                } else if (categoryStr.equalsIgnoreCase("RAM")) {
////                    category = Category.RAM;
////                    break;
////                } else if (categoryStr.equalsIgnoreCase("MAINBOARD")) {
////                    category = Category.MAINBOARD;
////                    break;
////                }
//            }
//
//            System.out.print("Quality: ");
//            int quanlity = Integer.parseInt(sc.nextLine());
//
//            System.out.print("Price: ");
//            long price = Long.parseLong(sc.nextLine());
//
//            Product p = new Product(id, name, category, quanlity, price);
//
//            products.add(p);
//        }
//
//        return products;
//    }
//
//    public static void showList(ArrayList<Product> list) {
//        System.out.println("List of all products");
//        for (Product x : list) {
//            System.out.println(x);
//        }
//    }
//
//    public static void searchProductName(Product list) {
//        System.out.print("Enter the name of the product you want to search: ");
//        String searchStringName = sc.nextLine();
//        for (int i = 0; i < createProducts().size(); i++) {
//            if (list.getName().equalsIgnoreCase(searchStringName)) {
//                System.out.println(list);
//            } else {
//                System.out.println("Do not have this product name!");
//            }
//        }
//    }
//}
