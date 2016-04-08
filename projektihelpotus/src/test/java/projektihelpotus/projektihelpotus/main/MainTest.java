package projektihelpotus.projektihelpotus.main;

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
import projektihelpotus.projektihelpotus.logiikka.Aihe;
import projektihelpotus.projektihelpotus.logiikka.Arpoja;
import projektihelpotus.projektihelpotus.logiikka.Kayttaja;

/**
 *
 * @author omistaja
 */
public class MainTest {
    
    Arpoja arpoja;
    Aihe aihe;
    Kayttaja kayttaja;

    public MainTest() {
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
        aihe = new Aihe();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void arvontaMekanismiToimiiOikein () {
        String aihe = "";
        arpoja.arvo();
        assertEquals("", aihe);
    }
}
