package paquete;
public class Persona {
    private String nombre;
    private int edad;

    //Getter & Setter de nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Getter & Setter de edad
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Constructor de Persona
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Funcion mostrar
    public void mostrarPersona(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
    }
}
