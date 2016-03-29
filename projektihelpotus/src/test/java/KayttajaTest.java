/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import projektihelpotus.projektihelpotus.logiikka.Arpoja;
import projektihelpotus.projektihelpotus.logiikka.Kayttaja;

/**
 *
 * @author omistaja
 */
public class KayttajaTest {
    
    Arpoja arpoja;
    Kayttaja kayttaja;
    
    public KayttajaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        arpoja = new Arpoja();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void konstruktoriAsettaaKayttajanOikein() { // build ei valmis
        Kayttaja mealy = new Kayttaja();
        String vastaus = kayttaja.getKayttajaTunnus(); 
        assertEquals("mealy", vastaus.toString());
    }
       
    @Test
    public void konstruktoriAsettaaSalasananOikein() { // build ei valmis
        String salasana = "ananastenmaa";
        String vastaus = kayttaja.getSalasana(); 
        assertEquals("ananastenmaa", vastaus.toString());
    }
    
    @Test
    public void konstruktoriAsettaaRoolinOikein() { // build ei valmis
        String rooli = "OPISKELIJA";
        String vastaus = kayttaja.getRooli(); 
        assertEquals("OPISKELIJA", vastaus.toString());
    }
}
