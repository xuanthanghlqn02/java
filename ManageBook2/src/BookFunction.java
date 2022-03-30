import java.util.ArrayList;
import java.util.Scanner;

public class BookFunction {
    ArrayList<TextBook> listTBook = new ArrayList<>();
    ArrayList<ElectronicDocuments> listEDocument = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public ArrayList<TextBook> addTextBook() {
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
        listTBook.add(textBook);
        return listTBook;
    }

    public ArrayList<ElectronicDocuments> addElectronicDocuments() {
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
        listEDocument.add(eDocument);
        return listEDocument;
    }

    public <T> void showBooks(ArrayList<T> list) {
        System.out.println("Danh sach sach: ");
        for (T x : list) {
            System.out.println(x);
        }
    }

    public void searchTBookByName(ArrayList<TextBook> list) {
        System.out.print("Nhap vao ten sach ban muon tim: ");
        String bookName = sc.nextLine();
        int count = 0;
        for (TextBook x : list) {
            if (x.getBookName().toUpperCase().contains(bookName.toUpperCase())) {
                System.out.println(x);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Khong co ten sach ban muon tim!");
            System.out.println("--------------------------");
        }
    }

    public void searchEDocumentByName(ArrayList<ElectronicDocuments> list) {
        System.out.print("Nhap vao ten tai lieu ban muon tim: ");
        String bookName = sc.nextLine();
        int count = 0;
        for (ElectronicDocuments x : list) {
            if (x.getBookName().toUpperCase().contains(bookName.toUpperCase())) {
                System.out.println(x);
                System.out.println("--------------------------");
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Khong co ten tai lieu ban muon tim!");
            System.out.println("--------------------------");
        }
    }

    public void searchTBookByID(ArrayList<TextBook> list) {
        System.out.print("Nhap vao ID sach ban muon tim: ");
        int bookID = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (TextBook x : list) {
            if (x.getId() == bookID) {
                System.out.println(x);
                System.out.println("--------------------------");
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Khong co ID sach ban muon tim!");
            System.out.println("--------------------------");
        }
    }

    public void searchEDocumentByID(ArrayList<ElectronicDocuments> list) {
        System.out.print("Nhap vao ID tai lieu ban muon tim: ");
        int bookID = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (ElectronicDocuments x : list) {
            if (x.getId() == bookID) {
                System.out.println(x);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Khong co ID tai lieu ban muon tim!");
            System.out.println("--------------------------");
        }
    }

    public void deleteTBook(ArrayList<TextBook> list) {
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
        System.out.println("--------------------------");
    }

    public void deleteEDocument(ArrayList<ElectronicDocuments> list) {
        showBooks(list);
        System.out.print("Nhap vao ID tai lieu ban muon xoa: ");
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
            System.out.println("Khong tim thay ID tai lieu nay!");
        }

        showBooks(list);
        System.out.println("--------------------------");
    }

    public void updateTBook(ArrayList<TextBook> list) {
        showBooks(list);
        System.out.print("Nhap vao ID sach giao khoa ban muon cap nhat: ");
        int idBook = Integer.parseInt(sc.nextLine());
        System.out.print("Nhat vao so luong ban muon thay doi: ");
        int change = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == idBook) {
                list.get(i).setQuantity(change);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Khong co ID sach giao khoa nay!");
        }

        showBooks(list);
        System.out.println("--------------------------");
    }

    public void updateEDocument(ArrayList<ElectronicDocuments> list) {
        showBooks(list);
        System.out.print("Nhap vao ID tai lieu dien tu ban muon cap nhat: ");
        int idBook = Integer.parseInt(sc.nextLine());
        System.out.print("Nhat vao so luot tai ban muon thay doi: ");
        int change = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == idBook) {
                list.get(i).setDownloads(change);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Khong co ID tai lieu dien tu nay!");
        }

        showBooks(list);
        System.out.println("--------------------------");
    }

}
