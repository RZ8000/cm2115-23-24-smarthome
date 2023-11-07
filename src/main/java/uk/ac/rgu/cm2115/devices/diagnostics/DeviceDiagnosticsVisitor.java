package uk.ac.rgu.cm2115.devices.diagnostics;

import uk.ac.rgu.cm2115.devices.Light;
import uk.ac.rgu.cm2115.devices.SmartPlug;
import uk.ac.rgu.cm2115.devices.SmartSpeaker;
import uk.ac.rgu.cm2115.devices.Thermostat;

public class DeviceDiagnosticsVisitor implements DeviceVisitor{

    @Override
    public void visit(Light light) {
        System.out.println();
        System.out.println("==Running diagnostic on light==");
        light.switchOn();
        light.dimUp();
        light.dimDown();
        light.switchOff();
    }

    @Override
    public void visit(SmartPlug plug) {
        System.out.println();
        System.out.println("==Running diagnostics on smart plug==");
        plug.switchOn();
        plug.switchOff();
    }

    @Override
    public void visit(Thermostat thermostat) {
        System.out.println();
        System.out.println("==Running diagnostics on thermostat==");
        thermostat.turnUp();
        thermostat.turnDown();
    }

    @Override
    public void visit(SmartSpeaker speaker) {
        System.out.println();
        System.out.println("==Running diagnostics on smart speaker==");
        speaker.play();
        speaker.turnUp();
        speaker.turnDown();
        speaker.stop();
    }
    
}
