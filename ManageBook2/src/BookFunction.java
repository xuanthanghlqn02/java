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
        System.out.println("Danh sach sach: ");
        for (Book x : list) {
            System.out.println(x);
        }
    }

    public void searchBookByName(ArrayList<Book> list) {
        System.out.print("Nhap vao ten sach ban muon tim: ");
        String bookName = sc.nextLine();
        int count = 0;
        for (Book x : list) {
            if (x.getBookName().toUpperCase().contains(bookName.toUpperCase())) {
                System.out.println(x);
                count++;
            }
        }

        if (count==0) {
            System.out.println("Khong co ten sach ban muon tim!");
        }
    }

    public void searchBookByID(ArrayList<Book> list) {
        System.out.print("Nhap vao ID sach ban muon tim: ");
        int bookID = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (Book x : list) {
            if (x.getId() == bookID) {
                System.out.println(x);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Khong co ID sach ban muon tim!");
        }
    }

    public void deleteBook(ArrayList<Book> list) {
        showBooks(list);
        System.out.print("Nhap vao ID sach ban muon xoa: ");
        int bookID = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == bookID) {
                list.remove(i);
                count++;
                System.out.println("Xoa thanh cong!");
            }
        }

        if (count == 0) {
            System.out.println("Khong tim thay ID sach nay!");
        }

        showBooks(list);
    }

    public void updateElectronicDocuments(ArrayList<TextBook> list) {
        for (TextBook x : list) {
            if (x.getQuantity()>0) {
                System.out.println(x);
            }
        }
    }
}
