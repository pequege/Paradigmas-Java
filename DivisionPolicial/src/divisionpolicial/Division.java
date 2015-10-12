package divisionpolicial;

import java.util.ArrayList;

public class Division {
    private ArrayList DeIntervencion;
    private ArrayList DeTransito;

    //Getter & Setter DeIntervencion
    public ArrayList getDeIntervencion() {
        return DeIntervencion;
    }
    public void setDeIntervencion(ArrayList DeIntervencion) {
        this.DeIntervencion = DeIntervencion;
    }

    //Getter & Setter DeTransito
    public ArrayList getDeTransito() {
        return DeTransito;
    }
    public void setDeTransito(ArrayList DeTransito) {
        this.DeTransito = DeTransito;
    }

    //Constructor Division
    public Division(ArrayList DeIntervencion, ArrayList DeTransito) {
        this.DeIntervencion = DeIntervencion;
        this.DeTransito = DeTransito;
    }

    //ToString Division
    @Override
    public String toString() {
        return "Division{" + "DeIntervencion=" + DeIntervencion + ", DeTransito=" + DeTransito + '}';
    }
    
    /*public static void burbuja(int vector[]) {
    int i, j, k, aux;
    for ( i=0; i < vector.length - 1; i++){
        for ( j=0; j < vector.length - i -1; j++){
            if ( vector[j+1] < vector[j] ) {
                aux = vector[j+1];
                vector[j+1] = vector[j];
                vector[j] = aux;
                for (k = 0; k < vector.length; k++){
                    System.out.print(vector[k] + ";");
                    }
                }
            System.out.println("\n-------------");
            }
        }
    }
    */
}
