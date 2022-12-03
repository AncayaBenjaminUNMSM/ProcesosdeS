package App;

import clasesCeviche.Administrador;
import clasesCeviche.PedidoArreglo;
import clasesCeviche.Producto;
import clasesCeviche.ProductoArreglo;

import controlador.*;

/**
 *
 * @author hp
 */
public class Principal {

    public static void main(String[] args) {
        
        Administrador administrador = new Administrador("123", "admi");
        PedidoArreglo pedidoArreglo = new PedidoArreglo(1);
        ProductoArreglo productoArreglo = new ProductoArreglo(1);
        
        ControladorLogin controladorLogin = new ControladorLogin(administrador, productoArreglo, pedidoArreglo);
        
        controladorLogin.iniciar();
        
 
    }
    
}