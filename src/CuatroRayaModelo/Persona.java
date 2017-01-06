package CuatroRayaModelo;

/**
 *
 * @author Javier Alonso y Lucas Nicolini
 */
public class Persona {
    
    private final boolean bigote, sombrero, gafas;
    private final String sexo, pelo, ojos, nariz, boca, nombre;
    
    public Persona(
            String nombre, 
            String sexo, 
            String pelo, 
            String ojos, 
            String nariz, 
            String boca, 
            boolean gafas, 
            boolean sombrero, 
            boolean bigote){
        
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
    
    /**
     * @return Funcion que devuelve el valor del bigote
     */
    public boolean getBigote() {
        return bigote;
    }
    
    /**
     * @return Funcion que devuelve el valor del sombrero
     */
    public boolean getSombrero() {
        return sombrero;
    }
    
    /**
     * @return Funcion que devuelve el valor de las gafas
     */
    public boolean getGafas() {
        return gafas;
    }
    
    /**
     * @return Funcion que devuelve el valor del sexo
     */
    public String getSexo() {
        return sexo;
    }
    
    /**
     * @return Funcion que devuelve el valor del pelo
     */
    public String getPelo() {
        return pelo;
    }
    
    /**
     * @return Funcion que devuelve el valor de los ojos
     */
    public String getOjos() {
        return ojos;
    }
    
    /**
     * @return Funcion que devuelve el valor de la nariz
     */
    public String getNariz() {
        return nariz;
    }
    
    /**
     * @return Funcion que devuelve el valor de la boca
     */
    public String getBoca() {
        return boca;
    }
    
    /**
     * @return Funcion que devuelve el valor del nombre
     */
    public String getNombre() {
        return nombre;
    }
    
}
