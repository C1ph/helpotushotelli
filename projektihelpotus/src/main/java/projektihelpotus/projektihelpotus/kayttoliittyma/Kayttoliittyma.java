package projektihelpotus.projektihelpotus.kayttoliittyma;

import java.io.FileNotFoundException;
import java.util.Scanner;
import projektihelpotus.projektihelpotus.logiikka.Arpoja;
import projektihelpotus.projektihelpotus.logiikka.Asetukset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author omistaja
 */
class Kayttoliittyma {

    private Scanner lukija;
    private Asetukset asetukset;
    private Arpoja arpoja;

    public Kayttoliittyma(Scanner lukija) throws FileNotFoundException {
        this.lukija = lukija;
        asetukset = new Asetukset();
    }
    
    public void kaynnista() {
        System.out.println("Tervetuloa aiheenarpojaan!");     
        
        while (true) {
            System.out.println("[1] Arvo aihe!, [x] Lopeta");
            System.out.print("Valitse toiminto: ");
            String komento = lukija.next();
            if (komento.equals("x")) {
                break;
            }
            if (komento.equals("1")) {
                arpoja.arvo();
            }
        }
    }
    
    
}
