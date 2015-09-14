package Package;
public class Socio extends Persona {
    int numero;
    boolean esMayor;
    
    public Socio(int num, boolean m){
        this.numero = num;
        this.esMayor = m;
    }
    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public boolean getEsMayor(){
        return esMayor;
    }
    public void setEsMayor(boolean esMayor){
        this.esMayor = esMayor;
    }
}
