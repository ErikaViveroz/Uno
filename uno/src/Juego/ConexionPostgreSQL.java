
package Juego;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author tree6
 */
public class ConexionPostgreSQL {
    
    public static void main(String args[]){
        String BD="jdbc:postgresql://localhost:5432/Uno";
        String user="postgres";
        String pass="Holas123";
        
        try {
            Connection conectar=DriverManager.getConnection(BD,user,pass);
            JOptionPane.showMessageDialog(null, "Conexión exitosa");
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión"+e);
        }
    }
}
