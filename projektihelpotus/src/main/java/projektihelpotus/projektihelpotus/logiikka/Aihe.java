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


import java.util.*;
/**
 * Aihe-luokka tukee mm. luokkia Tiedostonlukija ja Vaikeusaste
 *
 */
public class Aihe {

    private String aihe;
    
    public Aihe (String aihe) {
        this.aihe = aihe;
    }

    public String getAihe() {
        return aihe;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.aihe);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aihe other = (Aihe) obj;
        if (!Objects.equals(this.aihe, other.aihe)) {
            return false;
        }
        return true;
    }    
    
}
