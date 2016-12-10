/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Lucas
 */
public class BotonesInicio extends JPanel{
    private JButton [] botones = new JButton [5];
    private String [] etiqueta = {"Facil", "Media", "Dificil", "Dificultad personalizada", "JUGAR"};
    public BotonesInicio(){
        for(int i = 0; i < 5; i++){
            botones[i] = new JButton(etiqueta[i]);
            add(botones[i]);
        }
    }
    
    public void setActionListener(ActionListener a){
        for(int i = 0; i < 5; i++){
            botones[i].addActionListener(a);
        }
    }
}
