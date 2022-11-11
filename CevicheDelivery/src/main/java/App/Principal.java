package App;

import clasesCeviche.Administrador;
import clasesCeviche.ArregloProducto;
import clasesCeviche.ArregloPtoveedor;
import clasesCeviche.Producto;
import clasesCeviche.Ptoveedor;
import controlador.*;

/**
 *
 * @author hp
 */
public class Principal {

    public static void main(String[] args) {
        Producto  pto;
        ArregloProducto productos;
        pto = new Producto("oca", (float) 1.0);
        productos = new ArregloProducto(3);
        productos.agregar(pto);
        pto = new Producto("papa", (float) 1.1);
        productos.agregar(pto);
        pto = new Producto("camote", (float) 1.1);
        productos.agregar(pto);
        
        Ptoveedor provedor;
        provedor = new Ptoveedor("Tuberculos",333,productos);
        
        ArregloPtoveedor provedoresarray;
        provedoresarray = new ArregloPtoveedor(1);
        provedoresarray.agregar(provedor);
        
        Administrador admi = new Administrador("21", "User", provedoresarray);        
        System.out.println(admi);
        
        FormMenuPrincipal vmprincip = new FormMenuPrincipal();
        ControladorMenuprincipal cmenuprincip = new ControladorMenuprincipal(admi, vmprincip);
        cmenuprincip.iniciar();
        
                

 
    }
    
}