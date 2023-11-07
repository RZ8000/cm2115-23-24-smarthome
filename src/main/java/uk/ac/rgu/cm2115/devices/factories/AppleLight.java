package uk.ac.rgu.cm2115.devices.factories;

import uk.ac.rgu.cm2115.devices.Light;

public class AppleLight extends Light {

    public AppleLight(String name) {
        super(name);
    }

    @Override
    public String getType(){
        return "Apple light";
    }
    
}
