package Package;

public class ObraSocial {
    private int codigo;
    private String Nombre;
    
    /*Constructor*/
    public ObraSocial(int codigo, String Nombre) {
        this.codigo = codigo;
        this.Nombre = Nombre;
    }

    /*toString*/
    @Override    
    public String toString() {
        return "ObraSocial{" + "codigo: " + codigo + ", Nombre: " + Nombre + '}';
    }

    /*Getters & Setters*/
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
