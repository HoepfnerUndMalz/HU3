package se1.hu3.strategy;

public class PlaneStrategyApp {
    public static void main(String[] args) {

        Flugzeug flugzeug = new Flugzeug("Innsbruck", "Wien");
        Strategy luft = new SteuernLuft();
        Strategy boden = new SteuernBoden();

        Strategy steuern = boden;
        steuern.steuern(20.03);

        flugzeug.starten();
        steuern = luft;
        steuern.steuern(10.03);

        flugzeug.landen();
        steuern = boden;
        steuern.steuern(15.80);

    }
}




