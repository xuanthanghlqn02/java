import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    ConnectDatabase connectDatabase = new ConnectDatabase();
    Connection conn;
    static Scanner sc = new Scanner(System.in);

    public void openConnect() {
        conn = connectDatabase.connect();
    }

    public ArrayList<User> getAllUsers() {
        openConnect();
        ArrayList<User> list = new ArrayList<>();

        String query = "SELECT * FROM vpbank.user";
        try {
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(query);

            while (result.next()) {
                int id = result.getInt("id");
                String phoneNumber = result.getString("phone_number");
                String password = result.getString("password");
                Double balance = result.getDouble("balance");

                list.add(new User(id, phoneNumber, password, balance));
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
