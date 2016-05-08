package projektihelpotus.projektihelpotus.kayttoliittyma;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import projektihelpotus.projektihelpotus.logiikka.Arpoja;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Käyttöliittymä aiheenarpojalle.
 *
 * @author omistaja
 */
public class Kayttoliittyma {

    private Scanner lukija;
    private Arpoja arpoja;
    private ArrayList aiheLista;

    public Kayttoliittyma() throws FileNotFoundException { //konstruktori
        Scanner lukija = new Scanner(System.in);
        this.lukija = lukija;
    }

    public void kaynnista() {
        System.out.println("Tervetuloa aiheenarpojaan!");

        while (true) {
            System.out.println("[1] Arvo aihe!, [x] Lopeta");
            System.out.print("Valitse toiminto: ");
            String komento = lukija.next();
            if (komento.equals("x")) {
                break;
            }
            if (komento.equals("1")) {
                arpoja.arvo();
            }
        }
    }

    public void run() {
        JFrame frame = new JFrame("Aihelistaus");
        frame.setPreferredSize(new Dimension(1000, 500));
        luoKomponentit(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    public void luoKomponentit(Container container) {
        GridLayout layout = new GridLayout(2, 1);
        container.setLayout(layout);
        JPanel aiheLista = luoAiheLista();
        Component aiheListaus = new Component() {
        };
        JScrollPane scrolleriAiheille = new JScrollPane(aiheListaus);
        container.add(luoValikko());
    }

    private JPanel luoValikko() {
        JPanel valikko = new JPanel();
        valikko.setLayout(new BoxLayout(valikko, BoxLayout.X_AXIS));
        ArrayList<JButton> valinnat = new ArrayList<JButton>();
        valinnat.add(new JButton("Lisää aihe"));
        valinnat.add(new JButton("Poista aihe"));
        lisaaNappi(valikko, valinnat);
        return valikko;
    }

    private void lisaaNappi(JPanel valikko, ArrayList<JButton> valinnat) {
        for (JButton nappi : valinnat) {
            valikko.add(nappi);
        }
    }

    private JPanel luoAiheLista() {
        JPanel uusiAiheLista = new JPanel();
        uusiAiheLista.setLayout(new BoxLayout(uusiAiheLista, BoxLayout.Y_AXIS));
        uusiAiheLista.add(new JLabel("Aiheet: "));
        for (int i = 0; i < aiheLista.size(); i++) {
            String aihe = (String) aiheLista.get(i);
            JButton aiheNappi = new JButton(aihe);
            uusiAiheLista.add(aiheNappi);
        }
        return uusiAiheLista;
    }

    public ArrayList getNimi(ArrayList aiheLista) {
        return aiheLista;
    }

    JFrame getFrame(JFrame frame) {
        return frame;
    }

}
