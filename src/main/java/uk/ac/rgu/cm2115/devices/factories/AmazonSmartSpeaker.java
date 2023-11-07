package uk.ac.rgu.cm2115.devices.factories;

import uk.ac.rgu.cm2115.devices.SmartSpeaker;

public class AmazonSmartSpeaker extends SmartSpeaker{

    public AmazonSmartSpeaker(String name) {
        super(name);
    }

    @Override
    public String getType(){
        return "Amazon smart speaker";
    }
    
}
