package paquete;
public class Directivo extends Empleado{
    private int categoria;
    
    //Getter & Setter de Directivo
    public int getCategoria(){
        return categoria;
    }
    public void setCategoria(int categoria){
        this.categoria = categoria;
    }
    
    //Constructor de Directivo
    public Directivo(String nombre, int edad, float sueldo_bruto, int categoria) {
        super(nombre, edad, sueldo_bruto);
        this.categoria = categoria;
    }
    
    //Funcion Mostrar
    public void mostrarDirectivo(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sueldo: " + getSueldo_bruto());
        System.out.println("Categoria: " + getCategoria());
    }
    
}
