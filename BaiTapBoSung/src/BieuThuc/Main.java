package BieuThuc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Chọn phép tính mà bạn muốn tính: ");
        System.out.println("1 - Phép cộng");
        System.out.println("2 - Phép trừ");
        System.out.println("3 - Phép nhân");
        System.out.println("4 - Phép chia");
        System.out.println("5 - Phép tính luỹ thừa");
        int x = scan.nextInt();
        switch (x) {
            case 1:
                System.out.println("Nhập hai số tự nhiên bạn muốn thực hiện tính toán");
                int a = scan.nextInt();
                int b = scan.nextInt();
                System.out.println("Kết quả phép tính là: " + Calculator.phepCong(a, b));
                break;
            case 2:
                System.out.println("Nhập hai số tự nhiên bạn muốn thực hiện tính toán");
                int c = scan.nextInt();
                int d = scan.nextInt();
                System.out.println("Kết quả phép tính là: " + Calculator.phepTru(c, d));
                break;
            case 3:
                System.out.println("Nhập hai số tự nhiên bạn muốn thực hiện tính toán");
                int e = scan.nextInt();
                int f = scan.nextInt();
                System.out.println("Kết quả phép tính là: " + Calculator.phepNhan(e, f));
                break;
            case 4:
                System.out.println("Nhập hai số tự nhiên bạn muốn thực hiện tính toán");
                int g = scan.nextInt();
                int h = scan.nextInt();
                System.out.println("Kết quả phép tính là: " + Calculator.phepChia(g, h));
                break;
            case 5:
                System.out.println("Nhập số tự nhiên bạn muốn thực hiện tính toán");
                int i = scan.nextInt();
                System.out.println("Kết quả phép tính là: " + Calculator.phepLuyThua(i));
                break;
            default:
                System.out.println("Phép tính bạn chọn không có trong danh sách");
        }
        System.out.println("Kết thúc chương trình!!!");
    }
}
