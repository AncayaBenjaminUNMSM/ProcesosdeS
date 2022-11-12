package App;

import clasesCeviche.Administrador;
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
        
                

 
    }
    
}