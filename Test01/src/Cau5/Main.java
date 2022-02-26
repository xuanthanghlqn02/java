package Cau5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        do {
            System.out.println("Nhập vào số hàng của mảng (phải là số lớn hơn 0): ");
            x = sc.nextInt();
        } while (x < 0);

        do {
            System.out.println("Nhập vào số cột của mảng (phải là số lớn hơn 0): ");
            y = sc.nextInt();
        } while (y < 0);

        int[][] arr = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("Nhập vào phần tử tại hàng thứ: " + i + ", cột thứ: " + j);
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("In mảng vừa nhập vào: ");

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n-------------------------------------------");
        System.out.print("Đường chéo chính: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
