package controlador;

import App.*;
import clasesCeviche.Administrador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author hp
 */
public class ControladorLogin {
    private Administrador admin;
    private LoginGeneral vista;
    private FormMenuPrincipal vmprincip;
    //private PrincipalMenu vistamenu;
    //ControladorMenuPrincipal menuprincip;

    public ControladorLogin(Administrador admin, FormMenuPrincipal form) {
        this.admin = admin;
        this.vista = new LoginGeneral();
        this.vmprincip = form;
        this.vista.jButtonLogin.addActionListener( new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            String userIn = vista.jTextLoginUsuario.getText();
            String userSave = admin.getNombre();
            
            String userPssIn = String.valueOf(vista.jPasswordFieldLogin.getPassword());
            String userPss = admin.getCodigo();
            
            if(userIn.equals(userSave) && userPssIn.equals(userPss) ){
                 vmprincip.setVisible(true);
                 vista.dispose();
            }

        }
        }
        
        ); 
    }
    

    public void iniciar(){
        vista.setVisible(true);
    }
  
}