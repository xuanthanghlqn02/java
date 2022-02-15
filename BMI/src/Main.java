public class Main {
    public static void main(String[] args) {
        // Kiểu trả về void
        Calculator.bmi();
        // Kiểu trả về double
        System.out.println("Chỉ số BMI_Double của bạn là: " + Calculator.bmiDouble());
        // Kiểu trả về truyền tham số
        double weight = 50.4;
        double height = 1.6;
        System.out.println("Chỉ số BMI_Params của bản là: " + Calculator.bmiDouble(weight, height));
    }
}