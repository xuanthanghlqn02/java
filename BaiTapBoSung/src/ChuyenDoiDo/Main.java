package ChuyenDoiDo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào cách thức bạn muốn chuyển đổi");
        System.out.println("1 - Đổi độ C sang độ F");
        System.out.println("2 - Đổi độ F sang độ C");
        int x = scan.nextInt();
        if (x == 1) {
            System.out.println("Nhập vào số độ C mà bạn muốn đổi sang độ F");
            int doC = scan.nextInt();
            System.out.println("Kết quả: " + doC + " độ C đổi ra bằng " + Calculator.chuyenDoCSangF(doC) + " độ F");
        } else {
            if (x == 2) {
                System.out.println("Nhập vào số độ F mà bạn muốn đổi sang độ C");
                int doF = scan.nextInt();
                System.out.println("Kết quả: " + doF + " độ F đổi ra bằng " + Calculator.chuyenDoFsangC(doF) + " độ C");
            } else {
                System.out.println("Phương thức bạn nhập vào không có!!!");
            }
            //System.out.println("kết thúc chương trình!!!");
        }
        System.out.println("kết thúc chương trình!!!");
    }
}
