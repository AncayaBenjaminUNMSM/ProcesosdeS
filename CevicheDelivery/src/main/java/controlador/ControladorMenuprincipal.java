package controlador;

import App.FormMenuPrincipal;
import App.LoginGeneral;
import clasesCeviche.Administrador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author hp
 */
public class ControladorMenuprincipal {
    private Administrador admi;
    private LoginGeneral loginvista;
    private FormMenuPrincipal vmenuprincipal;

    public ControladorMenuprincipal(Administrador admi, FormMenuPrincipal vmenuprincipal) {
        this.admi = admi;
        this.loginvista = new LoginGeneral();
        this.vmenuprincipal = vmenuprincipal;
        
        this.vmenuprincipal.jLabelAdminName.setText(this.admi.getNombre());
        
   
        
    }
    
    public void iniciar(){
        ControladorLogin clogin = new ControladorLogin(admi, vmenuprincipal);
        clogin.iniciar();
    }
    
    
    
}
