import java.util.ArrayList;
import java.util.Scanner;

public class BookFunction {
    ArrayList<Book> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public ArrayList<Book> addTextBook() {
        System.out.print("Nhap ID: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap ten sach: ");
        String bookName = sc.nextLine();
        System.out.print("Nhap mo ta sach: ");
        String description = sc.nextLine();
        System.out.print("Nhap ten tac gia: ");
        String author = sc.nextLine();
        System.out.print("Nhap the loai sach: ");
        String category = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        int releaseYear = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap ten nha xuat ban: ");
        String bookPublisher = sc.nextLine();
        System.out.print("Nhap so trang sach: ");
        int pageNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so luong sach: ");
        int quantity = Integer.parseInt(sc.nextLine());

        TextBook textBook = new TextBook(id, bookName, description, author, category, releaseYear, bookPublisher, pageNumber, quantity);
        list.add(textBook);
        return list;
    }

    public ArrayList<Book> addElectronicDocuments() {
        System.out.print("Nhap ID: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap ten sach: ");
        String bookName = sc.nextLine();
        System.out.print("Nhap mo ta sach: ");
        String description = sc.nextLine();
        System.out.print("Nhap ten tac gia: ");
        String author = sc.nextLine();
        System.out.print("Nhap the loai sach: ");
        String category = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        int releaseYear = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap ten nha xuat ban: ");
        String bookPublisher = sc.nextLine();
        System.out.print("Nhap vao dung luong sach: ");
        int capacity = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap vao so luot tai sach: ");
        int downloads = Integer.parseInt(sc.nextLine());

        ElectronicDocuments eDocument = new ElectronicDocuments(id, bookName, description, author, category, releaseYear, bookPublisher, capacity, downloads);
        list.add(eDocument);
        return list;
    }

    public void showBooks(ArrayList<Book> list) {
        System.out.println("Danh sach sau khi nhap them sach vao: ");
        for (Book x : list) {
            System.out.println(x);
        }
    }
}
