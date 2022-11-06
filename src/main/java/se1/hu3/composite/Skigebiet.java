package se1.hu3.composite;

public class Skigebiet extends Node {

    public Skigebiet(String name) {
        super(name);
    }

    @Override
    public void startup() {
        System.out.println("Das Skigebiet "+ getName() + " startet in den Tag.");
    }

    @Override
    public void shutdown() {
        System.out.println("Das Skigebiet "+ getName() + " schliesst fuer heute.");
    }

}

