/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaControlador;

import CuatroRayaModelo.Modelo;
import CuatroRayaVista.VentanaPrincipal;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.awt.event.MouseEvent.BUTTON1;
import static java.awt.event.MouseEvent.BUTTON3;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Lucas
 */


public class Controlador {

    private VentanaPrincipal vista;
    private Modelo modelo;
    
    public Controlador(Modelo modelo, VentanaPrincipal vista){
        this.vista = vista;
        this.modelo = modelo;
        
        
        vista.setActionListenerAsesino(new Comprobacion());
        vista.setActionListenerBotones1(new Opciones());
        vista.setActionListenerBotones2(new SubOpciones());
        vista.addWindowListener(new WindowListener());
       // vista.setActionListenerMenu(new Menu());
       
        
    }
    
    class WindowListener extends WindowAdapter {
    
        public void windowClosing(WindowEvent e) {
            System.out.println( " PhotoEditorController : Cerrar ventana.");
            System.exit(0);
        }
    } 
    
    
    class Comprobacion implements ActionListener{
         public void actionPerformed(ActionEvent a){
            String opcion = a.getActionCommand();
            
            modelo.Comprobar(opcion);
         }
    }
    
    class Opciones implements ActionListener{
         public void actionPerformed(ActionEvent a){
            String opcion = a.getActionCommand();
            
            switch(opcion){
                case "Sexo":
                    vista.opSexo();
                    break;
                
                case "Pelo":
                    vista.opPelo();
                    break;
                    
                case "Ojos":
                    vista.opOjos();
                    break;
                
                case "Nariz":
                    vista.opNariz();
                    break;
                    
                case "Boca":
                    vista.opBoca();
                    break;
                
                case "Gafas":
                    vista.opGafas();
                    break;
                    
                case "Sombrero":
                    vista.opSombrero();
                    break;
                
                case "Bigote":
                    vista.opBigote();
                    break;
            }
         }
    }
    
    class Menu implements ActionListener{
        public void actionPerformed(ActionEvent a){
            String opcion = a.getActionCommand();
            
            switch(opcion){
                case "Guardar":
                    System.out.println("GUARDAR");
                    
                    
                    break;
                    
                case "Cargar":
                    System.out.println("CARGAR");
                    
                    vista.repaint();
                    break;
                    
                case "Salir":
                    System.exit(0);
                    break;
            }
        }
    }
    
    class SubOpciones implements ActionListener{
         public void actionPerformed(ActionEvent a){
            String opcion = a.getActionCommand();
            int [] eliminados;
            switch(opcion){
                case "Chico":
                case "Chica":
                    eliminados = modelo.eliminar("sexo", opcion);
                    vista.eliminaSospechosos(eliminados);
                    break;
                    
                case "Rubio":
                case "Moreno":
                case "Castaño":
                case "Pelirrojo":
                case "Canoso":
                case "Calvo":
                    eliminados = modelo.eliminar("pelo", opcion);
                    vista.eliminaSospechosos(eliminados);
                    break;
                    
                case "Azules":
                case "Verdes":
                case "Marrones":
                    eliminados = modelo.eliminar("ojos", opcion);
                    vista.eliminaSospechosos(eliminados);
                    break;
                    
                case "NGrande":
                case "NMediana":
                case "NPequeña":
                    eliminados = modelo.eliminar("nariz", opcion);
                    vista.eliminaSospechosos(eliminados);
                    break;
                    
                case "BGrande":
                case "BMediana":
                case "Bpequeña":
                    eliminados = modelo.eliminar("boca", opcion);
                    vista.eliminaSospechosos(eliminados);
                    break;
                    
                case "SiGafas":
                case "NoGafas":
                    eliminados = modelo.eliminar("gafas", opcion);
                    vista.eliminaSospechosos(eliminados);
                    break;
                    
                case "SiSombrero":
                case "NoSombrero":
                    eliminados = modelo.eliminar("sombrero", opcion);
                    vista.eliminaSospechosos(eliminados);
                    break;
                    
                case "SiBigote":
                case "NoBigote":
                    eliminados = modelo.eliminar("bigote", opcion);
                    vista.eliminaSospechosos(eliminados);
                    break;
            }
         }
    }
    
    
      
}
