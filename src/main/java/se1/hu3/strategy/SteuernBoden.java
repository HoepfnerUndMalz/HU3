package se1.hu3.strategy;

public class SteuernBoden implements Strategy {
    @Override
    public void steuern(double winkel) {
        System.out.println("Bugfahrwerk am Boden gelenkt um " + winkel);
    }
}
