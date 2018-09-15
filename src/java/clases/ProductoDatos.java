package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDatos {
    
    Connection con;
    PreparedStatement listarProductos, agregarProductos, buscarProductos;
    
    public Connection conexion () throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        String cadena = "jdbc:mysql://localhost:3306/dbjava";
        String usuario = "root";
        String clave = "";
        
        Class.forName(driver);
        con = DriverManager.getConnection(cadena, usuario, clave);
        
        return con;
    }
    
    public List recuperarProductos () throws Exception {
        List l = new ArrayList();
        listarProductos = conexion().prepareStatement("select codigo, nombre, stock, precio from productos");
        ResultSet res = listarProductos.executeQuery();
        while(res.next()){
            Producto prod = new Producto();
            
            prod.setCodigo(res.getInt(1));
            prod.setNombre(res.getString(2));
            prod.setStock(res.getInt(3));
            prod.setPrecio(res.getDouble(4));
            
            l.add(prod);
        }
        return l;
    }
    
    public void agregarProductos (Producto prod) throws Exception {
        agregarProductos = conexion().prepareStatement("insert into productos (codigo, nombre, precio, stock) values (?, ?, ?, ?)");
        agregarProductos.setInt(1, prod.getCodigo());
        agregarProductos.setString(2, prod.getNombre());
        agregarProductos.setDouble(3, prod.getPrecio());
        agregarProductos.setInt(4, prod.getStock());
        
        agregarProductos.executeUpdate();
    }
    
    public List buscarProductos (String nombre) throws Exception {
        List l = new ArrayList();
        buscarProductos = conexion().prepareStatement("select codigo, nombre, precio, stock from productos where nombre = '"+nombre+"'");
        ResultSet res = buscarProductos.executeQuery();
        
        while(res.next()){
            Producto prod = new Producto();
            
            prod.setCodigo(res.getInt(1));
            prod.setNombre(res.getString(2));
            prod.setPrecio(res.getDouble(3));
            prod.setStock(res.getInt(4));
            
            l.add(prod);
            
        }
        
        return l;
        
    }
    
}
