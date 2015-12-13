package modelo;

import java.sql.*;
import java.util.ArrayList;

public class DB {

    Connection connection;
    PreparedStatement ps;
    String sql = null;

    public DB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/acme", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
    }

    public void crearPersona(Persona persona) {
        try {
            sql = "INSERT INTO personas(nombre,dni,sexo,nombreEscuela,nroMesa,nroOrden) VALUES (?,?,?,?,?,?)";
            ps = connection.prepareStatement(sql);
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getDni());
            ps.setString(3, persona.getSexo());
            ps.setString(4, persona.getNombreEscuela());
            ps.setInt(5, persona.getNroMesa());
            ps.setInt(6, persona.getNroOrden());
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public ArrayList<Persona> retrievePersonas(String dni, String sexo) {
        ArrayList<Persona> list = new ArrayList<>();
        try {
            sql = "SELECT * FROM personas";
            ps = connection.prepareStatement(sql);
            
            if(dni.length() > 0 && sexo.length() > 0){
             sql = "SELECT * FROM personas WHERE dni=? AND sexo=?";
                ps = connection.prepareStatement(sql);
                ps.setString(1, dni);
                ps.setString(2, sexo);
            }
            if(dni.length() > 0 && sexo.length()==0){
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
            while (rs.next()) {
                Persona persona = new Persona(
                        rs.getString("nombre"),
                        rs.getString("dni"),
                        rs.getString("sexo"),
                        rs.getString("nombreEscuela"),
                        rs.getInt("nroMesa"),
                        rs.getInt("nroOrden")
                );
                list.add(persona);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return list;
    }

    public void deletePersona(int dni) {
        try {
            sql = "DELETE FROM `personas` WHERE dni = ?";
            ps = connection.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.executeUpdate(sql);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
