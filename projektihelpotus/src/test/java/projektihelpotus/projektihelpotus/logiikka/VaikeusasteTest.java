/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektihelpotus.projektihelpotus.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author omistaja
 */
public class VaikeusasteTest {
    
    public VaikeusasteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void asetetaanOikeinHelppo() {
        aihe.asetaHelppo();
        assertEquals(Vaikeusaste.helppo, aihe.asetaVaikeustaso(0));
    }

    @Test
    public void asetetaanOikeinKeskivaikea() {
        aihe.asetaKeskivaikea();
        assertEquals(Vaikeusaste.keskivaikea, aihe.asetaVaikeustaso(1));
    }

    @Test
    public void asetetaanOikeinVaikea() {
        aihe.asetaVaikea();
        assertEquals(Vaikeusaste.vaikea, aihe.asetaVaikeustaso(2));
    }
}
