package se1.hu3.adapter;

public class Automat {

    private Kaffeezubereitung automatenKaffee;

    public Automat(Kaffeezubereitung automatenKaffee) {
        this.automatenKaffee = automatenKaffee;
    }

    public void zubereitung() {

        automatenKaffee.kaffeebohnenRoesten();
        automatenKaffee.bohnenMahlen();
        automatenKaffee.wasserAufgiessen();
        automatenKaffee.kaffeeAusgeben();
        System.out.println("Getränk ist fertig!");
        System.out.println("");
    }
}
