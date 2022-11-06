package se1.hu3.factory;

public class CustomMonitor extends Monitor{
    public CustomMonitor(int frequenz, double groesse, int aufloesungBreite, int aufloesungHoehe) {
        super(frequenz, groesse, aufloesungBreite, aufloesungHoehe);
    }

    @Override
    public String defineType() {
        return "Sonderanfertigung";
    }
}
