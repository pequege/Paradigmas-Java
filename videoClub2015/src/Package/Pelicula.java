package Package;
public class Pelicula {
    String nombre;
    String genero;

    public Pelicula(String n, String g){
        this.nombre = n;
        this.genero = g;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getGenero(){
        return genero;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
}
