package uk.ac.rgu.cm2115.devices.factories;

import uk.ac.rgu.cm2115.devices.SmartPlug;

public class AppleSmartPlug extends SmartPlug{

    public AppleSmartPlug(String name) {
        super(name);
    }

    @Override
    public String getType(){
        return "Apple smart plug";
    }
    
}
