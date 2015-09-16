package paquete;
public class Empleado extends Persona{
    private float sueldo_bruto;

    //Getter & Setter de sueldo_bruto
    public float getSueldo_bruto() {
        return sueldo_bruto;
    }   
    public void setSueldo_bruto(float sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }
    
    //Constructor de Empleado
    public Empleado(String nombre, int edad, float sueldo_bruto) {
        super(nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
    }

    //Funcion mostrar
    public void mostrarEmpleado(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sueldo bruto: $" + getSueldo_bruto());
        System.out.println("Salario neto: $" + calcular_salario_neto());
    }
    //Funcion calcular_salario_neto
    public float calcular_salario_neto(){
        float sn = sueldo_bruto - (sueldo_bruto * 3 / 100) - (sueldo_bruto * 11 / 100);
        return sn;
    }
}
