package paquete;
public class Cliente extends Persona{
    private String nombre_empresa;
    private String telefono_de_contacto;

    public String getNombre_empresa() {
        return nombre_empresa;
    }
    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getTelefono_de_contacto() {
        return telefono_de_contacto;
    }
    public void setTelefono_de_contacto(String telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }
    
    public Cliente(String nombre, int edad, String nombre_empresa, String telefono_de_contacto) {
        super(nombre, edad);
        this.nombre_empresa = nombre_empresa;
        this.telefono_de_contacto = telefono_de_contacto;
    }
    
    public void mostrarCliente(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Trabaja en: " + getNombre_empresa());
        System.out.println("Teléfono: " + getTelefono_de_contacto());
    }
}
