/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp3ej1;

/**
 *
 * @author Paradigmas
 */
public class Consulta {
    private int numero;
    private int tipo;
    private Fecha fecha;
    private Paciente paciente;
    private Medico medico;
    private double monto;
    private Receta receta;

    public Consulta() {
    }

    public Consulta(int numero, int tipo, Paciente paciente, Medico medico, double monto) {
        this.numero = numero;
        this.tipo = tipo;
        this.paciente = paciente;
        this.medico = medico;
        this.monto = monto;
        this.fecha = new Fecha();
    }

    public void crearReceta(){
        this.receta = new Receta(this.numero, this.paciente, this.medico);
    }
    
    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
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

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Consulta{" + "numero=" + numero + "tipo=" + tipo + "fecha=" + fecha + "paciente=" + paciente + "medico=" + medico + "monto=" + monto + "receta=" + receta + '}';
    }

}
