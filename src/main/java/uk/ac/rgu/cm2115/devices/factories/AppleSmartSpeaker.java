package uk.ac.rgu.cm2115.devices.factories;

import uk.ac.rgu.cm2115.devices.SmartSpeaker;

public class AppleSmartSpeaker extends SmartSpeaker{

    public AppleSmartSpeaker(String name) {
        super(name);
    }

    @Override
    public String getType(){
        return "Apple smart speaker";
    }
    
}
