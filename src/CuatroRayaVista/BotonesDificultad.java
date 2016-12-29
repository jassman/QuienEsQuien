/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import static javax.swing.BoxLayout.Y_AXIS;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 *
 * @author Lucas
 */
public class BotonesDificultad extends JPanel{
    private JRadioButton facil, medio, dificil, personalizado;
    private ButtonGroup grupo;
    private JLabel etiqueta;
    
    public BotonesDificultad(){
        setLayout(new BoxLayout(this, Y_AXIS));
        etiqueta = new JLabel("Elige dificultad de juego");
        facil = new JRadioButton("Facil");
        medio = new JRadioButton("Media");
        dificil = new JRadioButton("Dificil");
        personalizado = new JRadioButton ("Personalizada");
        grupo = new ButtonGroup();
        
        add(etiqueta);
        grupo.add(facil);
        grupo.add(medio);
        grupo.add(dificil);
        grupo.add(personalizado);
        add(facil);
        add(medio);
        add(dificil);
        add(personalizado);
    }
    public void setActionListener(ActionListener a){
        facil.addActionListener(a);
        medio.addActionListener(a);
        dificil.addActionListener(a);
        personalizado.addActionListener(a);
    }
}
