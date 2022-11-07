package se1.hu3.strategy;

public class Flugzeug {
    String startFlughafen;
    String zielFlughafen;

    public Flugzeug(String startFlughafen, String zielFlughafen) {
        this.startFlughafen = startFlughafen;
        this.zielFlughafen = zielFlughafen;
    }

    public void starten() {
        System.out.println("Abgehoben in " + startFlughafen);
    }

    public void landen() {
        System.out.println("Gelandet in " + zielFlughafen);
    }


}
