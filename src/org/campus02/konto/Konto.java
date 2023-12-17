package org.campus02.konto;

public class Konto
{
    private String inhaber;
    private double kontostand;

    public Konto(String inhaber)
    {
        this.inhaber = inhaber;
        kontostand=0;
    }

    public void einzahlen(double wert)
    {
        kontostand += wert;
    }

    public void auszahlen(double wert)
    {
        kontostand -= wert;
    }
    public double getKontostand()
    {
        return kontostand;
    }

    public void setKontostand(double kontostand)
    {
        this.kontostand = kontostand;
    }

    public String getInhaber()
    {
        return inhaber;
    }

    public void setInhaber(String inhaber)
    {
        this.inhaber = inhaber;
    }
}
