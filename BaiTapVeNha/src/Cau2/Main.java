package Cau2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bài toán: Nhập vào hai chuỗi và thực hiện tính toán các yêu cầu sau:");
        System.out.println("Yêu cầu: So sánh giá trị & kích thước của hai chuỗi nhập vào, kiểm tra chuỗi T1 có chứa chuỗi T2 không?");
        System.out.println("Nhập vào giá trị chuỗi thứ nhất: ");
        String str1 = scan.nextLine();
        System.out.println("Nhập vào giá trị chuỗi thứ hai: ");
        String str2 = scan.nextLine();
        if (str1.equals(str2)) {
            System.out.println("Hai chuỗi có giá trị tương đương");
        } else {
            System.out.println("Hai chuỗi có giá trị khác nhau");
        }

        if (str1.length() > str2.length()) {
            System.out.println("Chuỗi thứ nhất có kích thước lớn hơn chuỗi thứ hai");
        } else {
            if (str1.length() < str2.length()) {
                System.out.println("Chuỗi thứ hai có kích thước lớn hơn chuỗi thứ nhất");
            } else {
                System.out.println("Hai chuỗi có kích thước bằng nhau");
            }
        }

        if (str1.contains(str2)) {
            System.out.println("Chuỗi thứ nhất có chứa chuỗi thứ hai");
        } else {
            System.out.println("Chuỗi thứ nhất không chứa chuỗi thứ hai");
        }
    }
}
