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
        
        menu = new JMenu("Configuracion");
        ayuda = new JMenu("Ayuda");
        item = new JMenuItem("Volver a empezar");
        item3 = new JMenuItem("Salir");
        item4 = new JMenuItem("Cambiar color de fondo");
        item5 = new JMenuItem("Cambiar color de foco");
        ayuda1 = new JMenuItem("Ayuda");
        
        ayuda.add(ayuda1);
        menu.add(item);
        menu.add(item4);
        menu.add(item5);
        menu.add(item3);
        
        add(menu);
        add(ayuda);

    }
    
    public void setActionListener(ActionListener actionListener) {
        item.addActionListener(actionListener);
        item3.addActionListener(actionListener);
        item4.addActionListener(actionListener);
        item5.addActionListener(actionListener);
        ayuda1.addActionListener(actionListener);
    }
}