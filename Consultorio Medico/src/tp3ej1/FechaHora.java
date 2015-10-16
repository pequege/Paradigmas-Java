package tp3ej1;
import java.util.Calendar;

public class FechaHora extends Fecha {
    private int hora;
    private int minuto;
    private int segundo;

    public FechaHora() {
        Calendar tmp = Calendar.getInstance();
        this.hora = tmp.get(Calendar.HOUR_OF_DAY);
        this.minuto = tmp.get(Calendar.MINUTE);
        this.segundo = tmp.get(Calendar.SECOND);
    }

    public FechaHora(int dia, int mes, int anio, int hora, int minuto, int segundo) {
        super(dia, mes, anio);
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return super.toString()+ " " + hora + ":" + minuto + ":" + segundo;
    }

}
