package Cau2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String resever = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi giá trị mà bạn muốn kiểm tra:");
        String original = scan.nextLine();
        for (int i = original.length() - 1; i >= 0; i--) {
            resever = resever + original.charAt(i);
        }
        if (original.equals(resever)) {
            System.out.println("Kết quả tính toán trả về chuỗi giá trị sau: " + resever + " (trùng với giá trị bạn đã nhập vào).");
            System.out.println("Kết luận: Chuỗi bạn nhập vào là một chuỗi đảo nghịch (Palindrome)");
        } else {
            System.out.println("Kết quả tính toán trả về chuỗi giá trị sau: " + resever + " (không trùng với giá trị bạn đã nhập vào).");
            System.out.println("Kết luận: Chuỗi bạn nhập vào không phải là một chuỗi đảo nghịch (Palindrome)");
        }
    }
}
