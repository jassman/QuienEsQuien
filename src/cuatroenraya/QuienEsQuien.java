/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatroenraya;

import CuatroRayaControlador.Controlador;
import CuatroRayaModelo.Modelo;
import CuatroRayaVista.VentanaPrincipal;
import CuatroRayaVista.VistaDificultad;
import CuatroRayaVista.VistaInicio;

/**
 *
 * @author Lucas
 */
public class QuienEsQuien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaPrincipal v = new VentanaPrincipal();
        VistaDificultad d = new VistaDificultad();
        VistaInicio inicio = new VistaInicio();
        Modelo m = new Modelo();
        Controlador c = new Controlador(m, v, inicio, d);
        inicio.setVisible(true);
        inicio.setSize(1000, 700);
        d.setVisible(false);
        d.setTitle("Dificultad");
        d.setSize(200, 300);
        v.setVisible(false);
        v.setSize(1200,800);
        v.setTitle("CUATRO EN RAYA");
    }
    
}
