package controladorl;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import vistas.VentanaConsulta;

public class ControladorPersona {
    static VentanaConsulta ventanaConsulta = new VentanaConsulta();
    static DB db = new DB();
    
    public static void crearPersona(Persona persona){
        db.crearPersona(persona);
        ControladorPersona.mostrarPadron("", "");
    }
    
    public static void mostrarPadron(String dni, String sexo){
        ArrayList <Persona> personas = new ArrayList<>();
        ventanaConsulta.setVisible(true);
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("Nombre");
        tabla.addColumn("Dni");
        tabla.addColumn("Escuela");
        tabla.addColumn("Numero Mesa");
        tabla.addColumn("Numero Orden");
        personas = db.retrievePersonas("", "");
        if(dni.length() > 0 && sexo.length() > 0){
            personas = db.retrievePersonas(dni, sexo);
        }
        if(dni.length() > 0 && sexo.length() == 0){
            personas = db.retrievePersonas(dni, "");
        }
        if(dni.length() == 0 && sexo.length() > 0){
            personas = db.retrievePersonas("", sexo);
        }
        System.out.println(personas.toString());
        for(Persona persona : personas){
            Object[] fila = new Object[5];
            fila[0] = persona.getNombre();
            fila[1] = persona.getDni();
            fila[2] = persona.getNombreEscuela();
            fila[3] = persona.getNroMesa();
            fila[4] = persona.getNroOrden();
            tabla.addRow(fila);
        }
        ventanaConsulta.getJTable1().setModel(tabla);
    }
}
