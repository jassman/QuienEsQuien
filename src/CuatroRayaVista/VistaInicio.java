/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Lucas
 */
public class VistaInicio extends JFrame{
    private BotonesInicio botones;
    public VistaInicio(){
        botones = new BotonesInicio();
        add(botones);
    }
    
    public void setActionListenerPrincipal(ActionListener a){
        botones.setActionListener(a);
    }
}
