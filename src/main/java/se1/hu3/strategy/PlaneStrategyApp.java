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
    }
}

class Flugzeug {
    String startFlughafen;
    String zielFlughafen;

    public Flugzeug(String startFlughafen, String zielFlughafen) {
        this.startFlughafen = startFlughafen;
        this.zielFlughafen = zielFlughafen;
    }

    public void starten() {
        System.out.println("Taking off from " + startFlughafen);
    }

    public void landen() {
        System.out.println("Landung in " + zielFlughafen + " geglueckt");
    }
}

interface Strategy {
    public void steuern(double winkel);
}

class Starten implements Strategy {
    @Override
    public void steuern(double winkel) {
//        return winkel;
    }
}



