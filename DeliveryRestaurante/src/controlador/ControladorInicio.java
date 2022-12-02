/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.Inicio.Inicio;
import iterativo.Mod;
import java.awt.event.ActionEvent;

/**
 *
 * @author user
 */
public class ControladorInicio {
    public Inicio vista;

    public ControladorInicio() {
        this.vista = new Inicio();
        
        vista.ver.addActionListener((ActionEvent ae) -> {
        Ver verpedido = new Ver();   
        verpedido.setVisible(true);
        });
        
        vista.modificar.addActionListener((ActionEvent ae) -> {
        Mod modificar = new Mod();   
        modificar.setVisible(true);
        });
        
        
    }
    
    public void iniciar(){
        this.vista.setVisible(true);
    }
    
    

}
