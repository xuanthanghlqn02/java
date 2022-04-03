import java.util.Scanner;

public class BlogController {
    public static void menu() {
        BlogService BS = new BlogService();
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Lấy ra thông tin tất cả các bài viết bao gồm id, title, content, description, create_at, status");
        System.out.println("2. Lấy ra các post có status là public");
        System.out.println("3. Thêm bài post mới");
        System.out.println("4. Cập nhật status của post");
        System.out.println("5. Xóa một post");
        System.out.println("6. Thoát chương trình");
        System.out.print("Nhap lua chon cua ban: ");
        int luaChon = Integer.parseInt(sc.nextLine());
        switch (luaChon) {
            case 1:
                BS.show(BS.getBookInfos());
                break;
            case 2:
                BS.show(BS.getPostsHaveStatusIsPublic());
                break;
            case 3:
                BS.insertPost();
                break;
            case 4:
                BS.show(BS.getBookInfos());
                BS.updatePost();
                break;
            case 5:
                BS.show(BS.getBookInfos());
                BS.deletePost();
//                System.out.println("Danh sach sau xoa");
//                BS.show(BS.getBookInfos());
                break;
            case 6:
                System.out.println("Tam biet!");
                System.exit(0);
            default:
                System.out.println("Khong co lua chon nay!");
        }
    }

}
