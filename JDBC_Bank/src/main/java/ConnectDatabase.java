import com.mysql.cj.jdbc.exceptions.CommunicationsException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

public class ConnectDatabase {
    private static String url = "jdbc:mysql://localhost:8080/bank";
    private static String username = "root";
    private static String password = "123";

    public static Connection getConnect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
        }  catch (SQLException e) {
            System.out.println("Ket noi toi CSDL that bai! Vui long thu lai!");
        }

        return conn;
    }

    public static Connection closeConnect(Connection conn) {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

}
