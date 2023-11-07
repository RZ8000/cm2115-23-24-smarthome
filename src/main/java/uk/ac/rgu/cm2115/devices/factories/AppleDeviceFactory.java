package uk.ac.rgu.cm2115.devices.factories;

import uk.ac.rgu.cm2115.devices.Light;
import uk.ac.rgu.cm2115.devices.SmartPlug;
import uk.ac.rgu.cm2115.devices.SmartSpeaker;
import uk.ac.rgu.cm2115.devices.Thermostat;

public class AppleDeviceFactory implements AbstractDeviceFactory{

    @Override
    public Light createLight(String name) {
        return new AppleLight(name);
    }

    @Override
    public SmartPlug createSmartPlug(String name) {
        return new AppleSmartPlug(name);
    }

    @Override
    public Thermostat createThermostat(String name) {
        return new AppleThermostat(name);
    }

    @Override
    public SmartSpeaker createSmartSpeaker(String name) {
        return new AppleSmartSpeaker(name);
    }    

    @Override
    public String toString(){
        return "Apple";
    }
}
