//Viết chương trình quản lý thông tin sách của một thư viện gồm các thông tin sau:
//        Sách (id, tên sách, mô tả, tác giả, thể loại, năm xuất bản, nhà xuất bản)
//
//        Sách giáo khoa kế thừa Sách và có thêm số trang và số lượng
//        Tài liệu điện tử kế thừa sách và có thêm dung lượng và lượt tải
//        Thực hiện các công việc:
//        Thêm sách mới
//        Tìm sách theo tên
//        Tìm sách theo id
//        Xóa sách
//        Cập nhật số lượng sách (nếu là sách giáo khoa)
//        Cập nhật số lượt tải (nếu là tài kiệu điện tử)

public class Main {
    public static void main(String[] args) {
        BookFunction BF = new BookFunction();
//        BF.addTextBook();
        BookController.menu();
    }
}
