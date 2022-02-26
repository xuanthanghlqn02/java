// Đề bài: Liệt kê 10 số nguyên tố đầu tiên

package Cau4;

public class Main {
    public static void main(String[] args) {
        int n;
        int count = 0;   // Khai báo biến đếm count, gán count = 0
        System.out.print("10 số nguyên tố đầu tiên: ");
        for (int i = 2; i < 1000; i++) {        // Tuỳ vào lượng số nguyên tố cần in ra để sử dụng số vòng lặp
            n = i;                             // Không nhất thiết là 1000 vòng
            if (isPrimeNumber(n)) {
                System.out.print(n + "  ");  // nếu là số nguyên tố thì in ra
                count++;                    // và tăng biến đếm count++
            }
            if (count == 10) {             // cần in 10 số đầu tiên nên gán count = 10 thì ngắt
                break;
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
