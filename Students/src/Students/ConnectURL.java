package Students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectURL {
    public static void main(String[] args) {

        String connectionUrl = "jdbc:sqlserver://localhost;databaseName=DB_Student;user=MrBom;password=123";

        try ( Connection con = DriverManager.getConnection(connectionUrl);  Statement stmt = con.createStatement();) {
            String SQL = "SELECT TOP 10 * FROM STUDENTS";
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                System.out.println(rs.getString("MASV") + " " + rs.getString("TENSV") + " " + rs.getString("EMAIL"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
