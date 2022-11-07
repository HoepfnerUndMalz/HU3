package se1.hu3.factory;

public abstract class Monitor {
    public int frequenz;
    public double groesse;
    public int aufloesungBreite;
    public int aufloesungHoehe;


    public Monitor(int frequenz, double groesse, int aufloesungBreite, int aufloesungHoehe){
        this.frequenz = frequenz;
        this.groesse = groesse;
        this.aufloesungBreite = aufloesungBreite;
        this.aufloesungHoehe = aufloesungHoehe;
    }

    public abstract String defineType();
}
