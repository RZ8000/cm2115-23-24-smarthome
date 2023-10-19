package uk.ac.rgu.cm2115.commands;

import uk.ac.rgu.cm2115.devices.Switchable;

public class SwitchOffCommand implements Command {

    private Switchable device;

    public SwitchOffCommand(Switchable device){
        this.device = device;
    }

    @Override
    public void execute() {
        this.device.switchOff();
    }

    @Override
    public String toString(){
        return "Switch off " + this.device;
    }
    
}
