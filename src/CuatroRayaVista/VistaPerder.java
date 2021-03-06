package CuatroRayaVista;
/**
 * @author Javier Alonso y Lucas Nicolini
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class VistaPerder extends JFrame {
    
    private final ImagenGameOver image;
     /**
     * Constructor de la vista de Perder
     */
    public VistaPerder() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);
        setSize(1000,700);
        setResizable(false);
        /* Creacion del panel */
        image = new ImagenGameOver();
        /* Añade el panel a la vista */
        add(image);
        /* Crea icono para la vista */
        ImageIcon face = new ImageIcon("signo-logo.png");
        setIconImage(face.getImage());
    }

    public void setActionListener(ActionListener a) {
        image.setActionListener(a);
    }

    /*
    * Clase enbebida para generar el panel que lo contiene
    */
    class ImagenGameOver extends JPanel {

        private BufferedImage imagen;
        private String imagenFileName = "";
        private final JButton [] botones;
        private final Border emptyBorder;

        public ImagenGameOver(){
            setLayout(new FlowLayout());
            setLocationRelativeTo(null);
            botones = new JButton [3];
            emptyBorder = BorderFactory.createEmptyBorder();
            
            botones[0] = new JButton("Volver a jugar");
            botones[1] = new JButton("Ver Ranking");
            botones[2] = new JButton("Salir");
            
            for (JButton b: botones){
                b.setBackground(Color.black);
                b.setPreferredSize(new Dimension(250, 100));
                b.setFont(new Font("Colibri", Font.BOLD, 18));
                b.setForeground(Color.WHITE);
                b.setFocusPainted(false);
                b.setBorder(emptyBorder);
                b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                add(b);
            }
        }
        
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            try {
                imagenFileName = "game_over.png";
                imagen = ImageIO.read(new File(imagenFileName));
            } catch (IOException e) {
                System.out.println("Problemas leyendo la imagen '" + this.imagenFileName + "'.");
                System.out.println("Motivo: " + e.getLocalizedMessage());
            }
            g.drawImage(imagen, 0, 0, 1000, 700, this);
        }
        
        public void setActionListener(ActionListener a){
            for (JButton b: botones) {
                b.addActionListener(a);
            }
        }
        
    }
}
