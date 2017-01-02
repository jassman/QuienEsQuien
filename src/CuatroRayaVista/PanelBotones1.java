/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Lucas
 */
public class PanelBotones1 extends JPanel{
    private JButton [] botones = new JButton [8];
    private String [] etiqueta = {"Sexo", "Pelo", "Ojos", "Nariz", "Boca", "Gafas", "Sombrero", "Bigote"};
    
    public PanelBotones1(){
        for(int i = 0; i < 8; i++){
            botones[i] = new JButton();
            ImageIcon rasgo = new ImageIcon("boton" + (i) + ".gif");
            Image img = rasgo.getImage() ;  
            Image newimg = img.getScaledInstance( 50, 50,  java.awt.Image.SCALE_SMOOTH ) ;  
            rasgo = new ImageIcon(newimg);
            botones[i].setIcon(rasgo);
            botones[i].setActionCommand(etiqueta[i]);
            botones[i].setBackground(Color.WHITE);
            botones[i].setForeground(Color.BLACK);
            add(botones[i]);
        }
    }
    
    public void setActionListener(ActionListener a){
        for(int i = 0; i < 8; i++){
            botones[i].addActionListener(a);
        }
    }
    
    public void setColor(Color c){
        this.setBackground(c);
    }
    /*
    public void bloquearBotones1(String s){
        for(int i = 0; i < 8; i++){
            if (botones[i].getActionCommand() == s){
                botones[i].setEnabled(false);
            }
        }
    }
    */
}
