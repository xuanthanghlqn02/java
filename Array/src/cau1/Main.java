package cau1;

import javax.management.StringValueExp;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void normalizeString(String str) {
        str = str.trim().toLowerCase();   // Loại bỏ khoảng trắng ở đầu và cuối & đổi hết về ký tự thường
        str = str.replaceAll("\\s+", " ");  //đổi toàn bộ các khoảng trắng (\\s+) thành 1 khoảng trắng
        String temp[] = str.split(" ");
        str = "";
        for (int i = 0; i < temp.length; i++) {
            String normalizerStr = str + String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1).toLowerCase();
            if (i < temp.length - 1) {   //Nếu i chưa phải là từ cuối cùng thì thêm cho chuỗi chuẩn hoá 1 space
                normalizerStr += " ";
            }
            System.out.print(normalizerStr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to normalize: ");
        String str = sc.nextLine();
        normalizeString(str);
    }
}
