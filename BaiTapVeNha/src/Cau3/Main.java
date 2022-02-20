package Cau3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        int stn = rd.nextInt(6);
        System.out.println("Số ngẫu nhiên thứ nhất: " + stn);
        int sth = rd.nextInt(6);
        System.out.println("Số ngẫu nhiên thứ hai: " + sth);
        String result = (stn == sth) ? "Hai số ngẫu nhiên bằng nhau" : "Hai số ngẫu nhiên không bằng nhau";
        System.out.println(result);
    }
}
