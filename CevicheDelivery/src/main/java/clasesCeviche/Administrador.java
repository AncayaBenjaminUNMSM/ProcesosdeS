package clasesCeviche;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Administrador {
    private String codigo;
    private String nombre;
    private ArregloPtoveedor provedores;
    Scanner entrada = new Scanner(System.in);
    private ArregloOrdenes ordenes;
    private ArregloProducto productos;

    public Administrador(String codigo, String nombre, ArregloPtoveedor provedores) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.provedores = provedores;
        ordenes = new ArregloOrdenes(6);
        this.productos = new ArregloProducto(1);
        
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

  
}