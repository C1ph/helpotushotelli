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
public class Kayttaja {

    private String tunnus;
    private String salasana;
    private Rooli rooli;


    public Kayttaja(String tunnus, String salasana) {
        this.tunnus = tunnus;
        this.salasana = salasana;
    }

    public Kayttaja(String tunnus, String salasana, Rooli rooli) {
        this.tunnus = tunnus;
        this.salasana = salasana;
        this.rooli = rooli;
    }
    
    public enum Rooli {
        
        OPISKELIJA {
    @Override
    public String toString() {        return "OPISKELIJA";    }}, 
        
        YLLAPITO {
    @Override
    public String toString() {        return "YLLAPITO";    }} };
    

    public String getKayttajaTunnus() {
        return tunnus;
    }

    public Enum getRooli() {
        return rooli;
    }

    public String getSalasana() {
        return salasana;
    }

    public void setKayttajaTunnus(String kayttajaTunnus) {
        this.tunnus = kayttajaTunnus;
    }

    public void setSalasana(String salasana) {
        this.salasana = salasana;
    }

    @Override
    public String toString() {
        return "" + this.getKayttajaTunnus() +" " + this.getSalasana() +" " +this.getRooli();
    }
   
}
