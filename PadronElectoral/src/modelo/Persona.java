package modelo;
public class Persona {
    private String nombre;
    private String dni;
    private String sexo;
    private String nombreEscuela;
    private int nroMesa;
    private int nroOrden;

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

    public String getNombreEscuela() {
        return nombreEscuela;
    }

    public void setNombreEscuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
    }

    public int getNroMesa() {
        return nroMesa;
    }

    public void setNroMesa(int nroMesa) {
        this.nroMesa = nroMesa;
    }

    public int getNroOrden() {
        return nroOrden;
    }

    public void setNroOrden(int nroOrden) {
        this.nroOrden = nroOrden;
    }
    
    public Persona(String nombre, String dni, String sexo, String nombreEscuela, int nroMesa, int nroOrden) {
        this.nombre = nombre;
        this.dni = dni;
        this.sexo = sexo;
        this.nombreEscuela = nombreEscuela;
        this.nroMesa = nroMesa;
        this.nroOrden = nroOrden;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + ", sexo=" + sexo + ", nombreEscuela=" + nombreEscuela + ", nroMesa=" + nroMesa + ", nroOrden=" + nroOrden + '}';
        
    }
}

