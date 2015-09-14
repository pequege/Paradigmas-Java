package paquete;
public class Directivo extends Empleado{
    private boolean categoria;

    /**
     *
     * @param nombre
     * @param edad
     * @param sueldo_bruto
     * @param categoria
     */
    public Directivo(String nombre, int edad, float sueldo_bruto, boolean categoria) {
        super(nombre, edad, sueldo_bruto);
    }
    
    public boolean getCategoria(){
        return categoria;
    }
    public void setCategoria(boolean categoria){
        this.categoria = categoria;
    }
    
    //cambiar mostrar---
    public void mostrarCategoria(){
        if(categoria == true){
            System.out.println("Directivo");
        }
        else{
            System.out.println("Subordinado");
        }
    }
    
}
