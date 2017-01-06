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
 * @author Javier
 */
public class MenuConfiguracion extends JMenuBar{
    private JMenu menu, ayuda;
    private final JMenuItem item, item3, item4, item5, ayuda1;
    
    public MenuConfiguracion(){
        
        menu = new JMenu("Configuracion"); //Creacion de un JMenu
        ayuda = new JMenu("Ayuda"); //Creacion de un JMenu
        item = new JMenuItem("Volver a empezar"); //Creacion de un JMenuItem
        item3 = new JMenuItem("Salir"); //Creacion de un JMenuItem
        item4 = new JMenuItem("Cambiar color de fondo"); //Creacion de un JMenuItem
        item5 = new JMenuItem("Cambiar color de foco"); //Creacion de un JMenuItem
        ayuda1 = new JMenuItem("Ayuda"); //Creacion de un JMenuItem
        
        ayuda.add(ayuda1); //Añadimos el JMenuItem en el JMenu
        menu.add(item); //Añadimos el JMenuItem en el JMenu
        menu.add(item4); //Añadimos el JMenuItem en el JMenu
        menu.add(item5); //Añadimos el JMenuItem en el JMenu
        menu.add(item3); //Añadimos el JMenuItem en el JMenu
        
        add(menu); //Añadimos el JMenu
        add(ayuda); //Añadimos el JMenu

    }
    
    /**
     * @param ActionListener 
     */
    public void setActionListener(ActionListener actionListener) {
        item.addActionListener(actionListener);
        item3.addActionListener(actionListener);
        item4.addActionListener(actionListener);
        item5.addActionListener(actionListener);
        ayuda1.addActionListener(actionListener);
    }
}