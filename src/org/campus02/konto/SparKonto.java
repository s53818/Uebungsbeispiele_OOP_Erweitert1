package org.campus02.konto;

public class SparKonto extends Konto
{
    public SparKonto(String inhaber)
    {
        super(inhaber);
    }

    @Override
    public void einzahlen(double wert)
    {
        super.einzahlen(wert);
    }

    @Override
    public void auszahlen(double wert)
    {
        if((getKontostand()-wert)<0)
        {
            System.out.println("Keine Auszhalung möglich");
        }
        else
        {
            super.auszahlen(wert);
        }
    }
}
