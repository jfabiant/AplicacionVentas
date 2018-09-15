package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDatos {
    
    Connection con;    
    PreparedStatement verificar;
    
    public Connection conexion () throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        String cadena = "jdbc:mysql://localhost:3306/dbjava";
        String usuario = "root";
        String clave = "";
        
        Class.forName(driver);
        con = DriverManager.getConnection(cadena, usuario, clave);
        
        return con;
    }
    
    public ResultSet login (String username, String password) throws Exception {
        verificar = conexion().prepareStatement("select username, password from usuarios where username = '"+username+"' and password = '"+password+"'");
        return verificar.executeQuery();
    }
    
    
}
