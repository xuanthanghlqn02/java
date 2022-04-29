public class _202_Happy_Number {
    public static boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            n = sumOfDigits(n);
        }

        if (n == 1) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 13;
        boolean result = isHappy(n);
        System.out.println(result);
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += Math.pow(num % 10, 2);
            num = num / 10;
        }
        return sum;
    }
}
