package org.campus02.app;

import org.campus02.land.Bundesland;
import org.campus02.land.Bundesstaat;

public class DemoLandApp
{
    public static void main(String[] args)
    {
        Bundesland st = new Bundesland(375.82);
        Bundesland k = new Bundesland(351.68);
        Bundesstaat oesterreich = new Bundesstaat();
        oesterreich.addLand(st);
        oesterreich.addLand(k);
        System.out.println(oesterreich.getBruttoSozialProdukt());
    }
}
