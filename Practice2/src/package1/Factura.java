package package1;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
    private Date fecha;
    private LineItem lineItem;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LineItem getLineItem() {
        return lineItem;
    }

    public void setLineItem(LineItem lineItem) {
        this.lineItem = lineItem;
    }

    public Factura(Date fecha, LineItem lineItem) {
        this.fecha = fecha;
        this.lineItem = lineItem;
    }

    @Override
    public String toString() {
        return "Factura{" + "fecha=" + fecha + ", lineItem=" + lineItem + '}';
    }
    
    public void mostrar(){
        System.out.println("Fecha: " + fecha);
        System.out.println("---------------------");
        System.out.println("Descripcion");
        System.out.println("Cantidad/t Producto/t Precio");
        for (LineItem lineItem : lineItems) {
            
        }
    }
}
