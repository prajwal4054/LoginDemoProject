package demo.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtility {
	 private static final String URL="jdbc:postgresql://localhost:5432/logindb";
	    //Static method which returns object of Connection type
	    public static Connection getDBConnection() {
	        Connection conn = null;
	        try {
	            conn = DriverManager.getConnection(URL, "postgres", "postgres");
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        return conn;
	    }
}
