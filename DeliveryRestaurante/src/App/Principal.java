package App;

import clasesCeviche.Administrador;
import clasesCeviche.ArregloPlatos;
import clasesCeviche.Plato;
import clasesCeviche.Producto;

import controlador.*;

/**
 *
 * @author hp
 */
public class Principal {

    public static void main(String[] args) {
        
        Administrador admi = new Administrador("21", "User");        
        System.out.println(admi);
        
        FormMenuPrincipal vmprincip = new FormMenuPrincipal();
        ControladorMenuprincipal cmenuprincip = new ControladorMenuprincipal(admi, vmprincip);
        cmenuprincip.iniciar();
        
        
        ArregloPlatos platos = new ArregloPlatos(2);
        platos.agregar(new Plato(1.0,"A"));
        platos.agregar(new Plato(1.0,"B"));
        platos.agregar(new Plato(1.0,"C"));
        System.out.println(platos);
 
    }
    
}