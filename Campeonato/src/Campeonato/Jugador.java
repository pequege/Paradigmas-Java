package Campeonato;
public class Jugador{
    private int posicion;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getPosicion(){
        return posicion;
    }
    
    public void SetPosicion(int posicion){
        this.posicion = posicion;
    }

    public Jugador(int posicion, String nombre) {
        this.posicion = posicion;
        this.nombre = nombre;
    }
    
    public void mostrar(){
        System.out.println(nombre + " juega de " + posicion + " Bien abierta buscando la punta!");
    }
    
}
