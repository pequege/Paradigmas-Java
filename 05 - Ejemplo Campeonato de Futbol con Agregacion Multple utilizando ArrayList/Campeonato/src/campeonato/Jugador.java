package campeonato;
public class Jugador {
    private String nombre;
    int posicion;
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getPosicion(){
        return posicion;
    }
    public void setPosicion(int posicion){
        this.posicion = posicion;
    }
    public Jugador(String nombre, int posicion){
        setNombre(nombre);
        setPosicion(posicion);
    }
    public void mostrar(){
        System.out.println("\tJugador " 
               + nombre + ": " +posicion);
    }
}