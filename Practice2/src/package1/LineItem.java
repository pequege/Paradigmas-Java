package package1;

import java.util.ArrayList;
import java.util.Date;

public class LineItem extends Factura{
    private int cantidad;
    private String producto;
    private Double precio;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public LineItem(int cantidad, String producto, Double precio, Date fecha, ArrayList lineItem) {
        super(fecha, lineItem);
        this.cantidad = cantidad;
        this.producto = producto;
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "LineItem{" + "cantidad=" + cantidad + ", producto=" + producto + ", precio=" + precio + '}';
    }
}
