/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatroenraya;

import CuatroRayaControlador.Controlador;
import CuatroRayaModelo.Modelo;
import CuatroRayaVista.VentanaPrincipal;
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
        VistaInicio inicio = new VistaInicio();
        Modelo m = new Modelo();
        Controlador c = new Controlador(m, v, inicio);
        inicio.setVisible(true);
        inicio.setSize(1000, 700);
        v.setVisible(false);
        v.setSize(1200,800);
        v.setTitle("CUATRO EN RAYA");
    }
    
}
