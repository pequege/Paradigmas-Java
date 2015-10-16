/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp3ej1;

/**
 *
 * @author usuario
 */
public class Medico extends Persona {
    private int matricula;
    private String especialidad;

    public Medico(){

    }
    public Medico(int dni, String nombre, int matricula, String especialidad){
        super(dni,nombre);
        this.matricula = matricula;
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + " " + matricula + " " + especialidad;
    }

}
