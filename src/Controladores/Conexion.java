
package Controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
     public static Connection Conectar(){
        
         Connection conexion = null;
        
        try{
            
          String url = "jdbc:mysql://localhost:3306/agenda?characterEncoding=UTF-8";
          String usuario = "root";
          String contraseña = "12345";
          
          conexion = DriverManager.getConnection(url,usuario,contraseña);
            System.out.println("Conexion exitosa");
        
        }catch(SQLException e){
            
            System.out.println("Error"+e);
            e.printStackTrace();
        
        }   
        return conexion;
    }  
}