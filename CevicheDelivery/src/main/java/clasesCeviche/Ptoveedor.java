package clasesCeviche;

/**
 *
 * @author hp
 */
public class Ptoveedor {
    public String nombre;
    int cod;
    public ArregloProducto productos;

    public Ptoveedor(String nombre, int cod, ArregloProducto productos) {
        this.nombre = nombre;
        this.cod = cod;
        this.productos = productos;
    }
                    
    
            @Override
    public String toString() {
        String result;
        result = "(PROVEEDOR " + nombre + ", CODIGO " + cod + " )\n";
        result += productos;
        return result;
    }
    
}
