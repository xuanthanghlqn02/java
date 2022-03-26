import java.util.ArrayList;
import java.util.Scanner;

public class BookFunction {
    public ArrayList<Book> addBook() {
        ArrayList<Book> list = new ArrayList<>();
        TextBook tb1 = new TextBook(1,"Cuoc song","ABC","Nguyen Van A","Khoa hoc",2005,"Kim Dong",120,10);
        TextBook tb2 = new TextBook(2,"Khoa hoc","ABC","Nguyen Van A","Khoa hoc",2005,"Kim Dong",120,10);
        TextBook tb3 = new TextBook(3,"Doi song","ABC","Nguyen Van A","Khoa hoc",2005,"Kim Dong",120,10);
        ElectronicDocuments ed1 = new ElectronicDocuments(4,"Mach dien","ABC",
                "Nguyen Van A","Khoa hoc",2005,"Kim Dong",120,10);
        ElectronicDocuments ed2 = new ElectronicDocuments(5,"Mach dien","ABC",
                "Nguyen Van A","Khoa hoc",2005,"Kim Dong",120,10);
        ElectronicDocuments ed3 = new ElectronicDocuments(6,"Mach dien","ABC",
                "Nguyen Van A","Khoa hoc",2005,"Kim Dong",120,10);
        list.add(tb1);
        list.add(tb2);
        list.add(tb3);
        list.add(ed1);
        list.add(ed2);
        list.add(ed3);

        return list;
    }

    public void showBooks(ArrayList<Book> list) {
        System.out.println("danh sach");
        for (Book x : list) {
            System.out.println(x);
        }
    }
}
