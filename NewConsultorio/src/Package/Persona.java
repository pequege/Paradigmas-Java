package Package;

public class Persona {
    private int dni;
    private String nombre;
    private String domicilio;
    private Fecha fechaNac;
    
    /*Getters & Setters*/
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Fecha getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Fecha fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    /*Constructor*/
    public Persona(int dni, String nombre, String domicilio, Fecha fechaNac) {
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.fechaNac = fechaNac;
    }
    
    /*ToString*/
    @Override
    public String toString() {
        return "Persona{" + "DNI= " + dni + ", Nombre=" + nombre + ", Domicilio=" + domicilio + ", Fecha de Nacimiento=" + fechaNac + '}';
    }
    
}
