/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaControlador;

import CuatroRayaModelo.Modelo;
import CuatroRayaVista.VentanaPrincipal;
import CuatroRayaVista.VistaInicio;
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
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Lucas
 */


public class Controlador {

    private VentanaPrincipal vista;
    private Modelo modelo;
    private int puntos, ok;
    private VistaInicio inicio;
    public Controlador(Modelo modelo, VentanaPrincipal vista, VistaInicio inicio){
        this.vista = vista;
        this.modelo = modelo;
        this.inicio = inicio;
        
        vista.setActionListenerAsesino(new Comprobacion());
        vista.setActionListenerBotones1(new Opciones());
        vista.setActionListenerBotones2(new SubOpciones());
        vista.addWindowListener(new WindowListener());
        vista.setActionListenerMenu(new Menu());
        inicio.setActionListenerPrincipal(new Principal());
        inicio.addWindowListener(new WindowListenerInicio());
        
    }
    class WindowListenerInicio extends WindowAdapter {
    
        public void windowClosing(WindowEvent e) {
            System.out.println( " PhotoEditorController : Cerrar ventana.");
            System.exit(0);
        }
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
            ok = JOptionPane.showConfirmDialog(null,
                    "Estas seguro que esta es tu respuesta final?",  
                    "Seleccione la opcion deseada",
                    JOptionPane.YES_NO_OPTION);
            
            if(ok == 0)
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
                case "Facil":
                    modelo.partidaFacil();
                    puntos = modelo.getPuntos();
                    vista.setText(puntos);
                    
                    
                    break;
                    
                case "Media":
                    modelo.partidaMedia();
                    puntos = modelo.getPuntos();
                    vista.setText(puntos);
                    
                    break;
                    
                case "Dificil":
                    modelo.partidaDificil();
                    puntos = modelo.getPuntos();
                    vista.setText(puntos);
                    break;
                    
                case "Dificultad personalizada":
                    modelo.partidaPersonalizada();
                    puntos = modelo.getPuntos();
                    vista.setText(puntos);
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
                    puntos = modelo.restarPuntos();
                    vista.setText(puntos);
                    vista.respuesta(modelo.respuesta("sexo", opcion));
                    vista.eliminaSospechosos(modelo.eliminar("sexo", opcion));
                    vista.bloquearBoton(opcion);
                    eliminados = modelo.eliminar("sexo", opcion);
                    vista.eliminaSospechosos(eliminados);
                    vista.bloquearBoton("Chico");
                    vista.bloquearBoton("Chica");
                    break;
                    
                case "Rubio":
                case "Moreno":
                case "Castaño":
                case "Pelirrojo":
                case "Canoso":
                case "Calvo":
                    puntos = modelo.restarPuntos();
                    vista.setText(puntos);
                    vista.respuesta(modelo.respuesta("pelo", opcion));
                    vista.eliminaSospechosos(modelo.eliminar("pelo", opcion));
                    vista.bloquearBoton(opcion);
                    break;
                    
                case "Azules":
                case "Verdes":
                case "Marrones":
                    puntos = modelo.restarPuntos();
                    vista.setText(puntos);
                    vista.respuesta(modelo.respuesta("ojos", opcion));
                    vista.eliminaSospechosos(modelo.eliminar("ojos", opcion));
                    vista.bloquearBoton(opcion);
                    break;
                    
                case "NGrande":
                case "NMediana":
                case "NPequeña":
                    puntos = modelo.restarPuntos();
                    vista.setText(puntos);
                    vista.respuesta(modelo.respuesta("nariz", opcion));       
                    vista.eliminaSospechosos(modelo.eliminar("nariz", opcion));
                    vista.bloquearBoton(opcion);
                    break;
                    
                case "BGrande":
                case "BMediana":
                case "BPequeña":
                    puntos = modelo.restarPuntos();
                    vista.setText(puntos);
                    vista.respuesta(modelo.respuesta("boca", opcion));
                    vista.eliminaSospechosos(modelo.eliminar("boca", opcion));
                    vista.bloquearBoton(opcion);
                    break;
                    
                case "SiGafas":
                case "NoGafas":
                    puntos = modelo.restarPuntos();
                    vista.setText(puntos);
                    vista.respuesta(modelo.respuesta("gafas", opcion));
                    vista.eliminaSospechosos(modelo.eliminar("gafas", opcion));
                    vista.bloquearBoton("SiGafas");
                    vista.bloquearBoton("NoGafas");
                    break;
                    
                case "SiSombrero":
                case "NoSombrero":
                    puntos = modelo.restarPuntos();
                    vista.setText(puntos);
                    vista.respuesta(modelo.respuesta("sombrero", opcion));
                    vista.eliminaSospechosos(modelo.eliminar("sombrero", opcion));
                    vista.bloquearBoton("SiSombrero");
                    vista.bloquearBoton("NoSombrero");
                    break;
                    
                case "SiBigote":
                case "NoBigote":
                    puntos = modelo.restarPuntos();
                    vista.setText(puntos);
                    vista.respuesta(modelo.respuesta("bigote", opcion));
                    vista.eliminaSospechosos(modelo.eliminar("bigote", opcion));
                    vista.bloquearBoton("SiBigote");
                    vista.bloquearBoton("NoBigote");
                    break;
            }
         }
    }
    
    class Principal implements ActionListener{
         public void actionPerformed(ActionEvent a){
            String opcion = a.getActionCommand();
            switch(opcion){
                case "Facil":
                    modelo.partidaFacil();
                    puntos = modelo.getPuntos();
                    vista.setText(puntos);
                    break;
                    
                case "Media":
                    modelo.partidaMedia();
                    puntos = modelo.getPuntos();
                    vista.setText(puntos);
                    break;
                    
                case "Dificil":
                    modelo.partidaDificil();
                    puntos = modelo.getPuntos();
                    vista.setText(puntos);
                    break;
                    
                case "Dificultad personalizada":
                    modelo.partidaPersonalizada();
                    puntos = modelo.getPuntos();
                    vista.setText(puntos);
                    break;
                    
                case "JUGAR":
                    vista.setVisible(true);
                    inicio.setVisible(false);
                    break;
            }
         }
    }
    
      
}
