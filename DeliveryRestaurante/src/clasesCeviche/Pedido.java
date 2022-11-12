/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesCeviche;

/**
 *
 * @author hp
 */
public class Pedido {
        private int codigo;
        private String estado;

       public Pedido (int codigo,String estado) {
       this.codigo = codigo;
       this.estado = estado;
   }

    public String getEstado() {
        return estado;
    }
        
        
}
