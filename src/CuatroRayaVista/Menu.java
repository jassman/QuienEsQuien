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
public class Menu extends JMenuBar{
    private MenuDificultad menuDificultad;
    private MenuConfiguracion menuConfiguracion;
    
    public Menu(){
        menuConfiguracion = new MenuConfiguracion();
        //menuDificultad = new MenuDificultad();

        add(menuConfiguracion);
        //add(menuDificultad);
    }
    
    public void setActionListener(ActionListener actionListener) {
        menuConfiguracion.setActionListener(actionListener);
        //menuDificultad.setActionListener(actionListener);
    }
}
