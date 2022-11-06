package se1.hu3.composite;

public class LiftCompositeApp {

    public static void main(String args[]) {

        Skigebiet stubaierGletscher = new Skigebiet("Stubaier Gletscher");

        Gondelbahn eisgratbahn = new Gondelbahn("Eisgratbahn");
        for(int i=0; i< 4; i++) {
            Fahrbetriebsmittel gondelEGB = new Fahrbetriebsmittel("Gondel EGB");
            eisgratbahn.addNode(gondelEGB);
        }
        stubaierGletscher.addNode(eisgratbahn);

        Gondelbahn schaufeljochbahn = new Gondelbahn("Schaufeljochbahn");
        for(int i=0; i< 4; i++) {
            Fahrbetriebsmittel gondelSJB = new Fahrbetriebsmittel("Gondel SJB");
            schaufeljochbahn.addNode(gondelSJB);
        }
        stubaierGletscher.addNode(schaufeljochbahn);

        stubaierGletscher.startupAll();
        System.out.println("\nStarker Wind kommt auf.");

        eisgratbahn.setFahrgeschwindigkeit(5);
        schaufeljochbahn.setFahrgeschwindigkeit(4);

        System.out.println("\nEs ist Abend.");
        stubaierGletscher.shutdownAll();
    }
}
