/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesCeviche;

/**
 *
 * @author hp
 */
public class RealizarPedido {
        private String pedido;
        private int cantidad;

    public RealizarPedido(int cantidad) {
        this.cantidad = cantidad;
    }
        
        

    @Override
    public String toString() {
        return "RealizarPedido{" + "pedido=" + pedido + ", cantidad=" + cantidad + '}';
    }

    public int getCantidad() {
        return cantidad;
    }
    
    
        
        
}
