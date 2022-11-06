package se1.hu3.factory;

public class GamingMonitor extends Monitor {
    public GamingMonitor(int frequenz, double groesse, int aufloesungBreite, int aufloesungHoehe) {
        super(frequenz, groesse, aufloesungBreite, aufloesungHoehe);
    }

    @Override
    public String defineType() {
        return "Gaming Monitor";
    }
}
