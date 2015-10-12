package divisionpolicial;

import java.util.ArrayList;

public class DeTransito extends Agente{
    private ArrayList multa;

    //Getter & Setter multa
    public ArrayList getMulta() {
        return multa;
    }
    public void setMulta(ArrayList multa) {
        this.multa = multa;
    }

    //Constructor DeTransito
    public DeTransito(ArrayList multa, int numero, String nombre, int antiguedad) {
        super(numero, nombre, antiguedad);
        this.multa = multa;
    }

    //ToString DeTransito
    @Override
    public String toString() {
        return "DeTransito{" + "multa=" + multa + '}';
    }
}
