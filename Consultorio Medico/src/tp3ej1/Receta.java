/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp3ej1;

import java.util.ArrayList;

/**
 *
 * @author Paradigmas
 */
public class Receta {
    private int numero;
    private Fecha fecha;
    private Paciente paciente;
    private Medico medico;
    private ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();

    public Receta() {
    }

    public Receta(int numero, Paciente paciente, Medico medico) {
        this.numero = numero;
        this.paciente = paciente;
        this.medico = medico;
    }

    public void agregarMedicamento(Medicamento medicamento){
        medicamentos.add(medicamento);
    }

    public void imprimir(){
        System.out.println("Obra Social : "+paciente.getObrasocial());
        System.out.println("Medico : "+medico);
        System.out.println("Paciente : "+paciente);
        System.out.println("Medicamentos:");
        int i=1;
        for(Medicamento m : medicamentos ){
            System.out.println(""+i+" "+m);
        }
    }
    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }


    @Override
    public String toString() {
        return "Receta{" + "numero=" + numero + "fecha=" + fecha + "paciente=" + paciente + "medico=" + medico + "medicamentos=" + medicamentos + '}';
    }

}
