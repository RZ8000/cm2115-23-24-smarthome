package uk.ac.rgu.cm2115.devices;

import uk.ac.rgu.cm2115.devices.diagnostics.DeviceVisitor;
import uk.ac.rgu.cm2115.devices.visitor.DeviceTypeVisitor;

public class SmartPlug extends Device implements Switchable {
    
    private boolean on;

    public SmartPlug(String name) {
        super(name);
        this.on = false;
    }

    public void switchOn(){
        System.out.println("Smart plug is switched on");
        this.on = true;
    }

    public void switchOff(){
        System.out.println("Smart plug is switched off");
        this.on = false;
    }

    @Override
    public String getStatus(){
        String status = "off";

        if(this.on){
            status = "on";
        }

        return this.name + " is " + status;
    }

    @Override
    public void accept(DeviceTypeVisitor visitor) {
        visitor.visit(this, this.name);
    }

    @Override
    public void accept(DeviceVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getType(){
        return "Generic smart plug";
    }
}
