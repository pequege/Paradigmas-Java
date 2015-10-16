package Package;

import java.util.ArrayList;

public class ConsultorioA {
    private ArrayList consultas;
    private Medico medico;
    
    /*Getters & Setters*/
    public ArrayList getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList consultas) {
        this.consultas = consultas;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
