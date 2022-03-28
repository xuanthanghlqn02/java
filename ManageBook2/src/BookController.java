import java.util.Scanner;

public class BookController {
    static Scanner sc = new Scanner(System.in);
    static BookFunction BF = new BookFunction();

    public static void menu() {
        while (true) {
            System.out.println("1. Them sach moi");
            System.out.println("2. Tim sach theo ten");
            System.out.println("3. Tim sach theo ID");
            System.out.println("4. Xoa sach");
            System.out.println("5. Cap nhat so luong sach");
            System.out.println("6. Cap nhat so luot tai");
            System.out.println("7. Thoat chuong trinh");
            System.out.print("Nhap vao lua chon cua ban: ");
            int luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    addBook();
                    break;
                case 2:
                    BF.searchBookByName(BF.list);
                    break;
                case 3:
                    BF.searchBookByID(BF.list);
                    break;
                case 4:
                    BF.deleteBook(BF.list);
                    break;
                case 7:
                    System.exit(0);
            }
        }

    }

    public static void addBook() {
        System.out.println("1. Them sach giao khoa: ");
        System.out.println("2. Them tai lieu dien tu: ");
        System.out.println("3. Quay lai bang dieu khien: ");
        System.out.println("4. Thoat chuong trinh!");
        System.out.print("Nhap vao lua chon cua ban: ");
        int luaChon1 = Integer.parseInt(sc.nextLine());
        switch (luaChon1) {
            case 1:
                BF.showBooks(BF.addTextBook());
                break;
            case 2:
                BF.showBooks(BF.addElectronicDocuments());
                break;
            case 3:
                menu();
            case 4:
                System.exit(0);
            default:
                System.out.println("Khong co lua chon nay!!");
        }

    }

}
