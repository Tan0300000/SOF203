package jdbc;

import com.sun.jdi.connect.spi.Connection;

public class ConnectDB_Login {

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }
        try {
            conn = (Connection) DriverManager.getConnection(
         "jdbc:mysql:
    //localhost:3306/ges_article","root","");

    } catch (SQLException e) {
            System.err.println(e);//afficher erreur
        } finally {
            return conn;
        }
    }

    public ResultSet searchQuery(String sql) {
        try {
            getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(sql);

        } catch (SQLException e) {
            System.err.println(e);

        }
        return rs;
    }

}
