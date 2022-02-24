package cau2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng (số phần tử mảng phải lớn hơn 0): ");
            n = sc.nextInt();
        } while (n < 0);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử mảng thứ " + i + ":");
            arr[i] = sc.nextInt();
        }

        System.out.println("Mảng hình thành: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n-----------------------------------");
        System.out.println("Thay đổi các phần tử là số chẵn thì tăng lên 1 phần tử: ");
        System.out.print("Kết quả: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]++;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
