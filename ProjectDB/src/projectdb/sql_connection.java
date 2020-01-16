package projectdb;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class sql_connection {
    Connection con = null;
    public static Connection ConnectionDB(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "project_db", "1234");
            //JOptionPane.showMessageDialog(null, "Connetion establised!!");
            return con;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
