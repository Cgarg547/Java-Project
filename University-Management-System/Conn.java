// Register the driver class
// creating connection class
// creating statement
// executing mysql queries
// closing the connection

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem", "root", "ChGa500547@");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}