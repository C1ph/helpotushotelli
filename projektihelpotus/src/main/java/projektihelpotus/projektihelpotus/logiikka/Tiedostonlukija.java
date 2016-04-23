/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektihelpotus.projektihelpotus.logiikka;

/**
 *
 * @author annettek
 */
// lukee tiedoston ja hakee aiheet

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Tiedostonlukija {

    public Tiedostonlukija() {

    }

    /**
     *
     * @param tiedosto tulostettava tiedosto
     * @return tiedoston sisältö stringiin talletettuna.
     *
     */
    public String tulostaTiedosto(File tiedosto) throws FileNotFoundException {
        Scanner lukija = new Scanner(tiedosto);
        String aihelista = "";

        while (lukija.hasNextLine()) {
            aihelista += lukija.nextLine();
        }
        lukija.close();

        return aihelista;
    }

    /**
     *
     * @param tiedosto Tiedosto josta aihe etsitään.
     * @param aihe Aihe jota haetaan.
     * @return true jos aihe löytyi, false jos ei löytynyt.
     *
     */
    public boolean onkoAiheVarastossa(String aihe, File tiedosto) throws FileNotFoundException {
        Scanner lukija = new Scanner(tiedosto);

        while (lukija.hasNextLine()) {
            String rivi = lukija.nextLine();

            if (rivi.equals(aihe)) {
                return true;
            }
        }

        lukija.close();

        return false;
    }

    /**
     *
     * @param tiedosto Tiedosto jonka sisältö muutetaan listaksi.
     * @return ArrayList.
     *
     *
     */
    public ArrayList<String> luoLista(File tiedosto) throws FileNotFoundException {
        Scanner lukija = new Scanner(tiedosto);
        ArrayList<String> lista = new ArrayList();

        while (lukija.hasNextLine()) {
            String rivi = lukija.nextLine();
            lista.add(rivi);
        }

        lukija.close();

        return lista;

    }
}
