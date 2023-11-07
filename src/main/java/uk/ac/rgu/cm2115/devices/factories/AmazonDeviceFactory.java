package uk.ac.rgu.cm2115.devices.factories;

import uk.ac.rgu.cm2115.devices.Light;
import uk.ac.rgu.cm2115.devices.SmartPlug;
import uk.ac.rgu.cm2115.devices.SmartSpeaker;
import uk.ac.rgu.cm2115.devices.Thermostat;

public class AmazonDeviceFactory implements AbstractDeviceFactory{

    @Override
    public Light createLight(String name) {
        return new AmazonLight(name);
    }

    @Override
    public SmartPlug createSmartPlug(String name) {
        return new AmazonSmartPlug(name);
    }

    @Override
    public Thermostat createThermostat(String name) {
        return new AmazonThermostat(name);
    }

    @Override
    public SmartSpeaker createSmartSpeaker(String name) {
        return new AmazonSmartSpeaker(name);
    }

    @Override
    public String toString(){
        return "Amazon";
    }
    
}
