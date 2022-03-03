//      Exersice: Quản lý sách
//      Viết chương trình quản lý sách. Biết sách gồm các thông tin sau: mã sách, tên sách, tác giả, thể loại, nhà xuất bản, năm xuất bản. Thực hiện:
//        Tạo mảng để quản lý sách
//        Tìm sách theo tên
//        Tìm sách theo thể loại
//        Liệt kê các sách xuất bản trong năm nay


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
