package clasesCeviche;

/**
 *
 * @author bnjmn
 */
public class Plato { 
    
    double precio;
    String nombre;

    public Plato(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }
    
    public double getPrecio() {
        return precio;
    }    
    
    public void SetPrecio(double precio){
        this.precio= precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "precio=" + precio + ", nombre=" + nombre + "\n";
    }
    
    
}
