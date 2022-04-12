import org.mindrot.jbcrypt.BCrypt;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UserServices {

    static Scanner sc = new Scanner(System.in);

    public ArrayList<User> getAllUser() {
        Connection conn = ConnectDatabase.getConnect();
        ArrayList<User> users = new ArrayList<>();

        String query = "SELECT * FROM `users`";

        try {
            Statement stm = conn.createStatement();

            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {
                String id = rs.getString("id");
                String mobile = rs.getString("mobile");
                String password = rs.getString("password");
                String account = rs.getString("account");
                long balance = rs.getLong("balance");

                users.add(new User(id, mobile, password, account, balance));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectDatabase.closeConnect(conn);
        }
        return users;
    }

    public void show(ArrayList<User> list) {
        for (User u : list) {
            System.out.println(u);
        }
    }

    public User checkLogin(ArrayList<User> list, String mobile, String password) {
        int check = 0;
        for (User u : list) {
            if (mobile.equalsIgnoreCase(u.getMobile())) {
                if (BCrypt.checkpw(password, u.getPassword())) {
                    System.out.println("Dang nhap thanh cong! Xin chao " + u.getMobile());
                    check += 1;
                    return u;
                }
            }
        }
        return null;
    }

    public long getBalance(User user) {
        long balance = 0;
        Connection conn = ConnectDatabase.getConnect();
        String query = "SELECT BALANCE FROM USERS WHERE ID = ?";

        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, user.getId());
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                balance = rs.getLong("balance");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectDatabase.closeConnect(conn);
        }
        return balance;
    }

    public void updateBalanceOfRootAccount(User user, TransactionHistory createTransaction) {
        Connection conn = ConnectDatabase.getConnect();
        String query = "UPDATE `users` SET `balance`= balance - ? WHERE id = ?";

        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setLong(1, createTransaction.getMoney());
            pstm.setString(2, user.getId());

            int row = pstm.executeUpdate();
            if (row != 0) {
                System.out.println("Chuyen tien thanh cong! Tai khoan " + user.getAccount() +
                        " bi tru so tien: " + createTransaction.getMoney() +
                        ". Ngay giao dich: " + createTransaction.getDate());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectDatabase.closeConnect(conn);
        }
    }

    public void updateBalanceOfBeneficiaryAccount(TransactionHistory createTransaction) {
        Connection conn = ConnectDatabase.getConnect();
        String query = "UPDATE `users` SET `balance`= balance + ? WHERE account = ?";

        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setLong(1, createTransaction.getMoney());
            pstm.setString(2, createTransaction.getBeneficiaryAccount());

            pstm.executeUpdate();
//            if (row != 0) {
//                System.out.println("Thuc hien cong tien cho TK " + createTransaction.getBeneficiaryAccount());
//            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
