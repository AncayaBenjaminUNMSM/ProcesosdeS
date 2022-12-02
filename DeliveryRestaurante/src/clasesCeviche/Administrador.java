package clasesCeviche;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Administrador {
    private String codigo;
    private String nombre;

    public Administrador(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarPedidos(RealizarPedido p){
        System.out.println(p);
    }
    
    
  
}