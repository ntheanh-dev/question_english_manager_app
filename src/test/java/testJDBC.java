
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/englishquestiondb", "root", "12345");
        System.out.println("connected");
        
        conn.close();
    }
}
