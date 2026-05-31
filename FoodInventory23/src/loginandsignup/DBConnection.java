package loginandsignup;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection connect() {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/inventory_db",
                "root",
                ""
            );
        } catch (Exception e) {
            System.out.println("Connection Error: " + e.getMessage());
        }

        return con;
    }
}
