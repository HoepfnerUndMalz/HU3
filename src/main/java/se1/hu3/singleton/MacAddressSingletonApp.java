package se1.hu3.singleton;


public class MacAddressSingletonApp {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject newMacAddress = new SingleObject();

        //Get the only newMacAddress available
        MacAddress newMacAddress = MacAddress.getInstance();

        //show the message
        newMacAddress.getMacAddress();


    }

}

