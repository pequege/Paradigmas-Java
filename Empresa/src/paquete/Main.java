package paquete;
public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Pepe", 12, 1234398);
        e1.mostrarEmpleado();
        e1.calcular_salario_neto();
        Cliente c1 = new Cliente("Papo", 53, "Tu vieja", "+54 381 5 21 56 65");
        c1.mostrarCliente();
    }
}
