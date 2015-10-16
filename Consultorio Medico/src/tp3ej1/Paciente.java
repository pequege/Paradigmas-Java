/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp3ej1;

/**
 *
 * @author Paradigmas
 */
public class Paciente extends Persona {
    private int codigo;
    private ObraSocial obrasocial;

    public Paciente() {
    }

    public Paciente(int dni, String nombre, int dia, int mes, int anio, int codigo, ObraSocial obrasocial) {
        super(dni, nombre, dia, mes, anio);
        this.codigo = codigo;
        this.obrasocial = obrasocial;
    }

    public Paciente(int dni, String nombre, ObraSocial obrasocial) {
        super(dni, nombre);
        this.obrasocial = obrasocial;
    }

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

    @Override
    public String toString() {
        return super.toString() + "-" + codigo + "-" + obrasocial;
    }
}
