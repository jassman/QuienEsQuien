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
            
            switch(opcion){
                case "Chico":
                    System.out.println("DFSFASFAS");
                    vista.opBigote();
                    break;
                
                case "Chica":
                    
                    break;
                    
                case "Rubio":
                    
                    break;
                
                case "Moreno":
                    
                    break;
                    
                case "Castaño":
                    
                    break;
                
                case "Pelirrojo":
                    
                    break;
                    
                case "Canoso":
                    
                    break;
                
                case "Calvo":
                    
                    break;
                    
                case "Azules":
                    
                    break;
                    
                case "Verdes":
                    
                    break;
                    
                case "Marrones":
                    
                    break;
                    
                case "NGrande":
                    
                    break;
                    
                case "NMediana":
                    
                    break;
                    
                case "NPequeña":
                    
                    break;
                    
                case "BGrande":
                    
                    break;
                    
                case "BMediana":
                    
                    break;
                    
                case "Bpequeña":
                    
                    break;
                    
                case "SiGafas":
                    
                    break;
                    
                case "NoGafas":
                    
                    break;
                    
                case "SiSombrero":
                    
                    break;
                    
                case "NoSombrero":
                    
                    break;
                    
                case "SiBigote":
                    
                    break;
                    
                case "NoBigote":
                    
                    break;
            }
         }
    }
    
    
      
}
