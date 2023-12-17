package org.campus02.land;

public class Bundesland extends Land
{
    double bruttoSozialProdukt;

    public Bundesland(double bruttoSozialProdukt)
    {
        this.bruttoSozialProdukt = bruttoSozialProdukt;
    }
    @Override
    public double getBruttoSozialProdukt()
    {
        return this.bruttoSozialProdukt;
    }
}
