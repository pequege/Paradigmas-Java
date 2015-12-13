package modelo;
public class Persona {
    private String nombre;
    private String dni;
    private String sexo;
    private String escuela;
    private int nroOrden;
    private int nroMesa;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public int getNroOrden() {
        return nroOrden;
    }

    public void setNroOrden(int nroOrden) {
        this.nroOrden = nroOrden;
    }

    public int getNroMesa() {
        return nroMesa;
    }

    public void setNroMesa(int nroMesa) {
        this.nroMesa = nroMesa;
    }

    public Persona(String nombre, String dni, String sexo, String escuela, int nroOrden, int nroMesa) {
        this.nombre = nombre;
        this.dni = dni;
        this.sexo = sexo;
        this.escuela = escuela;
        this.nroOrden = nroOrden;
        this.nroMesa = nroMesa;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + ", sexo=" + sexo + ", escuela=" + escuela + ", nroOrden=" + nroOrden + ", nroMesa=" + nroMesa + '}';
    }    
}