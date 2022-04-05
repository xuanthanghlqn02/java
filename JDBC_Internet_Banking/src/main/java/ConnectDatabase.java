import com.mysql.cj.jdbc.exceptions.CommunicationsException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
    private String url = "jdbc:mysql://localhost:8080/vpbank";
    private String username = "root";
    private String password = "123";

    public Connection connect() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (CommunicationsException ce) {
            System.out.println("Ket noi toi CSDL that bai! Vui long thu lai!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }
}
