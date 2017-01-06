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
 * @author Lucas y Javier
 */
public class BotonesDificultad extends JPanel{
    private JRadioButton facil, medio, dificil, personalizado;
    private ButtonGroup grupo;
    private JLabel etiqueta;
    
    public BotonesDificultad(){
        setLayout(new BoxLayout(this, Y_AXIS)); //Ponemos el JPanel en vertical
        etiqueta = new JLabel("Elige dificultad de juego"); //Creacion de un JLabel
        facil = new JRadioButton("Facil"); //Creacion de un JRadioButton
        medio = new JRadioButton("Media"); //Creacion de un JRadioButton
        dificil = new JRadioButton("Dificil"); //Creacion de un JRadioButton
        personalizado = new JRadioButton ("Personalizada"); //Creacion de un JRadioButton
        grupo = new ButtonGroup(); //Creacion de un ButtonGroup
        
        add(etiqueta); //Añadimos el JLabel
        grupo.add(facil); //Añadimos un JRadioButton al grupo
        grupo.add(medio); //Añadimos un JRadioButton al grupo
        grupo.add(dificil); //Añadimos un JRadioButton al grupo
        grupo.add(personalizado); //Añadimos un JRadioButton al grupo
        add(facil); //Añadimos un JRadioButton
        add(medio); //Añadimos un JRadioButton
        add(dificil); //Añadimos un JRadioButton
        add(personalizado); //Añadimos un JRadioButton
    }
    
    /**
     * @param ActionListener 
     */
    public void setActionListener(ActionListener a){
        facil.addActionListener(a);
        medio.addActionListener(a);
        dificil.addActionListener(a);
        personalizado.addActionListener(a);
    }
}
