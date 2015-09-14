package Package;
public class Alquiler {
    String fechaAlquiler;
    String fechaDevolucion;
    Socio socio;
    Pelicula pelicula;
    Empleado empleado;
    
    public void Alquler(String fechaAlquiler, String fechaDevolucion, Socio socio, Pelicula pelicula, Empleado empleado){
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.socio = socio;
        this.pelicula = pelicula;
        this.empleado = empleado;
    }
    
    public void mostrar(){
        System.out.println("Socio n°" + socio.numero + "Alquiló: " + pelicula.nombre);
        System.out.println("El dia: " + fechaAlquiler + "Fecha devolución: " + fechaDevolucion);
    }
}
