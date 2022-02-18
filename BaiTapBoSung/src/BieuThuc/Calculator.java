package BieuThuc;

import java.util.Scanner;

public class Calculator {
    public static int phepCong(int x, int y) {
        return x + y;
    }

    public static int phepTru(int x, int y) {
        return x - y;
    }

    public static int phepNhan(int x, int y) {
        return x * y;
    }

    public static double phepChia(double x, double y) {
        return x / y;
    }

    public static double phepLuyThua(double x) {
        return Math.sqrt(x);
    }
}
