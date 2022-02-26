// Đề bài: Liệt kê các số nguyên tố nhỏ hơn 10

package Cau4;

public class Main2 {
    public static void main(String[] args) {
        int x = 0;
        System.out.print("Các số nguyên tố nhỏ hơn 10 bao gồm: ");
        while (true) {
            if (isPrimeNumber(x) && x < 10) {
                System.out.print(x + "  ");
            }
            x++;

            if (x > 10) {
                break;   //Ngắt vòng lặp khi đã đủ điều kiện để đỡ tốn tài nguyên hệ thống.
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
