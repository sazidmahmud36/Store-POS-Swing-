
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBUtil {
    private Connection con = null;
    private String url = "jdbc:mysql://localhost:3306/store";
    private String user = "root";
    private String password = "sazid364436";
    private String driver = "com.mysql.cj.jdbc.Driver";
    
    public Connection getCon() throws ClassNotFoundException{
        Class.forName(driver);
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
}
