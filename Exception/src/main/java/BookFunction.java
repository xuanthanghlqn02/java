import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BookFunction {

    static Scanner sc = new Scanner(System.in);

    public Book[] getAllBooks() {
        Gson gson = new Gson();
        Book[] book = null;
        FileReader reader;

        {
            try {
                reader = new FileReader("book.json");
                book = gson.fromJson(reader, Book[].class);
            } catch (FileNotFoundException e) {
                System.out.println("Khong tim thay file!");
            }
        }
        return book;
    }

    public void show(Book[] book) {
        for (Book x : book) {
            System.out.println(x);
        }
    }

    public void searchBookByName(Book[] book) {

        System.out.print("Nhap vao ten sach muon tim: ");
        String bookName = sc.nextLine();
        int count = 0;
        for (Book x : book) {
            if (x.getTitle().toUpperCase().contains(bookName.toUpperCase())) {
                System.out.println(x);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Khong co ten sach ban muon tim!");
        }
    }

    public void searchBookByCategory (Book[] book) {
        System.out.print("Nhap vao the loai sach muon tim: ");
    }

}
