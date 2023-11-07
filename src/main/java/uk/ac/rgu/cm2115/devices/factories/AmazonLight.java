package uk.ac.rgu.cm2115.devices.factories;

import uk.ac.rgu.cm2115.devices.Light;

public class AmazonLight extends Light{

    public AmazonLight(String name) {
        super(name);
    }

    @Override
    public String getType(){
        return "Amazon light";
    }
    
}
