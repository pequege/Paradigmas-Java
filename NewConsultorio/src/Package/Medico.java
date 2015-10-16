package Package;

public class Medico extends Persona{
    private int matricula;
    private String especialidad;
    
    /*Constructor*/
    public Medico(int matricula, String especialidad, int dni, String nombre, String domicilio, Fecha fechaNac) {
        super(dni, nombre, domicilio, fechaNac);
        this.matricula = matricula;
        this.especialidad = especialidad;
    }

    /*toString*/
    @Override    
    public String toString() {
        return "Medico{" + "matricula=" + matricula + ", especialidad=" + especialidad + '}';
    }

    /*Getters & Setters*/
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
