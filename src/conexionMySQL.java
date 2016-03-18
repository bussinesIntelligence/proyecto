import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conexionMySQL {
    
    public static Connection GetConnection(){
        String ip="127.0.0.1";
        String User="root";
        String Pass="yeyetzy09";
          Connection conex= null; 
          try {
                  Class.forName("com.mysql.jdbc.Driver");
              } catch (ClassNotFoundException ex) {
                  Logger.getLogger(conexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
              }
          try {
                       conex = DriverManager.getConnection("jdbc:mysql://"+ip+"/enlace",User,Pass);
        } catch (SQLException ex) {
            Logger.getLogger(conexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error de conexion"+ ex);
        }
                       
      return conex;
        
    }
    
}
