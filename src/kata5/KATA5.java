
package kata5;

import java.sql.*;

/**
 *
 * @author Goretti
 */
public class KATA5 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //Class.forName("org.sqlite.JDBC");
        //Connection c = DriverManager.getConnection("jdbc:sqlite:KATADB");
        
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection c = DriverManager.getConnection("jdbc:oracle:thin:@10.22.143.90:1521:orcl","system","orcl");
        
        Statement stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM PEOPLE");
        
        while (rs.next()){
            System.out.print("ID = " +rs.getInt("ID"));
            System.out.print("-->");
            System.out.println(" NAME = " +rs.getString("NAME"));
        }
        
        rs.close();
        stmt.close();
        c.close();
        
        
    }
    
}
