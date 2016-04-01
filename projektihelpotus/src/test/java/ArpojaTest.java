/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import projektihelpotus.projektihelpotus.logiikka.Aihe;
import projektihelpotus.projektihelpotus.logiikka.Arpoja;
import projektihelpotus.projektihelpotus.logiikka.Kayttaja;

/**
 *
 * @author omistaja
 */
public class ArpojaTest {

    Aihe aihe;
    Kayttaja kayttaja;
    Arpoja arpoja;
    private Object aiheet;

    public ArpojaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        Aihe aihe = new Aihe();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void uudenAiheListanKokoAnnetaanOikein() {
        ArrayList<String> aiheet = new ArrayList<>();
        assertEquals(0, aiheet.size());
    }
    
    @Test
    public void uusiAiheLisataanListaanOikein() {
        ArrayList<String> aiheet = new ArrayList<>();
        aiheet.add("Mehiläistenhoito");
        assertEquals(1, aiheet.size());
    }
    
    @Test
    public void aihePoistetaanOikein() {
        ArrayList<String> aiheet = new ArrayList<>();
        aiheet.add("Mehiläistenhoito");
        aiheet.remove("Mehiläistenhoito");
        assertEquals(0, aiheet.size());
    }
    
    @Test
    public void konstruktoriAsettaaAiheenOikein() {
        String vastaus = arpoja.getAihe();
        assertEquals("", vastaus);
    }
    
    @Test
    public void uusiArpoja() {
        Arpoja arpoja = new Arpoja();
        assertEquals("", arpoja);
        
    }
}
