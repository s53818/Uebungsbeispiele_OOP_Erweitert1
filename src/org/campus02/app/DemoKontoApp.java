package org.campus02.app;

import org.campus02.konto.GiroKonto;
import org.campus02.konto.JugendGiroKonto;
import org.campus02.konto.Konto;
import org.campus02.konto.SparKonto;

public class DemoKontoApp
{
    public static void main(String[] args)
    {
        SparKonto sp = new SparKonto("sergio");
        sp.einzahlen(100);

        System.out.println(sp.getKontostand());
        sp.auszahlen(99.0);
        System.out.println(sp.getKontostand());
        sp.auszahlen(9.0);

        System.out.println("\nGirokonto");
        GiroKonto gk = new GiroKonto("Sergio", 1000);
        gk.einzahlen(1500);
        System.out.println(gk.getKontostand());
        gk.auszahlen(2000);
        System.out.println(gk.getKontostand());
        gk.auszahlen(500);
        System.out.println(gk.getKontostand());

        System.out.println("\nJugendgirokonto");
        JugendGiroKonto jgk = new JugendGiroKonto("Sergio", 500, 400);
        jgk.einzahlen(300);
        System.out.println(jgk.getKontostand());
        jgk.auszahlen(500);
        System.out.println(jgk.getKontostand());
        jgk.auszahlen(300);
        System.out.println(jgk.getKontostand());
        jgk.auszahlen(400);
        jgk.auszahlen(400);

        System.out.println("\nCasting");
        JugendGiroKonto jgkCast = new JugendGiroKonto("Casting", 300, 400);
        Konto kCast = jgkCast;
        kCast.einzahlen(100);
        System.out.println(kCast.getKontostand());
        kCast.auszahlen(500);
        System.out.println(kCast.getKontostand());
        System.out.println();
        GiroKonto gkCast = (JugendGiroKonto) kCast;
        gkCast.einzahlen(200);
        System.out.println(gkCast.getKontostand());
        gkCast.auszahlen(400);
        gkCast.auszahlen(500);
    }
}
