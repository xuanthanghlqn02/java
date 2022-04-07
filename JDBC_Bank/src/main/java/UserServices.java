import org.mindrot.jbcrypt.BCrypt;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserServices {

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
        for (User u : list) {
            if (mobile.equalsIgnoreCase(u.getMobile())) {
                if (BCrypt.checkpw(password, u.getPassword())) {
                    return u;
                }
            }
        }
        return null;
    }
}
