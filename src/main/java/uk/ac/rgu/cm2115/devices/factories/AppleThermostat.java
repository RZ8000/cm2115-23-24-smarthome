package uk.ac.rgu.cm2115.devices.factories;

import uk.ac.rgu.cm2115.devices.Thermostat;

public class AppleThermostat extends Thermostat{

    public AppleThermostat(String name) {
        super(name);
    }

    @Override
    public String getType(){
        return "Apple thermostat";
    }
    
}
