package se1.hu3.singleton;


public class MacAddressSingletonApp {
    public static void main(String[] args) {

        MacAddress newMacAddress = MacAddress.getInstance();

        newMacAddress.getMacAddress();
    }
}

