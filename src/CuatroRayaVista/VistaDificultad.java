/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Lucas
 */
public class VistaDificultad extends JFrame{
    private BotonesDificultad botones;
        public VistaDificultad(){
            botones = new BotonesDificultad();
            add(botones);
            ImageIcon face = new ImageIcon("signo-logo.png");
            setIconImage(face.getImage());
        }
        
        public void setActionListener(ActionListener a){
            botones.setActionListener(a);
        }
}
