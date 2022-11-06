package se1.hu3.composite;

public class Fahrbetriebsmittel extends Node {

    public Fahrbetriebsmittel(String name) {
        super(name);
    }


    @Override
    public void startup() {
        System.out.println("Die Gondel "+ getName() + ":"+ getId()+ " faehrt aus der Garage.");
    }

    @Override
    public void shutdown() {
        System.out.println("Die Gondel "+ getName() + ":"+ getId()+ " ist in die Garage gefahren.");
    }
}