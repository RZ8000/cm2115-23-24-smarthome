package uk.ac.rgu.cm2115.devices;

public class SmartPlug extends Device {
    
    public SmartPlug(String name) {
        super(name);
    }

    public void switchOn(){
        System.out.println("Smart plug is switched on");
    }

    public void swithOff(){
        System.out.println("Smart plug is switched off");
    }

}
