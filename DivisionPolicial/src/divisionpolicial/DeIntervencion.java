package divisionpolicial;
public class DeIntervencion extends Agente{
    private String especialidad;
    private String clasificacion;
    private int intervenciones;
    
    //Getter & Setter especialidad
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //Getter & Setter clasificacion
    public String getClasificacion() {
        return clasificacion;
    }
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    //Getter & Setter intervenciones
    public int getIntervenciones() {
        return intervenciones;
    }
    public void setIntervenciones(int intervenciones) {
        this.intervenciones = intervenciones;
    }
    
    //Constructor DeIntervencion
    public DeIntervencion(String especialidad, String clasificacion, int intervenciones, int numero, String nombre, int antiguedad) {
        super(numero, nombre, antiguedad);
        this.especialidad = especialidad;
        this.clasificacion = clasificacion;
        this.intervenciones = intervenciones;
    }
    
    //ToString DeIntervencion
    @Override
    public String toString() {
        return "DeIntervencion{" + "especialidad=" + especialidad + ", clasificacion=" + clasificacion + '}';
    }    
}
