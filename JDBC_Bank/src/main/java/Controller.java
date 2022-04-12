import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        UserServices US = new UserServices();
        TransactionServices TS = new TransactionServices();

        System.out.println("Moi ban dang nhap vao he thong");

        System.out.print("Nhap ten dang nhap: ");
        String mobile = sc.nextLine();

        System.out.print("Nhap mat khau: ");
        String password = sc.nextLine();

        User loginUser = US.checkLogin(US.getAllUser(), mobile, password);
        if (loginUser == null) {
            System.out.println("Dang nhap that bai! Vui long kiem tra lai so dien thoai hoac mat khau!");
            System.exit(0);
        }

//        boolean check = true;
        while (true) {
            System.out.println("Vui long nhap vao tinh nang ban muon su dung: ");
            System.out.println("1. Truy van so du tai khoan");
            System.out.println("2. Thuc hien chuyen tien");
            System.out.println("3. Xem lich su giao dich");
            System.out.println("4. Dang xuat");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            int luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    long soDu = US.getBalance(loginUser);
                    System.out.println("So du tai khoan cua ban la: " + soDu + " VND");
                    System.out.println("------------------------------------");
                    break;

                case 2:
                    long soDuTaiKhoan = US.getBalance(loginUser);
                    System.out.println("So du tai khoan cua ban la: " + soDuTaiKhoan + " VND");

                    long soDuKhaDung = US.getBalance(loginUser) - 50000;
                    System.out.println("So du kha dung: " + soDuKhaDung + " VND");

                    String beneficiaryAccount = null;
                    while (true) {
                        System.out.print("Nhap vao so tai khoan ban muon thuc hien chuyen tien: ");
                        beneficiaryAccount = sc.nextLine();
                        if (beneficiaryAccount.equalsIgnoreCase(loginUser.getAccount())) {
                            System.out.println("Ban khong the tu chuyen tien cho chinh minh! Vui long nhap lai!");
                        } else {
                            break;
                        }
                    }

                    long money = 0;
                    while (true) {
                        System.out.print("Nhap vao so tien ban muon chuyen (toi thieu tren 50.000): ");
                        money = Long.parseLong(sc.nextLine());
                        if (money > 50000 && money < (loginUser.getBalance() - 50000)) {
                            break;
                        } else {
                            System.out.println("So tien nhap vao khong hop le! Vui long nhap lai!");
                        }
                    }

                    System.out.print("Nhap vao noi dung chuyen tien: ");
                    String content = sc.nextLine();

                    TransactionHistory createTransaction = TS.createTransaction(loginUser, content, money, beneficiaryAccount);
                    TS.insertTransaction(createTransaction);

                    ArrayList<User> list = US.getAllUser();
                    int count = 0;
                    for (User u : list) {
                        if (beneficiaryAccount.equalsIgnoreCase(u.getAccount())) {
                            US.updateBalanceOfRootAccount(loginUser, createTransaction);
                            US.updateBalanceOfBeneficiaryAccount(createTransaction);
                            count++;
                        }
                    }

                    if (count == 0) {
                        System.out.println("Khong truy van duoc den so tai khoan nay! Vui long thuc hien lai!");
                    }

                    break;

                case 3:
                    System.out.println("Lich su giao dich cua tai khoan: " + loginUser.getMobile());
                    TS.getTransaction(loginUser).forEach(System.out::println);
                    System.out.println("------------------------------------");
                    break;

                case 4:
                    menu();
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Khong co lua chon nay! Vui long nhap lai");
            }
        }
    }
}
