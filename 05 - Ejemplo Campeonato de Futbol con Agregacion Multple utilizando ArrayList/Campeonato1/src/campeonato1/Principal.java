package campeonato1;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Jugador j1 = new Jugador(10,"Tevez");
        Jugador j2 = new Jugador(11,"Homero");
        Jugador j3 = new Jugador(5,"Bart");
        Equipo e = new Equipo("Boca");
        e.agregar(j1);
        e.agregar(j2);
        e.agregar(j3);
        e.agregar(new Jugador(4,"Lisa"));
        e.agregar(new Jugador(2,"Maggie"));
        e.mostrar();
    }
}
