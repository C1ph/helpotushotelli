/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektihelpotus.projektihelpotus.logiikka;

import java.util.Scanner;

/**
 *
 * @author annettek
 */
/**
 * Logiikka-luokka lukee aiheet.
 *
 */
public class Logiikka {

    private Scanner lukija;
    private Scanner intLukija;

    public Logiikka() {
        this.lukija = new Scanner(System.in);
    }

    /** Tulostaa tiedustellun aiheen ja tallentaa vastauksen
    * @param aihekysely
    * @return vstaus
    */
    public String kysyAihetta(String aihekysely){
        String vastaus;
        System.out.println(aihekysely);
        vastaus = lukija.nextLine();
        return vastaus;
    }
    
    /**
     * Tulostaa aihetiedustelun ja ottaa talteen käyttäjän vastauksen (vain indeksin omaavat aiheet)
     * @param aihekysely
     * @return indeksiluku
     */
    public int kysyAiheenNumeroa(String aihekysely){
        int indeksiluku;
        System.out.println(aihekysely);
        while(!intLukija.hasNextInt()){
            System.out.println("Vain numero käy! Kokeile uudestaan.");
            intLukija.next();
        }
        indeksiluku = intLukija.nextInt();
        return indeksiluku;
    }
}
