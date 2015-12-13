package controladorl;

import modelo.Persona;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pedro", "23809", "m", "Esc loca", 432, 93);
        Persona p2 = new Persona("Giselle", "32490348", "f", "Esc loca", 745, 23);
        //ControladorPersona.crearPersona(p1);
        //ControladorPersona.crearPersona(p2);
        ControladorPersona.mostrarPadron("", "");
    }
}
