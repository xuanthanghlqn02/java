package Cau2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String str = "You only live once, but if you do it right, once is enough";
        char someChar1 = ' ';
        int count1 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == someChar1) {
                count1++;
            }
        }
        int Result1 = count1 + 1;
        System.out.println("Số từ trong chuỗi: " + Result1);

        System.out.println("\n-------------------");

        char someChar2 = 'o';
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == someChar2) {
                count2++;
            }
        }
        System.out.println("Số ký tự 'o' trong chuỗi: " + count2);

        System.out.println("\n-------------------");

        int index = 0;
        System.out.print("Vị trí của các ký tự 'o': ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == someChar2) {
                index = i;
                System.out.print(index + "  ");
            }
        }
    }
}
