/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp3ej1;

import java.util.Calendar;
/**
 *
 * @author Paradigmas
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(){
        Calendar tmp = Calendar.getInstance();
        this.dia = tmp.get(Calendar.DAY_OF_MONTH);
        this.mes = tmp.get(Calendar.MONTH)+1;
        this.anio = tmp.get(Calendar.YEAR);
    }
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fecha other = (Fecha) obj;
        if (this.dia != other.dia) {
            return false;
        }
        if (this.mes != other.mes) {
            return false;
        }
        if (this.anio != other.anio) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + dia + "/" + mes + "/" + anio;
    }


}
