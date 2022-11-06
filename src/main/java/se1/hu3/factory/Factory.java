package se1.hu3.factory;

public class Factory {

    public Monitor getMonitor(int frequenz, double groesse, int aufloesungBreite, int aufloesungHoehe) {

        Monitor m = null;

        if (30 <= frequenz && frequenz <= 50 && 23.8 <= groesse && groesse <= 27.0 && 1280 <= aufloesungBreite && aufloesungBreite <= 1920 && 1024 <= aufloesungHoehe && aufloesungHoehe <= 1200) {
            m = new OfficeMonitor(frequenz, groesse, aufloesungBreite, aufloesungHoehe);
            return m;
        } else if (75 <= frequenz && frequenz <= 240 && 23.8 <= groesse && groesse <= 28 && 1920 <= aufloesungBreite && aufloesungBreite <= 2560 && 1024 <= aufloesungHoehe && aufloesungHoehe <= 1440) {
            m = new GamingMonitor(frequenz, groesse, aufloesungBreite, aufloesungHoehe);
            return m;
        } else if (55 <= frequenz && frequenz <= 90 && groesse >= 31.5 && 1920 <= aufloesungBreite && aufloesungBreite <= 3840 && 1200 <= aufloesungHoehe && aufloesungHoehe <= 2160) {
            m = new DesignMonitor(frequenz, groesse, aufloesungBreite, aufloesungHoehe);
            return m;
        } else {
            m = new CustomMonitor(frequenz, groesse, aufloesungBreite, aufloesungHoehe);
       }
        return m;
    }
}

