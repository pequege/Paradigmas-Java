package divisionpolicial;
public class Multa {
    private double valor;
    private String tipo;

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //Constructor DeTransito
    public Multa(double valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }
    
}
