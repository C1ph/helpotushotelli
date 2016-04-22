package projektihelpotus.projektihelpotus.logiikka;

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
        aihe = new Aihe("testiaihe");
        arpoja = new Arpoja();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void arvontaMekanismiToimiiOikein () {
        arpoja.lisaa(aihe);
        arpoja.arvo();
        assertEquals(aihe, arpoja.arvo());
    }
    
    @Test
    public void uudenAiheListanKokoAnnetaanOikein() {
        ArrayList<String> aiheet = new ArrayList<>();
        assertEquals(0, aiheet.size());
    }
    
    @Test
    public void uusiAiheLisataanListaanOikein() {
        arpoja.lisaa(aihe);
        assertTrue(arpoja.getAiheet().contains(aihe));
    }
    
    @Test
    public void uusiAihePoistetaanListaltaOikein() {
        arpoja.lisaa(aihe);
        arpoja.poista(aihe);
        assertFalse(arpoja.getAiheet().contains(aihe));
    }
    
}
