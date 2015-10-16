package Package;

public class Consulta {
    private int numero;
    private FechaHora fecha;
    private Paciente paciente;
    private Medico medico;
    private double monto;
    private Receta receta;
    private int tipo;
    
    /*Getters & Setters*/
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public FechaHora getFecha() {
        return fecha;
    }

    public void setFecha(FechaHora fecha) {
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /*Constructor*/
    public Consulta(int numero, FechaHora fecha, Paciente paciente, Medico medico, double monto, int tipo) {
        this.numero = numero;
        this.fecha = fecha;
        this.paciente = paciente;
        this.medico = medico;
        this.monto = monto;
        this.tipo = tipo;
    }
    
    /*toString*/
    @Override
    public String toString() {
        return "Consulta{" + "numero=" + numero + ", fecha=" + fecha + ", paciente=" + paciente + ", monto=" + monto + ", receta=" + receta + ", tipo=" + tipo + '}';
    }
    
    /*Crear Receta*/
    public void CrearReceta(){
        this.receta = new Receta(this.numero, this.paciente, this.medico);
    }
}
