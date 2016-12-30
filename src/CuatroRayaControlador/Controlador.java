/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaControlador;

import CuatroRayaModelo.Modelo;
import CuatroRayaVista.ElegirColor;
import CuatroRayaVista.VentanaPrincipal;
import CuatroRayaVista.VistaDificultad;
import CuatroRayaVista.VistaGanar;
import CuatroRayaVista.VistaInicio;
import CuatroRayaVista.VistaPerder;
import CuatroRayaVista.VistaRanking;
import cuatroenraya.QuienEsQuien;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */


public class Controlador {

    private VentanaPrincipal vista;
    private Modelo modelo;
    private int puntos, ok;
    private VistaInicio inicio;
    private VistaDificultad d;
    private final VistaGanar v_ganar;
    private final VistaPerder v_perder;
    private final VistaRanking v_ranking;
    private ElegirColor color;
    private Color c, g;
    private VistaDificultad person;
    
    public Controlador(Modelo modelo, VentanaPrincipal vista, VistaInicio inicio, VistaDificultad d){
        this.vista = vista;
        this.modelo = modelo;
        this.inicio = inicio;
        this.d = d;
        v_ganar =  new VistaGanar();
        v_perder = new VistaPerder();
        v_ranking = new VistaRanking();
        
        
        v_perder.setActionListener(new ListenerVistaPerder());
        vista.setActionListenerAsesino(new Comprobacion());
        vista.setActionListenerBotones1(new Opciones());
        vista.setActionListenerBotones2(new SubOpciones());
        vista.setActionListenerMenu(new Menu());
        vista.addWindowListener(new WindowListener());
        inicio.setActionListenerPrincipal(new Principal());
        inicio.addWindowListener(new WindowListener());
        d.setActionListener(new Dificultad());
        d.addWindowListener(new WindowListener());
        
    }
    /*
    * Devuelve true si los puntos son mayor que 0
    */
    public void validaPartida(){
         if(puntos<=0){
            vista.setVisible(false);
            v_perder.setVisible(true);
         }
    }
    
    class WindowListener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println( " PhotoEditorController : Cerrar ventana.");
            System.exit(0);
        }
    } 
    /*
    * Listeners para la vista Perder
    */
    class ListenerVistaPerder implements ActionListener{
         @Override
         public void actionPerformed(ActionEvent a){
            String opcion = a.getActionCommand();
            switch(opcion){
                case "Volver a jugar":
                    v_perder.setVisible(false);
                    QuienEsQuien q = new QuienEsQuien();
                    break;
                case "Ver Ranking":
                    v_perder.setVisible(false);
                    v_ranking.setVisible(true);
                    break;
                case "Salir":
                    System.exit(0);
                    break;
            }
                    
         }
    }
 
    
    class Comprobacion implements ActionListener{
         @Override
         public void actionPerformed(ActionEvent a){
            String opcion = a.getActionCommand();
            ok = JOptionPane.showConfirmDialog(null,
                    "Estas seguro que esta es tu respuesta final?",  
                    "Seleccione la opcion deseada",
                    JOptionPane.YES_NO_OPTION);
            
            if(ok == 0){
                vista.setVisible(false);
                if(modelo.Comprobar(opcion))
                    v_ganar.setVisible(true);
                else
                    v_perder.setVisible(true);
                
            }
         }
    }
    
    class Opciones implements ActionListener{
         @Override
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
    
    class Dificultad implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent a){
            String opcion = a.getActionCommand();
            
            switch(opcion){
                
                case "Facil":
                    modelo.partidaFacil();
                    puntos = modelo.getPuntos();
                    vista.setText(puntos);
                    modelo.setFacil(true);
                    modelo.setMedio(false);
                    modelo.setDificil(false);
                    modelo.setPersonalizado(false);
                    d.setVisible(false);
                    vista.setVisible(true);
                    
                    break;
                    
                case "Media":
                    modelo.partidaMedia();
                    puntos = modelo.getPuntos();
                    vista.setText(puntos);
                    modelo.setFacil(false);
                    modelo.setMedio(true);
                    modelo.setDificil(false);
                    modelo.setPersonalizado(false);
                    d.setVisible(false);
                    vista.setVisible(true);
                    
                    break;
                    
                case "Dificil":
                    modelo.partidaDificil();
                    puntos = modelo.getPuntos();
                    vista.setText(puntos);
                    modelo.setFacil(false);
                    modelo.setMedio(false);
                    modelo.setDificil(true);
                    modelo.setPersonalizado(false);
                    d.setVisible(false);
                    vista.setVisible(true);
                    break;
                    
                case "Personalizada":
                    
                    modelo.partidaPersonalizada();
                    puntos = modelo.getPuntos();
                    vista.setText(puntos);
                    modelo.setFacil(false);
                    modelo.setMedio(false);
                    modelo.setDificil(false);
                    modelo.setPersonalizado(true);
                    d.setVisible(false);
                    vista.setVisible(true);
                    
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
                    
                    vista.respuesta(modelo.respuesta("sexo", opcion));
                    vista.eliminaSospechosos(modelo.eliminar("sexo", opcion));
                    vista.bloquearBoton(opcion);
                    if(modelo.getPersonalizado()){
                        puntos = modelo.restarPuntosSexo();
                        vista.setText(puntos);
                    }
                    else{
                        puntos = modelo.restarPuntos();
                        vista.setText(puntos);
                    }
                    
                    eliminados = modelo.eliminar("sexo", opcion);
                    vista.eliminaSospechosos(eliminados);
                    vista.bloquearBoton("Chico");
                    vista.bloquearBoton("Chica");
                    validaPartida();
                    
                    break;
                    
                case "Rubio":
                case "Moreno":
                case "Castaño":
                case "Pelirrojo":
                case "Canoso":
                case "Calvo":
                    
                    vista.respuesta(modelo.respuesta("pelo", opcion));
                    vista.eliminaSospechosos(modelo.eliminar("pelo", opcion));
                    if(modelo.getPersonalizado()){
                        puntos = modelo.restarPuntosPelo();
                        vista.setText(puntos);
                    }
                    else{
                        puntos = modelo.restarPuntos();
                        vista.setText(puntos);
                    }
                    eliminados = modelo.eliminar("pelo", opcion);
                    vista.eliminaSospechosos(eliminados);
                    vista.bloquearBoton(opcion);
                    validaPartida();
                    break;
                    
                case "Azules":
                case "Verdes":
                case "Marrones":
                    
                    vista.respuesta(modelo.respuesta("ojos", opcion));
                    vista.eliminaSospechosos(modelo.eliminar("ojos", opcion));
                    if(modelo.getPersonalizado()){
                        puntos = modelo.restarPuntosOjos();
                        vista.setText(puntos);
                    }
                    else{
                        puntos = modelo.restarPuntos();
                        vista.setText(puntos);
                    }
                    
                    eliminados = modelo.eliminar("ojos", opcion);
                    vista.eliminaSospechosos(eliminados);
                    vista.bloquearBoton(opcion);
                    validaPartida();
                    
                    break;
                    
                case "NGrande":
                case "NMediana":
                case "NPequeña":
                    
                    vista.respuesta(modelo.respuesta("nariz", opcion));       
                    vista.eliminaSospechosos(modelo.eliminar("nariz", opcion));
                    if(modelo.getPersonalizado()){
                        puntos = modelo.restarPuntosNariz();
                        vista.setText(puntos);
                    }
                    else{
                       puntos = modelo.restarPuntos();
                       vista.setText(puntos); 
                    }
                    
                    eliminados = modelo.eliminar("nariz", opcion);
                    vista.eliminaSospechosos(eliminados);
                    vista.bloquearBoton(opcion);
                    validaPartida();
                    break;
                    
                case "BGrande":
                case "BMediana":
                case "BPequeña":
                    
                    vista.respuesta(modelo.respuesta("boca", opcion));
                    vista.eliminaSospechosos(modelo.eliminar("boca", opcion));
                    if(modelo.getPersonalizado()){
                        puntos = modelo.restarPuntosBoca();
                        vista.setText(puntos);
                    }
                    else{
                        puntos = modelo.restarPuntos();
                        vista.setText(puntos);
                    }
                    
                    eliminados = modelo.eliminar("boca", opcion);
                    vista.eliminaSospechosos(eliminados);
                    vista.bloquearBoton(opcion);
                    validaPartida();
                    break;
                    
                case "SiGafas":
                case "NoGafas":
                    
                    vista.respuesta(modelo.respuesta("gafas", opcion));
                    vista.eliminaSospechosos(modelo.eliminar("gafas", opcion));
                    if(modelo.getPersonalizado()){
                        puntos = modelo.restarPuntosGafas();
                        vista.setText(puntos);
                    }
                    else{
                        puntos = modelo.restarPuntos();
                        vista.setText(puntos);
                    }
                    
                    eliminados = modelo.eliminar("gafas", opcion);
                    vista.eliminaSospechosos(eliminados);
                    vista.bloquearBoton("SiGafas");
                    vista.bloquearBoton("NoGafas");
                    validaPartida();
                    break;
                    
                case "SiSombrero":
                case "NoSombrero":
                    
                    vista.respuesta(modelo.respuesta("sombrero", opcion));
                    vista.eliminaSospechosos(modelo.eliminar("sombrero", opcion));
                    if(modelo.getPersonalizado()){
                        puntos = modelo.restarPuntosSombrero();
                        vista.setText(puntos);
                    }
                    else{
                        puntos = modelo.restarPuntos();
                        vista.setText(puntos);
                    }

                    eliminados = modelo.eliminar("sombrero", opcion);
                    vista.eliminaSospechosos(eliminados);
                    vista.bloquearBoton("SiSombrero");
                    vista.bloquearBoton("NoSombrero");
                    validaPartida();
                    break;
                    
                case "SiBigote":
                case "NoBigote":
                    vista.respuesta(modelo.respuesta("bigote", opcion));
                    vista.eliminaSospechosos(modelo.eliminar("bigote", opcion));
                    if(modelo.getPersonalizado()){
                        puntos = modelo.restarPuntosBigote();
                        vista.setText(puntos);
                    }
                    else{
                        puntos = modelo.restarPuntos();
                        vista.setText(puntos);
                    }
                    eliminados = modelo.eliminar("bigote", opcion);
                    vista.eliminaSospechosos(eliminados);
                    vista.bloquearBoton("SiBigote");
                    vista.bloquearBoton("NoBigote");
                    validaPartida();
                    break;
            }
         }
    }
    
    class Principal implements ActionListener{
         public void actionPerformed(ActionEvent a){
            String opcion = a.getActionCommand();
            switch(opcion){
               
                case "JUGAR":
                    vista.setVisible(false);
                    d.setVisible(true);
                    inicio.setVisible(false);
                    break;
            }
         }
    }
    
    class Menu implements ActionListener{
        public void actionPerformed(ActionEvent a){
            String opcion = a.getActionCommand();
            
            switch(opcion){
                case "Ayuda":
                    JOptionPane.showMessageDialog(null, "-El usuario debe jugar el rol de detective, haciendo preguntas al sistema sobre " +
"los rasgos físicos del asesino. \n" + "-Cada pregunta que haga el usuario será respondida por un SI o un NO por " +
"el sistema. \n" + "-Conforme el sistema va " +
"respondiendo las preguntas, se van eliminando automáticamente los sospechosos que no concuerdan con " +
"los rasgos del asesino.\n" + "-Cada pregunta que haga el usuario implica un descuento de puntos. \n" + "-El jugador solo " +
"gana si descubre al asesino con más de 0 puntos en su cuenta. \n");

                    break;
                    
                case "Volver a empezar":
                    
                    
                    break;
                    
                    
                case "Cambiar color de fondo":
                    color = new ElegirColor();
                    c = color.getColor();
                    vista.setColorFondo(c);
                    break;
                    
                case "Cambiar color de foco":
                    color = new ElegirColor();
                    g = color.getColor();
                    vista.setColorFoco(g);
                    break;
                    
                case "Salir":
                    System.exit(0);
                    break;

            }
        }
    }
    
      
}
       
      