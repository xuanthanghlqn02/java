package Book;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mang quan li sach: ");
        BookService.showBook(BookService.getAllBook());
        System.out.println("\n------------------------");
        System.out.println("Tim sach theo ten:");
        BookService.searchBookName(BookService.getAllBook());
        System.out.println("\n------------------------");
        System.out.println("Tim sach theo the loai:");
        BookService.searchTypeName(BookService.getAllBook());
        System.out.println("\n------------------------");
        System.out.println("Nhung sach xuat ban trong nam nay (2022)");
        BookService.showPublishingYear(BookService.getAllBook());
    }
}
