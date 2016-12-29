/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author Javier
 */
public class MenuConfiguracion extends JMenu{
    private JMenu menu;
    private final JMenuItem item, item2, item3;
    
    public MenuConfiguracion(){
        super("Configuracion");
        item = new JMenuItem("Volver a empezar");
        //item = new JMenuItem("Volver a empezar");
        item2 = new JMenuItem("Instrucciones");
        item3 = new JMenuItem("Salir");

        add(item);
        add(item2);
        add(item3);

    }
    
    public void setActionListener(ActionListener actionListener) {
        item.addActionListener(actionListener);
        item2.addActionListener(actionListener);
        item3.addActionListener(actionListener);
    }
}