package paquete;
public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Max Power", 39, 1234398);
        e1.mostrarEmpleado();
        e1.calcular_salario_neto();
        Empresa empresa = new Empresa("asd Co.");
        empresa.getClientes().add(new Cliente("Jonh Doe", 43, "Global Co.", "+54 11 6 5445561"));
        empresa.getEmpleados().add(new Empleado("Jane Smith", 37, 45123));
        empresa.mostrarClientes();
        empresa.mostrarEmpleados();
    }
}
