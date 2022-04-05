import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BlogService {
    ConnectDatabase connectDatabase = new ConnectDatabase();
    Connection conn;
    static Scanner sc = new Scanner(System.in);

    public void openConnect() {
        conn = connectDatabase.connect();
    }

    public ArrayList<Blog> getBookInfos() {
        openConnect();
        ArrayList<Blog> list1 = new ArrayList<>();

        String query = "SELECT id, title, content, description, create_at, status FROM blog.post";

        try {
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(query);

            while (result.next()) {
                int id = result.getInt("id");
                String title = result.getString("title");
                String content = result.getString("content");
                String description = result.getString("description");
                String create_at = result.getString("create_at");
                String status = result.getString("status");

                list1.add(new Blog(id, title, content, description, create_at, status));
            }

            conn.close();
        } catch (NullPointerException ne) {
            System.out.println("Loi ket noi CDSL! Vui long thu lai!");
        }

        catch (SQLException e) {
            e.printStackTrace();
        }

        return list1;
    }

    public void show(ArrayList<Blog> list) {
        for (Blog x : list) {
            System.out.println(x);
        }
    }

    public ArrayList<Blog> getPostsHaveStatusIsPublic() {
        openConnect();
        ArrayList<Blog> list2 = new ArrayList<>();
        String query = "SELECT id, title, content, description, create_at, status FROM blog.post WHERE status = 'public';";

        try {
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(query);

            while (result.next()) {
                int id = result.getInt("id");
                String title = result.getString("title");
                String content = result.getString("content");
                String description = result.getString("description");
                String create_at = result.getString("create_at");
                String status = result.getString("status");

                list2.add(new Blog(id, title, content, description, create_at, status));
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list2;
    }

    public void insertPost() {
        openConnect();
        String query = "INSERT INTO `post`(`id`, `title`, `content`, `description`, `thumnail`, `id_category`, `id_author`, `create_at`, `status`) " +
                "VALUES (null,?,?,?,null,?,?,?,?)";

        System.out.print("Nhap title: ");
        String title = sc.nextLine();

        System.out.print("Nhap content: ");
        String content = sc.nextLine();

        System.out.print("Nhap description: ");
        String description = sc.nextLine();

        System.out.print("Nhap id_category(4 hoac 5): ");
        System.out.print("Nhap lua chon: ");
        int id_category = 0;
        int luaChonCategory = Integer.parseInt(sc.nextLine());
        switch (luaChonCategory) {
            case 4:
                id_category = 4;
                break;
            case 5:
                id_category = 5;
                break;
            default:
                System.out.println("Khong co lua chon nay!");
                System.exit(0);
        }

        System.out.print("Nhap id_author(Nhap 1 trong cac gia tri sau day 38, 39, 41, 42, 44): ");
        System.out.print("Nhap lua chon: ");
        int id_author = 0;
        int luaChonAuthor = Integer.parseInt(sc.nextLine());
        switch (luaChonAuthor) {
            case 38:
                id_author = 38;
                break;
            case 39:
                id_author = 39;
                break;
            case 41:
                id_author = 41;
                break;
            case 42:
                id_author = 42;
                break;
            case 44:
                id_author = 44;
                break;
            default:
                System.out.println("Khong co lua chon nay!");
                System.exit(0);
        }

        System.out.print("Nhap create_at(Dinh dang: YYYY-MM-DD): ");
        String create_at = sc.nextLine();

        System.out.println("Nhap status(public, hidden or draft): ");
        System.out.print("1. Public" + "\t");
        System.out.print("2. Hidden" + "\t");
        System.out.print("3. Draft" + "\t");
        System.out.print("Nhap lua chon: ");
        int choose = Integer.parseInt(sc.nextLine());
        String status = null;
        switch (choose) {
            case 1:
                status = String.valueOf(Status.PUBLIC);
                break;
            case 2:
                status = String.valueOf(Status.HIDDEN);
                break;
            case 3:
                status = String.valueOf(Status.DRAFT);
                break;
            default:
                System.out.println("Khong co lua chon nay!");
        }

        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, title);
            pstm.setString(2, content);
            pstm.setString(3, description);
            pstm.setInt(4, id_category);
            pstm.setInt(5, id_author);
            pstm.setDate(6, Date.valueOf(create_at));
            pstm.setString(7, status);

            int row = pstm.executeUpdate();

            if (row != 0) {
                System.out.println("Them thanh cong: " + row);
            }

            conn.close();
        } catch (IllegalArgumentException ie) {
            System.out.println("Ngay thang khong hop le!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatePost() {
        openConnect();
        String query = "UPDATE `post` SET `status`= ? WHERE `id` = ?";

        System.out.print("Nhap ID muon cap nhat: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Nhap status(public, hidden or draft): ");
        System.out.print("1. Public" + "\t");
        System.out.print("2. Hidden" + "\t");
        System.out.print("3. Draft" + "\t");
        System.out.print("Nhap lua chon: ");
        int choose = Integer.parseInt(sc.nextLine());
        String status = null;
        switch (choose) {
            case 1:
                status = String.valueOf(Status.PUBLIC);
                break;
            case 2:
                status = String.valueOf(Status.HIDDEN);
                break;
            case 3:
                status = String.valueOf(Status.DRAFT);
                break;
            default:
                System.out.println("Khong co lua chon nay!");
        }

        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, status);
            pstm.setInt(2, id);

            int row = pstm.executeUpdate();

            if (row != 0) {
                System.out.println("Cap nhat thanh cong: " + row);
            } else {
                System.out.println("Khong co ID nay!");
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePost() {
        openConnect();
        String query = "DELETE FROM `post` WHERE id = ?";

        System.out.print("Nhap ID muon xoa: ");
        int id = Integer.parseInt(sc.nextLine());

        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, id);

            int row = pstm.executeUpdate();
            if (row != 0) {
                System.out.println("Xoa thanh cong: " + row);
            } else {
                System.out.println("Khong co ID nay!");
            }

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
