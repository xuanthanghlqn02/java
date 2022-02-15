public class Calculator {
    public static void bmi() {
        double height = 1.7;
        double weight = 70.5;
        double bmi = weight / (height * height);
        System.out.println("Chỉ số BMI_Void của bạn là: " + bmi);
    }

    public static double bmiDouble() {
        double height = 1.8;
        double weight = 75.5;
        double bmi = weight / (height * height);
        return bmi;
    }

    public static double bmiDouble(double weight, double height) {
        double bmi = weight / (height * height);
        return bmi;
    }
}