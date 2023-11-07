package uk.ac.rgu.cm2115.devices;

import uk.ac.rgu.cm2115.devices.diagnostics.DeviceVisitor;
import uk.ac.rgu.cm2115.devices.visitor.DeviceTypeVisitor;

public abstract class Device {
    
    protected String name;

    public Device(String name){
        this.name = name;
    }

    public final String getName(){
        return this.name;
    }

    public String toString(){
        return this.name + " " + this.getClass().getSimpleName();
    }

    public abstract String getStatus();

    /**
     * Accept visitor for concrete devices - used for diagnostics implementation
     * @param visitor
     */
    public abstract void accept(DeviceVisitor visitor);

    /**
     * Accept visitor for Device Types, e.g. Switchable etc. - used for automated command
     * adding implementation
     * @param visitor
     */
    public abstract void accept(DeviceTypeVisitor visitor);

    public abstract String getType();
}
