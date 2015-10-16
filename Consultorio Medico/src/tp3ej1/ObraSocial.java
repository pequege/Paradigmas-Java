/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp3ej1;

/**
 *
 * @author Paradigmas
 */
public class ObraSocial {
    private int codigo;
    private String nombre;

    public ObraSocial() {
    }

    public ObraSocial(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return ""+codigo+" "+nombre;
    }


}
