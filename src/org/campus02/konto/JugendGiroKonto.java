package org.campus02.konto;

public class JugendGiroKonto extends GiroKonto
{
    private double buchungslimit;
    public JugendGiroKonto(String inhaber, double limit, double buchungslimit)
    {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
    }

    @Override
    public void einzahlen(double wert)
    {
        super.einzahlen(wert);
    }

    @Override
    public void auszahlen(double wert)
    {
        if(wert>buchungslimit)
        {
            System.out.println("Buchungslimit von " + buchungslimit + "€ überschritten.");
        }
        else
        {
            super.auszahlen(wert);
        }
    }
}
