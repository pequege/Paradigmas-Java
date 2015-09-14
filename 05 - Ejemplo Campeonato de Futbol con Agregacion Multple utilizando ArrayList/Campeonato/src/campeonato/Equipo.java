package campeonato;
import java.util.ArrayList;
public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;
    public Equipo(String nombre){
        this.nombre = nombre;
        jugadores = new ArrayList<>();
    }
    public void add(Jugador j){
        jugadores.add(j);
    }
    public void mostrar(){
        System.out.println("Equipo: " + nombre);
        
        for (int i=0;i<jugadores.size();i++){
            if (i == 0)
                System.out.print("capitan");
            Jugador j = jugadores.get(i);
            j.mostrar();
        }
    
    }
}
