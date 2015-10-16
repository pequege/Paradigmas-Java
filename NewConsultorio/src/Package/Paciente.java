package Package;

public class Paciente extends Persona{
    private int codigo;
    private ObraSocial obrasocial;
    
    /*Constructor*/
    public Paciente(int codigo, ObraSocial obrasocial, int dni, String nombre, String domicilio, Fecha fechaNac) {
        super(dni, nombre, domicilio, fechaNac);
        this.codigo = codigo;
        this.obrasocial = obrasocial;
    }

    /*toString*/
    @Override    
    public String toString() {
        return "Paciente{" + "codigo: " + codigo + ", obrasocial: " + obrasocial + '}';
    }

    /*Getters & Setters*/
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ObraSocial getObrasocial() {
        return obrasocial;
    }

    public void setObrasocial(ObraSocial obrasocial) {
        this.obrasocial = obrasocial;
    }
}
