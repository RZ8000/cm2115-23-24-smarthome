package uk.ac.rgu.cm2115.devices.factories;

import uk.ac.rgu.cm2115.devices.SmartPlug;

public class AmazonSmartPlug extends SmartPlug{

    public AmazonSmartPlug(String name) {
        super(name);
    }

    @Override
    public String getType(){
        return "Amazon smart plug";
    }
    
}
