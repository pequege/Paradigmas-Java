

package campeonato;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Equipo e1 = new Equipo("Boca");
        e1.add(new Jugador("Tevez",1));
        e1.add(new Jugador("Orion",2));
        e1.add(new Jugador("Gago",3));
        e1.mostrar();
    }
    
}
