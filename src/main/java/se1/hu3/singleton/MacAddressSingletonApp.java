package se1.hu3.singleton;

import java.util.Random;

public class MacAddressSingletonApp {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject newMacAdress = new SingleObject();

        //Get the only newMacAdress available
        MacAdress newMacAdress = MacAdress.getInstance();

        //show the message
        newMacAdress.getMacAdress();
    }

}

class MacAdress {

    //create an object of SingleObject
    private static MacAdress instance = new MacAdress();

    //make the constructor private so that this class cannot be
    //instantiated
    private MacAdress() {
    }

    //Get the only object available
    public static MacAdress getInstance() {
        return instance;
    }


    public static void getMacAdress() {
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
        System.out.println("New MAC-Adresse:" + result);
    }

}