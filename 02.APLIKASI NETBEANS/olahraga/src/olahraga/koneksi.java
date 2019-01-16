/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olahraga;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author 0CIL650
 */
public class koneksi {

    static ResultSet executeQuery(String select__from_kelompok) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void executeUpdate(String SQL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public java.sql.Connection connection;
   public Statement statement;
   public koneksi(){
       try {
           Class.forName("com.mysql.jdbc.Driver");
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"JDBC not found");
       }
       connection = null;
       try {
           connection = DriverManager.getConnection("jdbc:mysql://localhost/dbsia",
                    "root","");
           statement = connection.createStatement();
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Koneksi gagal!");
       }
       if (connection!=null) {
            JOptionPane.showMessageDialog(null, "Koneksi Sukses");
       }
   }
    
}
