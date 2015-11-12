
package kata5;

import java.io.*;
import java.sql.*;

/**
 *
 * @author Goretti
 */
public class KATA5 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
        Class.forName("org.sqlite.JDBC");
        Connection c = DriverManager.getConnection("jdbc:sqlite:KATADB");
        
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        //Connection c = DriverManager.getConnection("jdbc:oracle:thin:@10.22.143.90:1521:orcl","system","orcl");
        
        Statement stmt = c.createStatement();
        String fileName = "C:\\Users\\Goretti\\Documents\\NetBeansProjects\\KATA5\\DATA\\emailsfilev1.txt";
        BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
        
        String mail;
        
        while ((mail=reader.readLine())!=null){
            String query = "INSERT INTO MAILS (MAIL) VALUES ('" + mail + "')";
            stmt.executeUpdate(query);
        }

        stmt.close();
        c.close();
        
        
    }
    
}
