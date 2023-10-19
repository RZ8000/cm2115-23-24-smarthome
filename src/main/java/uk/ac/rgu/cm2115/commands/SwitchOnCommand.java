package uk.ac.rgu.cm2115.commands;

import uk.ac.rgu.cm2115.devices.Switchable;

public class SwitchOnCommand implements Command{

    private Switchable device;

    public SwitchOnCommand(Switchable device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.switchOn();
    }

    @Override
    public String toString(){
        return "Switch on " + this.device;
    }
    
}
