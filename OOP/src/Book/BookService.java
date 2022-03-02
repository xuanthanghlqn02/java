package Book;

import java.time.Year;
import java.util.Scanner;

public class BookService {
    public static Book[] getAllBook() {
        Book[] listBook = new Book[4];
        listBook[0] = new Book(1, "Cong nghe thong tin", "Nguyen Xuan Nam",
                "Khoa Hoc", "NXB Kim Dong", 2022);
        listBook[1] = new Book(2, "Lap trinh Java", "Phuong Duy Tung",
                "Khoa Hoc", "NXB Thanh nien", 2021);
        listBook[2] = new Book(3, "Doi song xa hoi", "Nguyen Dang Khoa",
                "Doi Song", "NXB Tuoi Tre", 2022);
        listBook[3] = new Book(4, "Cong nghe thong tin", "Nguyen Dang Khoa",
                "Khoa Hoc", "NXB Tuoi Tre", 2018);

        return listBook;
    }

    public static void showBook(Book[] listBook) {
        for (Book x : listBook) {
            System.out.println(x);
        }
    }

    public static void searchBookName(Book[] listBook) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten sach ban muon tim: ");
        String nameBook = sc.nextLine();
        int count = 0;
        for (Book x : listBook) {
            if (x.tenSach.equalsIgnoreCase(nameBook)) {
                System.out.println(x);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Khong co ten sach ban can tim!!!");
        }
    }

    public static void searchTypeName(Book[] listBook) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao the loai sach ban muon tim: ");
        String typeBook = sc.nextLine();
        int count = 0;
        for (Book x : listBook) {
            if (x.theLoai.equalsIgnoreCase(typeBook)) {
                System.out.println(x);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Khong co the loai sach ban can tim!!!");
        }
    }

    public static void showPublishingYear(Book[] listBook) {
        int year = Year.now().getValue();
        for (Book x : listBook) {
            if (x.namXuatBan == year) {
                System.out.println(x);
            }
        }
    }
}
