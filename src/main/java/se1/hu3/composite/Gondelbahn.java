package se1.hu3.composite;


public class Gondelbahn extends Node {

    private double fahrgeschwindigkeit = 0;

    public Gondelbahn(String name) {
        super(name);
    }

    @Override
    public void startup() {
        System.out.println("\nDie Gondelbahn "+ getName() + " nimmt den Betrieb auf.");
        setFahrgeschwindigkeit(10);
    }

    @Override
    public void shutdown() {
        System.out.println("\nDie Gondelbahn "+ getName() + " stellt den Betrieb fuer heute ein.");
        setFahrgeschwindigkeit(0);

    }

    //Getter und Setter
    public double getFahrgeschwindigkeit() {
        return fahrgeschwindigkeit;
    }


    public void setFahrgeschwindigkeit(double fahrgeschwindigkeit) {
        this.fahrgeschwindigkeit = fahrgeschwindigkeit;
        System.out.println("Fahrgeschwindigkeit von " + getName() + " auf " + this.fahrgeschwindigkeit + " km/h geaendert.");
    }
}

