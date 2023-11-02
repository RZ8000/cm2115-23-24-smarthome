package uk.ac.rgu.cm2115.devices;

public class Thermostat extends Device implements Adjustable{
    private int temp;

    
    private int temperature;

    public Thermostat(String name) {
        super(name);
        this.temperature = 10;
    }

    @Override
    public void turnUp(){
        System.out.println("Thermostat is turned up");
        this.temp++;  
    }

    @Override
    public void turnDown(){
        System.out.println("Thermostat is turned down");
        this.temp--;
    }

    public String getStatus() {
        return "Thermostat is" + this.temp; 
    }


}
