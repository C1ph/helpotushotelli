/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektihelpotus.projektihelpotus.kayttoliittyma;

import java.awt.Dimension;
import java.io.FileNotFoundException;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
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
public class KayttoliittymaTest {

    private JFrame frame;
    private Object liittyma;

    public KayttoliittymaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws FileNotFoundException {
        Kayttoliittyma liittyma = new Kayttoliittyma();
        liittyma.run();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void kayttoLiittymanLuontiOnnistuu() {
        assertEquals(Kayttoliittyma.class, liittyma.getClass());
    }

    @Test
    public void ajaminenTapahtuuOikein() throws FileNotFoundException {
        System.out.println("aja");
        Kayttoliittyma tama = new Kayttoliittyma();
        tama.run();
    }

    @Test
    public void getFrameToimiiOikein() throws FileNotFoundException {
        Kayttoliittyma liittyma = new Kayttoliittyma();
        JFrame expResult = null;
        JFrame tulos = liittyma.getFrame(frame);
        assertEquals(expResult, tulos);
    }
}

