package uk.ac.rgu.cm2115.devices.factories;

import uk.ac.rgu.cm2115.devices.Light;
import uk.ac.rgu.cm2115.devices.SmartPlug;
import uk.ac.rgu.cm2115.devices.SmartSpeaker;
import uk.ac.rgu.cm2115.devices.Thermostat;

public interface AbstractDeviceFactory {
    public Light createLight(String name);
    public SmartPlug createSmartPlug(String name);
    public Thermostat createThermostat(String name);
    public SmartSpeaker createSmartSpeaker(String name);
}
