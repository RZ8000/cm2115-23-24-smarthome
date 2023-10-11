package uk.ac.rgu.cm2115.devices;

public class Thermostat extends Device{
    
    public Thermostat(String name) {
        super(name);
    }

    public void turnUp(){
        System.out.println("Thermostat is turned up");
    }

    public void turnDown(){
        System.out.println("Thermostat is turned down");
    }
}
