
package campeonato1;

import java.util.ArrayList;

public class Equipo {
    String nombre;
    ArrayList<Jugador> jugadores = new ArrayList<>();
    public Equipo(String nombre){
        this.nombre = nombre;
    }
    public void agregar(Jugador jugador){
        jugadores.add(jugador);
    }
    public void mostrar(){
        System.out.println("Nombre del Equipo: " + nombre);
        for(int i = 0; i < jugadores.size();i++){
            Jugador j = jugadores.get(i);
            if(i==0){
                System.out.print("CAPITAN");
            }
            j.mostrar();
        }
        
        
    }
}
