package se1.hu3.factory;

public class DesignMonitor extends Monitor {
    public DesignMonitor(int frequenz, double groesse, int aufloesungBreite, int aufloesungHoehe) {
        super(frequenz, groesse, aufloesungBreite, aufloesungHoehe);
    }

    @Override
    public String defineType() {
        return "Design & Art Monitor";
    }
}