/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektihelpotus.projektihelpotus;

/**
 *
 * @author omistaja
 */
import java.util.*;

public class Arpoja {
    
    private Random random;
    private String aihe;
    
    public String arvoAihe () {
        return aihe;
    }
    
    public static void main(String[] args) {
        Random arpoja = new Random();
        int i = 0;
        
        ArrayList<String> aiheet = new ArrayList<>();
        Collections.addAll(aiheet, "fraktaaligeneraattori", "drinkkikone", "DNA-ketjujen tutkija", "Tetris", "Space Invaders");
        
        System.out.println("Kohtalosi on tämä: ");
        for (String aihe : aiheet) {
            String lopullinenAihe = "aihe"; // tänne tehtailen parhaillaan itse arvontamekanismia
            
            System.out.println(lopullinenAihe);
        }
    }
}