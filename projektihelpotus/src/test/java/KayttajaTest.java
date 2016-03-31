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
        kayttaja = new Kayttaja("ipi", "rumils", "pasunisti");
        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void konstruktoriAsettaaKayttajanOikein() {
        String vastaus = kayttaja.getKayttajaTunnus(); 
        assertEquals("ipi", vastaus);
    }
    
    @Test
    public void konstruktoriAsettaaSalasananOikein() {
        String vastaus = kayttaja.getSalasana(); 
        assertEquals("rumils", vastaus);
    }
    
    @Test
    public void konstruktoriAsettaaRoolinOikein() {
        String rooli = "pasunisti";
        String vastaus = kayttaja.getRooli(); 
        assertEquals("pasunisti", vastaus);
    }
}
