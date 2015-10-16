/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp3ej1;

/**
 *
 * @author Paradigmas
 */
public class Persona {
    private int dni;
    private String nombre;
    private String domicilio;
    private Fecha fechanacimiento;

    public Persona() {
    }

    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechanacimiento = new Fecha(1,1,1900);
    }

    public Persona(int dni, String nombre, int dia, int mes, int anio) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechanacimiento = new Fecha(dia, mes, anio);
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Fecha getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Fecha fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "" + dni + " " + nombre + " " + domicilio + " " + fechanacimiento;
    }



}
