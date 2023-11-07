package uk.ac.rgu.cm2115.devices.factories;

import uk.ac.rgu.cm2115.devices.Thermostat;

public class AmazonThermostat extends Thermostat{

    public AmazonThermostat(String name) {
        super(name);
    }

    @Override
    public String getType(){
        return "Amazon thermostat";
    }
    
}
