package Cau1;

public class Main {
    public static void main(String[] args) {
        String str = "Hello every one!";
        int tongKyTuXuatHien = 0;
        char kyTu;
        for (int i = 0; i < str.length(); i++) {
            kyTu = str.charAt(i);
            if (kyTu == 'e') {
                tongKyTuXuatHien++;
            }
            // System.out.println("Ký tự \"e\" trong chuỗi đã cho xuất hiện tổng cộng " + tongKyTuXuatHien + " lần");
        }
        System.out.println("Ký tự \"e\" trong chuỗi đã cho xuất hiện tổng cộng " + tongKyTuXuatHien + " lần");
        System.out.println("Ký tự \"e\" có vị trí thứ " + str.indexOf("e", 0) + " trong chuỗi đã cho");
    }
}
