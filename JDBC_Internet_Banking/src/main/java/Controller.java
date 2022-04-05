import java.util.Scanner;

public class Controller {

    static Scanner sc = new Scanner(System.in);

    public static void menu(){
        System.out.println("");
        System.out.print("Nhap vao lua chon ban muon: ");
    }

    public void login(User user) {
        System.out.println("Nhap phone number: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Nhap password:");
        String password = sc.nextLine();
    }
}
