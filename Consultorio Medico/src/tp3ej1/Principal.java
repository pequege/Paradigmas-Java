package tp3ej1;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {

    public static void main(String[] args) {
        
        ArrayList<Consultorio> listaConsultorios = new ArrayList<>();
        
        
        Consultorio con = new Consultorio(new Medico(11222333,"Favaloro, Rene",123,"Cardiologo"));
        
        listaConsultorios.add(con);
        
        con.agregarConsulta(new Paciente(1,"Juan Perez", 11,1,1981,1,new ObraSocial(202,"OSDE")), 1, 0.0);
        con.agregarConsulta(new Paciente(2,"Carlos Garcia", 12,1,1981,2,new ObraSocial(201,"Subsidio")), 1, 0.0);
        con.agregarConsulta(new Paciente(3,"Luis Paz", 1,11,1971,3,new ObraSocial(204,"ASUNT")), 1, 0.0);
        con.agregarConsulta(new Paciente(4,"Jorge Calvo", 11,1,1980,4,new ObraSocial(998,"S/OS")), 0, 400.0);
        con.getConsulta(3).setFecha(new Fecha(24,9,2015));
        con.getConsulta(3).crearReceta();
        con.getConsulta(3).getReceta().agregarMedicamento(new Medicamento(101,"keterolac"));
        con.getConsulta(3).getReceta().agregarMedicamento(new Medicamento(203,"flexicam b12"));
        con.getConsulta(3).getReceta().agregarMedicamento(new Medicamento(541,"aspirineta"));
        con.agregarConsulta(new Paciente(5,"Luciana Alvarez", 11,1,1991,5,new ObraSocial(999,"S/OS")), 0, 0.0);
        con.getConsulta(4).getFecha().setDia(25);
        con.getConsulta(4).getFecha().setMes(9);
        con.getConsulta(4).getFecha().setAnio(2015);
        con.agregarConsulta(new Paciente(6,"Cristian Paz",11,1,1991,6,new ObraSocial(204,"ASUNT")), 1, 0.0);
        con.agregarConsulta(new Paciente(7,"Jorge Paz", 11,1,1975,7,new ObraSocial(998,"S/OS")), 0, 400.0);
        con.getConsulta(6).setFecha(new Fecha(24,9,2015));

        //System.out.println("Respuestas para el ejercicio");
        con.cantidadPacientes();
        con.pacientesxObrasocial();
        con.ingresosxFecha(24, 9, 2015);
        con.pacientesAtendidos();
        con.getConsulta(3).getReceta().imprimir();
        
        Consultorio con2 =new Consultorio(new Medico(11222444,"Colmillot, Alberto" ,124,"Nutricion y Obesidad"));
        
        listaConsultorios.add(con2);
        
        con2.agregarConsulta(new Paciente(1,"Juan Juarez", 11,1,1981,1,new ObraSocial(202,"OSDE")), 1, 0.0);
        con2.agregarConsulta(new Paciente(2,"Carlos Diaz", 12,1,1981,2,new ObraSocial(201,"Subsidio")), 1, 0.0);
        con2.agregarConsulta(new Paciente(3,"Pedro Paz", 1,11,1971,3,new ObraSocial(204,"ASUNT")), 1, 0.0);
        
        /*Ordeno el ArrayList por cantidad de consultas atendidas*/
        Collections.sort(listaConsultorios);
        
        /*Muestro el Array List*/
        System.out.println("\nCant.Cons \t Matricula \t Especialidad");
        System.out.println("--------------------------------------------");
        for(Consultorio cons : listaConsultorios){
            System.out.println(cons.getConsultas().size()+"\t\t"+cons.getMedico().getMatricula() + "\t \t"+cons.getMedico().getEspecialidad());
        }
    }
    
}
