package se1.hu3.strategy;

public class SteuernLuft implements Strategy {
    @Override
    public void steuern(double winkel) {
        System.out.println("Kursaenderung im Flug um " + winkel);
    }
}
