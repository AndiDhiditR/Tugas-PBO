/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.bio;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author NIM   : 13020220151
 *         NAMA  : ANDI DHIDIT RIYANDY
 *         KEALS : A4
 */

public class database {
    private static Connection connection = null ;
    
    public static   Connection getConnection() throws Exception{
        if (connection==null){
            try{
            Class.forName("com.mysql.jdbc.driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbakademik", "root", "");     
            }catch (Exception e){
                e.printStackTrace();
                return null;
            } 
        }   
        return connection;
    }
    public static boolean isConnect(){
        try{
            if (connection==null){     
                return false;
            }
            }catch (Exception ex){
                Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);  
            } 
        return true;
     }
}
    
    









        

