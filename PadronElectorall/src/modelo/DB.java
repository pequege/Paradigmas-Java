package modelo;

import java.sql.*;
import java.util.ArrayList;

public class DB {
    Connection connection;
    PreparedStatement ps;
    String sql = null;
    
    //conexion con la BASE DE DATOS
    public DB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/acme", "root", "");
        }
        catch(ClassNotFoundException | SQLException e){
            System.err.println(e);
        }
    }
    
    //
    public void crearPersona(Persona persona){
        try{
            sql = "INSERT INTO personas (nombre, dni, sexo, escuela, nroOrden, nroMesa) VALUES (?,?,?,?,?,?)";
            ps = connection.prepareStatement(sql);
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getDni());
            ps.setString(3, persona.getSexo());
            ps.setString(4, persona.getEscuela());
            ps.setInt(5, persona.getNroOrden());
            ps.setInt(6, persona.getNroMesa());
            ps.executeUpdate();
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
    
    public ArrayList<Persona> devolverPersonas(String dni, String sexo){
        ArrayList<Persona> list = new ArrayList<>();
        try{
            sql = "SELECT * FROM personas";
            ps = connection.prepareStatement(sql);
            if(dni.length() > 0 && sexo.length() > 0){
                sql = "SELECT * FROM personas WHERE dni=? AND sexo=?";
                ps = connection.prepareStatement(sql);
                ps.setString(1, dni);
                ps.setString(2, sexo);
            }
            if(dni.length() > 0 && sexo.length() == 0){
                sql = "SELECT * FROM personas WHERE dni=?";
                ps = connection.prepareStatement(sql);
                ps.setString(1, dni);
            }
            if(dni.length() == 0 && sexo.length() > 0){
                sql = "SELECT * FROM personas WHERE sexo=?";
                ps = connection.prepareStatement(sql);
                ps.setString(1, sexo);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Persona persona = new Persona(
                        rs.getString("nombre"),
                        rs.getString("dni"),
                        rs.getString("sexo"),
                        rs.getString("escuela"),
                        rs.getInt("nroMesa"),
                        rs.getInt("nroOrden")
                );
                list.add(persona);
            }
        }
        catch(Exception e){
            System.err.println(e);
        }
        return list;
    }
}
