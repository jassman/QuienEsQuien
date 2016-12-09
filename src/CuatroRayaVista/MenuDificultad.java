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
public class MenuDificultad extends JMenuBar{
    private JMenu menu;
    private JMenuItem item, item2, item3, item4;
    
    public MenuDificultad(){
        menu = new JMenu("Dificultad");
        item = new JMenuItem("Facil");
        item2 = new JMenuItem("Media");
        item3 = new JMenuItem("Dificil");
        item4 = new JMenuItem("Dificultad personalizada");
        
        menu.add(item);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);
        add(menu);
    }
    
    public void setActionListener(ActionListener actionListener) {
        item.addActionListener(actionListener);
        item2.addActionListener(actionListener);
        item3.addActionListener(actionListener);
        item4.addActionListener(actionListener);
    }
}
