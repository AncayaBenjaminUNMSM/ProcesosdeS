/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesCeviche;

/**
 *
 * @author hp
 */
public class Proceso {
   private final String pedido;
    private final int mesa;
    private final String estado;
    private final int orden;
       public Proceso (int orden,int mesa,String pedido, String estado) {
       this.orden = orden;
       this.mesa = mesa;
       this.pedido = pedido;
       this.estado = estado;
   }
   public String getpedido() {
        return pedido;
    }
   public String getestado() {
        return estado;
    }
   public int getorden() {
        return orden;
    }
  
}
