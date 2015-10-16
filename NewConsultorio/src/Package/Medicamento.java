package Package;

public class Medicamento {
    private int codigo;
    private String descripcion;
        
    /*Constructor*/
    public Medicamento(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    /*toString*/
    @Override
    public String toString() {
        return "Medicamento{" + "codigo=" + codigo + ", descripcion=" + descripcion + '}';
    }

    /*Getters & Setters*/
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
