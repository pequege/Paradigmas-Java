package modelo;

import java.sql.*;
import java.util.ArrayList;

public class DB {
    Connection connection;
    PreparedStatement ps;
    String sql = null;
    
    public DB(){
        try{
            Class.forName("com.mysql.jbdc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/acme", "root", "root");
        }catch(ClassNotFoundException | SQLException e){
            System.err.println(e);
        }
    }
    
    public void crearProveedor(Proveedor proveedor){
        try{
            sql = "INSERT INTO proveedores(nombre, domicilio, telefono) VALUES (?,?,?)";
            ps = connection.prepareStatement(sql);
            ps.setString(1, proveedor.getNombre());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.executeUpdate();
        } catch(Exception e){
            System.err.println(e);
        }
    }
    
    public ArrayList<Proveedor> listarProveedores(){
        ArrayList<Proveedor> list = new ArrayList<>();
        try{
            sql = "SELECT * FROM proveedores";
            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Proveedor proveedor = new Proveedor(rs.getInt("ID"), rs.getString("nombre"), rs.getString("domicilio"), rs.getString("telefono"));
                list.add(proveedor);
            }
        } catch (Exception e){
            System.err.println(e);
        }
        return list;
    }
    
    public void actualizarProveedor(Proveedor provNuevo, Proveedor provViejo){
        try{
            sql = "UPDATE proveedores SET nombre = ?, domicilio = ?, telefono = ? WHERE id = ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, provNuevo.getNombre());
            ps.setString(2, provNuevo.getDomicilio());
            ps.setString(3, provNuevo.getTelefono());
            ps.setInt(4, provViejo.getId());
            ps.executeUpdate();
        }catch (Exception e){
            System.err.println(e);
        }
    }
    
    public void borrarProveedor(int id){
        try{
            sql = "DELETE FROM proveedores WHERE id = ?";
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
