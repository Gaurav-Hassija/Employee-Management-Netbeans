
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hassija
 */
public class MySql {
   
    public static Connection connectDB(){
        try {
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","");
//           JOptionPane.showMessageDialog(null,"COnnection Done!","Connection Status",JOptionPane.INFORMATION_MESSAGE);
           return conn;
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection cannot be made: "+e.getMessage(),"Conection Status",JOptionPane.ERROR_MESSAGE);
            return null;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Some other issue occured while connection "+e.getMessage(),"Connection Status",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
}
