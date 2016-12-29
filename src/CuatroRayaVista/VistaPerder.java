/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

/**
 *
 * @author Javier
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VistaPerder extends JFrame {

    private BotonesDificultad botones;
    private ImagenGameOver image;
    
    public VistaPerder() {
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);
        pack();
        setSize(1000,700);
        setResizable(false);
        image = new ImagenGameOver();
        add(image);
    }

    public void setActionListener(ActionListener a) {
        botones.setActionListener(a);
    }

    class ImagenGameOver extends JPanel {

        private BufferedImage imagen;
        private String imagenFileName = "";
        private JButton b_jugar,b_salir,b_ranking;

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
        
        public ImagenGameOver(){
            this.setLayout(new FlowLayout());

            b_jugar = new JButton("Volver a jugar");
            b_ranking = new JButton("Ver Ranking");
            b_salir = new JButton("Salir");
            
            add(b_jugar);
            add(b_ranking);
            add(b_salir);
        }
        
    }
}
