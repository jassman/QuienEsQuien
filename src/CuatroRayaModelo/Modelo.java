/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaModelo;

import CuatroRayaVista.VentanaPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Modelo {

    private Persona personas[] = new Persona[24];
    private int i_sospechoso, puntosIniciales, puntosRestar;
    private Persona sospechoso;
    boolean partida;

    /*
     ¡¡¡¡¡¡¡FALTA CAMBIAR EL COLOR DE LOS OJOS!!!!!!!
     */
    public Modelo() {

        partida = true;
        personas[0] = new Persona("Alex", "Chico", "Negro", "Marrones", "Pequeña", "Grande", false, false, true);
        personas[1] = new Persona("Alfred", "Chico", "Pelirrojo", "Marrones", "Pequeña", "Pequeña", false, false, true);
        personas[2] = new Persona("Anita", "Chica", "Rubio", "Marrones", "Pequeña", "Pequeña", false, false, false);
        personas[3] = new Persona("Anne", "Chica", "Negro", "Marrones", "Mediana", "Pequeña", false, false, false);
        personas[4] = new Persona("Bernard", "Chico", "Moreno", "Marrones", "Grande", "Mediana", false, true, false);
        personas[5] = new Persona("Bill", "Chico", "Calvo", "Marrones", "Pequeña", "Mediana", false, false, false);
        personas[6] = new Persona("Charles", "Chico", "Rubio", "Marrones", "Pequeña", "Grande", false, false, true);
        personas[7] = new Persona("Claire", "Chica", "Negro", "Marrones", "Pequeña", "Pequeña", true, true, false);
        personas[8] = new Persona("David", "Chico", "Rubio", "Marrones", "Pequeña", "Mediana", false, false, false);
        personas[9] = new Persona("Eric", "Chico", "Rubio", "Marrones", "Pequeña", "Grande", false, true, false);
        personas[10] = new Persona("Frans", "Chico", "Pelirrojo", "Marrones", "Pequeña", "Pequeña", false, false, false);
        personas[11] = new Persona("George", "Chico", "Canoso", "Marrones", "Pequeña", "Mediana", false, true, false);
        personas[12] = new Persona("Herman", "Chico", "Calvo", "Marrones", "Grande", "Mediana", false, false, false);
        personas[13] = new Persona("Joe", "Chico", "Rubio", "Marrones", "Mediana", "Pequeña", true, false, false);
        personas[14] = new Persona("Maria", "Chica", "Moreno", "Marrones", "Pequeña", "Mediana", false, false, false);
        personas[15] = new Persona("Max", "Chico", "Negro", "Marrones", "Grande", "Grande", false, false, true);
        personas[16] = new Persona("Paul", "Chico", "Canoso", "Marrones", "Pequeña", "Mediana", true, false, false);
        personas[17] = new Persona("Peter", "Chico", "Canoso", "Marrones", "Grande", "Grande", false, false, false);
        personas[18] = new Persona("Philip", "Chico", "Negro", "Marrones", "Pequeña", "Mediana", false, false, false);
        personas[19] = new Persona("Richard", "Chico", "Calvo", "Marrones", "Pequeña", "Mediana", false, false, true);
        personas[20] = new Persona("Robert", "Chico", "Castanyo", "Marrones", "Grande", "Grande", false, false, false);
        personas[21] = new Persona("Sam", "Chico", "Calvo", "Marrones", "Pequeña", "Pequeña", true, false, false);
        personas[22] = new Persona("Susan", "Chica", "Canoso", "Marrones", "Pequeña", "Grande", false, false, false);
        personas[23] = new Persona("Tom", "Chico", "Calvo", "Marrones", "Mediana", "Pequeña", true, false, false);

        i_sospechoso = (int) (Math.random() * 23);

        sospechoso = personas[i_sospechoso];

        System.out.println(sospechoso.getSexo());
        System.out.println(sospechoso.getPelo());
        System.out.println(sospechoso.getOjos());
        System.out.println(sospechoso.getNariz());
        System.out.println(sospechoso.getBoca());
        System.out.println(sospechoso.getGafas());
        System.out.println(sospechoso.getSombrero());
        System.out.println(sospechoso.getBigote());
    }

    public void Comprobar(String s) {
        if (s.equalsIgnoreCase(sospechoso.getNombre())) {
            System.out.println("HAS ACERTADO! GANASTE");
        } else {
            System.out.println("FALLASTE! PERDISTE");
        }

        partida = false;
    }

    public int[] eliminar(String tipo, String s) {
        int a[] = new int[24];
        int j = 0;
        Boolean sBoleano = false;
        switch (tipo) {
            case "sexo":
                for (int i = 0; i < 24; i++) {
                    if (s.equalsIgnoreCase(personas[i].getSexo()) && (i != i_sospechoso)) {
                        a[j] = i;
                        j++;
                    }
                }
                break;

            case "pelo":
                for (int i = 0; i < 24; i++) {
                    if (s.equalsIgnoreCase(personas[i].getPelo())&& (i != i_sospechoso)) {
                        a[j] = i;
                        j++;
                    }
                }
                break;

            case "ojos":
                for (int i = 0; i < 24; i++) {
                    if (s.equalsIgnoreCase(personas[i].getOjos())&& (i != i_sospechoso)) {
                        a[j] = i;
                        j++;
                    }
                }
                break;
                
            case "boca":
                for (int i = 0; i < 24; i++) {
                    if (s.equalsIgnoreCase(personas[i].getBoca())&& (i != i_sospechoso)) {
                        a[j] = i;
                        j++;
                    }
                }
                break;
                
            case "nariz":
                for (int i = 0; i < 24; i++) {
                    if (s.equalsIgnoreCase(personas[i].getNariz())&& (i != i_sospechoso)) {
                        a[j] = i;
                        j++;
                    }
                }
                break;
                
            case "gafas":
                if(s.equalsIgnoreCase("SiGafas")){
                    sBoleano = true;
                }
                for (int i = 0; i < 24; i++) {
                    if (sBoleano == (personas[i].getGafas()) && (personas[i] != personas[i_sospechoso])) {
                        a[j] = i;
                        j++;
                    }
                }
                break;
                
            case "sombrero":
                if(s.equalsIgnoreCase("SiSombrero")){
                    sBoleano = true;
                }
                for (int i = 0; i < 24; i++) {
                    if (sBoleano == (personas[i].getSombrero()) && (personas[i] != personas[i_sospechoso])) {
                        a[j] = i;
                        j++;
                    }
                }
                break;
                
            case "bigote":
                if(s.equalsIgnoreCase("SiBigote")){
                    sBoleano = true;
                }
                for (int i = 0; i < 24; i++) {
                    if (sBoleano == (personas[i].getBigote()) && (personas[i] != personas[i_sospechoso])) {
                        a[j] = i;
                        j++;
                    }
                }
                break;
                
                
        }
        
        int z[] = new int[j];
        for(int y=0; y<j; y++){
            z[y] = a[y];
        }
        
        return z;
    }

    public boolean getPartida() {
        return partida;
    }
    
    public void partidaFacil(){
        puntosIniciales = 20;
        puntosRestar = 1;
    }
    
    public void partidaMedia(){
        puntosIniciales = 20;
        puntosRestar = 3;
    }
    
    public void partidaDificil(){
        puntosIniciales = 20;
        puntosRestar = 1;
    }
    
    public int restarPuntos(){
        puntosIniciales = puntosIniciales - puntosRestar;
        
        return puntosIniciales;
    }
    
    public void partidaPersonalizada(){
        puntosIniciales = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de puntos con los que quieres empezar " ));
        puntosRestar = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de puntos que quieres que reste cada pregunta " ));
    }
    
    public int getPuntos(){
        return puntosIniciales;
    }

}
