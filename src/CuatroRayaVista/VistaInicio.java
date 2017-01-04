/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Lucas
 */
public class VistaInicio extends JFrame{
    private BotonesInicio botones;
    private ImagenInicio imagen;
    public VistaInicio(){
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);
        pack();
        setResizable(false);
        botones = new BotonesInicio();
        imagen = new ImagenInicio();
        add(imagen, BorderLayout.CENTER);
        add(botones, BorderLayout.SOUTH);
        
        ImageIcon face = new ImageIcon("signo-logo.png");
        setIconImage(face.getImage());
    }
    
    public void setActionListenerPrincipal(ActionListener a){
        botones.setActionListener(a);
    }
}
