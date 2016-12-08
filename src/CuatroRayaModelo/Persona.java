/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaModelo;

/**
 *
 * @author Lucas
 */
public class Persona {
    private boolean bigote, sombrero, gafas;
    private String sexo, pelo, ojos, nariz, boca, nombre;
    public Persona(String nombre, String sexo, String pelo, String ojos, String nariz, String boca, boolean gafas, boolean sombrero, boolean bigote){
        
        this.nombre = nombre;
        this.sexo = sexo;
        this.pelo = pelo;
        this.ojos = ojos;
        this.nariz = nariz;
        this.boca = boca;
        this.bigote = bigote;
        this.sombrero = sombrero;
        this.gafas = gafas;
    }

    public boolean getBigote() {
        return bigote;
    }

    public boolean getSombrero() {
        return sombrero;
    }

    public boolean getGafas() {
        return gafas;
    }

    public String getSexo() {
        return sexo;
    }

    public String getPelo() {
        return pelo;
    }

    public String getOjos() {
        return ojos;
    }

    public String getNariz() {
        return nariz;
    }

    public String getBoca() {
        return boca;
    }

    public String getNombre() {
        return nombre;
    }
    
}
