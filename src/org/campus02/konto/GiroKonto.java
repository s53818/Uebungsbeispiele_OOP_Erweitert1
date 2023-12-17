package org.campus02.konto;

public class GiroKonto extends Konto
{
    private double limit;

    public GiroKonto(String inhaber, double limit)
    {
        super(inhaber);
        this.limit = limit;
    }

    @Override
    public void einzahlen(double wert)
    {
        super.einzahlen(wert);
    }

    @Override
    public void auszahlen(double wert)
    {
        if((getKontostand()-wert)<(limit*-1))
        {
            System.out.println("Limit von "+ limit +"€ überschritten");
        }
        else
        {
            super.auszahlen(wert);
        }
    }
}
