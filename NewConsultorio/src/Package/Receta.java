package Package;

import java.util.ArrayList;

public class Receta {
    private int numero;
    private Paciente paciente;
    private Medico medico;
    private ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
    private Fecha fecha;

    /*Constructor*/
    public Receta(int numero, Paciente paciente, Medico medico, ArrayList medicamentos, Fecha fecha) {
        this.numero = numero;
        this.paciente = paciente;
        this.medico = medico;
        this.medicamentos = medicamentos;
        this.fecha = fecha;
    }

    Receta(int numero, Paciente paciente, Medico medico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*Agregar Medicamento*/
    public void AgregarMedicamento(Medicamento medicamento){
        medicamentos.add(medicamento);
    }
    
    /*Imprimir receta*/
    public void ImprimirReceta(){
        System.out.println("Obra social: " + paciente.getObrasocial());
        System.out.println("Medico: " + medico);
        System.out.println("Paciente: " + paciente);
        System.out.println("Medicamentos: ");
        int i = 1;
        for(Medicamento m : medicamentos) {
            System.out.println(""+i+" "+m);
        }
        
        
    }
    
    /*toString*/
    @Override
    public String toString() {
        return "Receta{" + "numero=" + numero + ", paciente=" + paciente + ", medico=" + medico + ", medicamentos=" + medicamentos + ", fecha=" + fecha + '}';
    }

    /*Getters & Setters*/
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

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public ArrayList getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
}
