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

/**
 * Luokka tallentaa ja siirtää vaikeustasot.
 */
public class Vaikeusaste {
    
    private boolean helppo;
    private boolean keskivaikea;
    private boolean vaikea;
    private int vaikeusaste;
    
    /**
     * Luo vaikeustason ennalta määrätyillä arvoilla
     * @param vaikeusaste kokonaisluku 0, 1 tai 2, joista pienin on helpoin.
     */
    
    public void asetaVaikeustaso(int vaikeusaste) {
        this.vaikeusaste = vaikeusaste;
        if (vaikeusaste == 0) {
            asetaHelppo();
        } else if (vaikeusaste == 1) {
            asetaKeskivaikea();
        } else if (vaikeusaste == 2) {
            asetaVaikea();
        }
    }
    
    /**
     * Luo vaikeustason käyttäjän valinnoista
     * 
     * @param valinnat totuusarvotaulukko (helppo, keskivaikea, vaikea).
     */
    public void Vaikeusaste (int suurin, boolean[] valinnat) {
        vaikeusaste = 3;
        helppo = valinnat[0];
        keskivaikea = valinnat[1];
        vaikea = valinnat[2];
    }

    public int getVaikeusaste() {
        return vaikeusaste;
    }
    
    private void asetaHelppo() {
        helppo = true;
        keskivaikea = false;
        vaikea = false;
    }
    private void asetaKeskivaikea() {
        helppo = false;
        keskivaikea = true;
        vaikea = false;
    }
    private void asetaVaikea() {
        helppo = false;
        keskivaikea = false;
        vaikea = true;
    }
    
}