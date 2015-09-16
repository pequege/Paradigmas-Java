package paquete;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    ArrayList<Cliente> clientes;
    ArrayList<Empleado> empleados;
    
    //Getter & Setter de Nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Getter & Setter del Array Clientes
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    //Getter & Setter del Array Empleados
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    //Constructor de Empresa
    public Empresa(String nombre) {
        this.nombre = nombre;
        clientes = new ArrayList<>();
        empleados = new ArrayList<>();
    }

    //Funcion para mostrar Clientes
    public void mostrarClientes(){
        for(Cliente cliente : clientes){
            System.out.println();
            cliente.mostrarCliente();
        }
    }
    
    //Funcion para mostrar empleados
    public void mostrarEmpleados(){
        for(Empleado empleado : empleados){
            System.out.println();
            empleado.mostrarEmpleado();
        }
    }
}
