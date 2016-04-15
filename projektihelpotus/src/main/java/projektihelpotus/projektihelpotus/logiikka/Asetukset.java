/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektihelpotus.projektihelpotus.logiikka;

/**
 *
 * @author omistaja
 */
public class Asetukset {
    
    private static final Asetukset asetus = new Asetukset();
    private static String aihepiiri;
    
    public static Asetukset getAsetus() {
        return asetus;
    }
    
    public static String getAihepiiri() {
        return aihepiiri;
    }
}
