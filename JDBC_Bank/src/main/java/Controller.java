import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);

    public void menu() {
        UserServices US = new UserServices();
        System.out.println("1. Dang nhap he thong");
        int luaChon = Integer.parseInt(sc.nextLine());
        switch (luaChon) {
            case 1:
                System.out.print("Nhap ten dang nhap:");
                String mobile = sc.nextLine();
                System.out.print("Nhap mat khau:");
                String password = sc.nextLine();
                User user = US.checkLogin(US.getAllUser(), mobile, password);
                System.out.println(user);
                break;
        }
    }
}
