package se1.hu3.strategy;

public class PlaneStrategyApp {
    public static void main(String[] args) {

        Flugzeug flugzeug = new Flugzeug("Innsbruck", "Wien");


        Context context = new Context(new LenkenBoden());
        context.executeStrategy(10);

        flugzeug.starten();

        context = new Context(new LenkenLuft());
        context.executeStrategy(10);

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

class LenkenBoden implements Strategy {
    @Override
    public void steuern(double winkel) {
        System.out.println("Flugezeug am Boden um " + winkel + " gelenkt");
    }
}

class LenkenLuft implements Strategy {
    @Override
    public void steuern(double winkel) {
        System.out.println("Flugzeug Kursaenderung um " + winkel);
    }
}

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(double winkel) {
        strategy.steuern(winkel);
    }

}