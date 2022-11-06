package se1.hu3.adapter;

public class Kaffee implements Kaffeezubereitung {
    // kaffee machen
    @Override
    public void kaffeebohnenRoesten() {
        System.out.println("Bohnen werden geroestet");
    }

    @Override
    public void bohnenMahlen() {
        System.out.println("Bohnen werden gemahlen");
    }

    @Override
    public void wasserAufgiessen() {
        System.out.println("Wasser wird aufgegossen");
    }

    @Override
    public void kaffeeAusgeben() {
        System.out.println("Kaffee wird ausgegeben");
    }
}
