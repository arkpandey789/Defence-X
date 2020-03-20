/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ark Pandey
 */
import java.sql.*;
import javax.swing.*;
public class JAVACONNECT {
    Connection conn;
    
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Ark Pandey\\Desktop\\defencexdb\\Defence-x (2).sqlite");
            return conn;
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
            
        }
        
    }
}
