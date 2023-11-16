package uk.ac.rgu.cm2115.devices;

import uk.ac.rgu.cm2115.devices.diagnostics.DeviceVisitor;
import uk.ac.rgu.cm2115.devices.visitor.DeviceTypeVisitor;

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

<<<<<<< HEAD
    @Override
    public void accept(DeviceTypeVisitor visitor) {
        visitor.visit(this, this.name);
    }

    @Override
    public void accept(DeviceVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getType(){
        return "Generic thermostat";
    }
=======

>>>>>>> de014216fcd3c36e5d72e9479cfe688c23505302
}
