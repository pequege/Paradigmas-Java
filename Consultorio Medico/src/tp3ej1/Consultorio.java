package tp3ej1;

import java.util.ArrayList;
import java.util.Calendar;

public class Consultorio implements Comparable<Consultorio>{

    private ArrayList<Consulta> consultas = new ArrayList<Consulta>();
    private ArrayList<ObraSocial> obras = new ArrayList<ObraSocial>();
    private Medico medico;
    private int numero = 1;

    public Consultorio(Medico medico) {
        this.medico = medico;
    }

    public void agregarConsulta(Paciente p, int tipo, double monto) {
        consultas.add(new Consulta(this.numero++, tipo, p, this.medico, monto));
        obras.add(p.getObrasocial());
    }

    public Consulta getConsulta(int index) {
        return this.consultas.get(index);
    }

    public Medico getMedico() {
        return medico;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void cantidadPacientes() {
        // cantidad de pacientes atendidos por semana
        System.out.println("Cantidad de Pacientes atendidos: " + consultas.size());
    }

    public void pacientesxObrasocial() {
        // total de pacientes x obra social
        System.out.println("Pacientes x Obra Social");
        for (ObraSocial obrasocial : obras) {
            int contador = 0;
            for (Consulta consulta : consultas) {
                if (obrasocial.getCodigo() == consulta.getPaciente().getObrasocial().getCodigo()) {
                    contador++;
                }
            }
            System.out.println("Obra Social : " + obrasocial + " --> " + contador);
        }
    }

    public void ingresosxFecha(int dia, int mes, int anio) {
        // monto total de ingresos segun una fecha
        float total = 0;
        Fecha fecha = new Fecha(dia, mes, anio);
        for (Consulta consulta : consultas) {
            Fecha tmp = consulta.getFecha();
            if (fecha.equals(tmp)) {
                total += consulta.getMonto();
            }
        }
        System.out.println("Total de Ingresos de fecha " + fecha + " : --> " + total);
    }

    public void pacientesAtendidos() {
        //cantidad de pacientes atendidos los viernes entre 20 y 30 años
        Calendar tmp = Calendar.getInstance();
        int contador = 0, edad = 0;
        for (Consulta c : consultas) {
            tmp.set(c.getFecha().getAnio(), c.getFecha().getMes() - 1, c.getFecha().getDia());
            int dia = tmp.get(Calendar.DAY_OF_WEEK);
            edad = tmp.get(Calendar.YEAR) - c.getPaciente().getFechanacimiento().getAnio();
            if ((edad >= 20 || edad < 30) && dia == 6) // verifico que el dia sea viernes
            {
                contador++;
            }
        }
        System.out.println("Pacientes atendidos los viernes --> " + contador);

    }

    public void imprimirReceta(int i) {
        consultas.get(i).crearReceta();
        consultas.get(i).getReceta().imprimir();
    }
                                                                                          
    @Override
    public int compareTo(Consultorio consultorio) {
       String a = String.valueOf(consultas.size());
       String b = String.valueOf(consultorio.getConsultas().size());
       return b.compareTo(a);
                
    }  
}
