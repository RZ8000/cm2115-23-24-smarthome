package uk.ac.rgu.cm2115.devices;

public class Thermostat extends Device{
    private int temp;

    
    public Thermostat(String name) {
        super(name);
    }

    public void turnUp(){
        System.out.println("Thermostat is turned up");
        this.temp++;  
    }

    public void turnDown(){
        System.out.println("Thermostat is turned down");
        this.temp--;
    }

    public String getStatus() {
        return "Thermostat is" + this.temp; 
    }


}
