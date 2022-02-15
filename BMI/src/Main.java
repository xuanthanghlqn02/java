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
        // Tính chu vi và diện tích hình tròn
        System.out.println("Chu vi hình tròn là: " + HinhTron.chuVi());
        System.out.println("Diện tích hình tròn là: " + HinhTron.dienTich());
        // Tính chu vi và diện tích hình chữ nhật
        System.out.println("Chu vi HCN là: " + HinhChuNhat.chuVi());
        System.out.println("Diện tích HCN là: " + HinhChuNhat.dienTich());
        // Tính chu vi và diện tích hình tam giác, kiểu trả về void
        HinhTamGiac.chuVi();
        HinhTamGiac.dienTich();
    }
}