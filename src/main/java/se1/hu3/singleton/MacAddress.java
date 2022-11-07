package se1.hu3.singleton;

import java.util.Random;

public class MacAddress {

    //create an object of SingleObject
    private static MacAddress instance = new MacAddress();

    //make the constructor private so that this class cannot be
    //instantiated
    private MacAddress() {
    }

    //Get the only object available
    public static MacAddress getInstance() {
        return instance;
    }

    //Quelle:
    synchronized public static void getMacAddress() {
        // aus dem internet kopiert, leider finde ich die quelle nicht mehr
        String[] Mac = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        Random rd = new Random();
        rd.nextInt(15);
        String result = "";

        for (int i = 0; i < 6; i++) {
            String a = Mac[rd.nextInt(15)];
            String b = Mac[rd.nextInt(15)];
            result += a + b;
            if (i < 5) {
                result += ":";
            }

        }
        System.out.println("New MAC-Address:" + result);
    }

}
