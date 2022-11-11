package clasesCeviche;

/**
 *
 * @author hp
 */
public class Producto{
    private String nombre;
    private float precio;
    private int cantidad;
    private float valortotal;

    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }
    
    public int cantidad() {
        return cantidad;
    }

    public float valortotal() {
        valortotal = cantidad * precio;
        return valortotal;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
    return "Producto {" + "Nombre=" + nombre + ", Precio=" + precio + "}";
    }

}