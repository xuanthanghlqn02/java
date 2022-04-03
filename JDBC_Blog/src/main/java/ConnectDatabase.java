import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {

    private String url = "jdbc:mysql://localhost:8080/blog";
    private String username = "root";
    private String password = "123";

    public Connection connect() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }
}
