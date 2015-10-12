package divisionpolicial;

public class Agente {
    private int numero;
    private String nombre;
    private int antiguedad;

    //Getter & Setter numero
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //Getter & Setter nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Getter & Setter antiguedad
    public int getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    //Constructor Agente
    public Agente(int numero, String nombre, int antiguedad) {
        this.numero = numero;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Agente{" + "numero=" + numero + ", nombre=" + nombre + ", antiguedad=" + antiguedad + '}';
    }
}
