/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Lucas
 */
public class MenuDificultad extends JMenu{
    private JMenu menu;
    private JMenuItem item, item2, item3, item4;
    
    public MenuDificultad(){
        super("Dificultad"); //Constructor
        item = new JMenuItem("Facil"); //Creacion de un JMenuItem
        item2 = new JMenuItem("Media"); //Creacion de un JMenuItem
        item3 = new JMenuItem("Dificil"); //Creacion de un JMenuItem
        item4 = new JMenuItem("Dificultad personalizada"); //Creacion de un JMenuItem
        
        add(item); //Añadimos un JMenuItem
        add(item2); //Añadimos un JMenuItem
        add(item3); //Añadimos un JMenuItem
        add(item4); //Añadimos un JMenuItem

    }
    
    /**
     * @param ActionListener 
     */
    public void setActionListener(ActionListener actionListener) {
        item.addActionListener(actionListener);
        item2.addActionListener(actionListener);
        item3.addActionListener(actionListener);
        item4.addActionListener(actionListener);
    }
}
