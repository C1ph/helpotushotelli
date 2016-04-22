/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektihelpotus.projektihelpotus.logiikka;


import java.util.*;
/**
 * Tämä luokka arpoo aiheen käyttäjälle
 * @author omistaja
 */
public class Arpoja {

    private ArrayList<Aihe> aiheet;

    public Arpoja() { // konstruktori       
        this.aiheet = new ArrayList<>();
    }

    /**
     * Arvo-metodi arpoo arraylististä aiheen
     * @return arvottu aihe
     */
    public Aihe arvo() { // metodi arpoo aiheen valmiiksi generoidusta ArrayListista
        Random arpoja = new Random();
        int i = arpoja.nextInt(aiheet.size());
        Aihe tulos = aiheet.get(i);
        return tulos;
    }
    /**
     * 
     * @param aihe 
     */
    public void lisaa(Aihe aihe) { // lisää aiheen
        this.aiheet.add(aihe);
    }
    
    public void poista(Aihe aihe) { // poistaa aiheen
        this.aiheet.remove(aihe);
    }

    public ArrayList<Aihe> getAiheet() { // palauttaa listan aiheista
        return aiheet;
    }
       
}


