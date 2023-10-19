package uk.ac.rgu.cm2115.devices;

public class Thermostat extends Device implements Adjustable{
    
    private int temperature;

    public Thermostat(String name) {
        super(name);
        this.temperature = 10;
    }

    @Override
    public void turnUp(){
        System.out.println("Thermostat is turned up");
        this.temperature++;
    }

    @Override
    public void turnDown(){
        System.out.println("Thermostat is turned down");
        this.temperature--;
        // could also include code here to stop the thermostat going below a certain level
    }

    @Override
    public String getStatus(){
        return this.name + " is set to temperature " + this.temperature;
    }
}
