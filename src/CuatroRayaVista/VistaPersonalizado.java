package CuatroRayaVista;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Javier Alonso y Lucas Nicolini
 */
public class VistaPersonalizado extends JFrame {

    private final BotonesPersonalizado botones;
    private final JButton boton;

    /**
     * Contructor de la vista personalizada
     */
    public VistaPersonalizado() {
        setLayout(new BorderLayout());
        setVisible(false);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setTitle("Nivel personalizado");
        /* Creacion del paneles */
        botones = new BotonesPersonalizado();
        boton = new JButton("Aceptar");
        /* Añade el panel a la vista */
        add(botones, BorderLayout.CENTER);
        add(boton, BorderLayout.SOUTH);
        /* Añade icono al frame */
        ImageIcon face = new ImageIcon("signo-logo.png");
        setIconImage(face.getImage());
    }

    public void setActionListener(ActionListener a) {
        boton.addActionListener(a);
    }

    public int getPIniciales() {
        return botones.getPIniciales();
    }

    public int getPSexo() {

        return botones.getPSexo();
    }

    public int getPPelo() {

        return botones.getPPelo();
    }

    public int getPNariz() {

        return botones.getPNariz();
    }

    public int getPBoca() {

        return botones.getPBoca();
    }

    public int getPGafas() {

        return botones.getPGafas();
    }

    public int getPBigote() {

        return botones.getPBigote();
    }

    public int getPSombrero() {

        return botones.getPSombrero();
    }

    public int getPOjos() {

        return botones.getPOjos();
    }
}
