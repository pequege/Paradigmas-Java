package Package;

public class FechaHora {
    private int hora;
    private int min;
    private int seg;
    
    /*Constructor*/
    public FechaHora(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    /*toString*/
    @Override    
    public String toString() {
        return "FechaHora{" + hora + ":" + min + ":" + seg + '}';
    }

    /*Getters & Setters*/
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }
}
