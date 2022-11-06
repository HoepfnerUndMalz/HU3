package se1.hu3.factory;

public class OfficeMonitor extends Monitor {
    public OfficeMonitor(int frequenz, double groesse, int aufloesungBreite, int aufloesungHoehe) {
        super(frequenz, groesse, aufloesungBreite, aufloesungHoehe);
    }

    @Override
    public String defineType() {
        return "Office Monitor";
    }
}
