package Cau1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài của 2 cạnh góc vuông: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = Math.sqrt((a * a + b * b));
        System.out.println("Chiều dài cạnh góc huyền là: " + c);
    }
}
