package CuatroRayaVista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Javier Alonso y Lucas Nicolini
 */
public class VistaInicio extends JFrame{
    
    private final BotonesInicio botones;
    private final ImagenInicio imagen;
    /**
     * Constructor Vista Inicio de partida para empezar a jugar
     */
    public VistaInicio(){
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);
        setSize(1000,700);
        setResizable(false);
        setLocationRelativeTo(null);
        /* Creacion de paneles */
        botones = new BotonesInicio();
        imagen = new ImagenInicio();
        /* Añade paneles al frame */
        imagen.add(botones);
        add(imagen, BorderLayout.CENTER);
        /* Añade icono al frame */
        ImageIcon face = new ImageIcon("signo-logo.png");
        setIconImage(face.getImage());
    }
    
    /**
     * @param ActionListener 
     */
    public void setActionListenerPrincipal(ActionListener a){
        botones.setActionListener(a);
    }
}
