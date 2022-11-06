package se1.hu3.factory;

public class ScreenFactoryApp {
    public static void main(String[] args) {

        Factory factory = new Factory();

        Monitor m1 = factory.getMonitor(30,  23.8, 1280, 1024);
        System.out.println(m1.defineType() + " wurde produziert und verkauft. ");

        Monitor m2 = factory.getMonitor(75, 23.8, 1920, 1024);
        System.out.println(m2.defineType() + " wurde produziert und verkauft. ");

        Monitor m3 = factory.getMonitor(55, 35, 1920, 2160);
        System.out.println(m3.defineType() + " wurde produziert und verkauft. ");

        Monitor m4 = factory.getMonitor(120, 35, 1920, 2160);
        System.out.println(m4.defineType() + " wurde produziert und verkauft. ");
    }
}
