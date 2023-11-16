package uk.ac.rgu.cm2115.devices;

<<<<<<< HEAD
import uk.ac.rgu.cm2115.devices.diagnostics.DeviceVisitor;
import uk.ac.rgu.cm2115.devices.visitor.DeviceTypeVisitor;

public abstract class Device implements Comparable<Device> {
=======
public abstract class Device implements Comparable<Device>{
>>>>>>> de014216fcd3c36e5d72e9479cfe688c23505302
    
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

<<<<<<< HEAD
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

    @Override
    public int compareTo(Device other){
        return this.name.toLowerCase().compareTo(other.name.toLowerCase());
    }

    public static int compareReverse(Device firstDevice, Device secondDevice){
        return firstDevice.compareTo(secondDevice) * -1;
    }
=======
    public abstract String getStatus(); 

    public int compareTo(Device other) {
        return this.name.toLowerCase().compareTo(other.name.toLowerCase());
    }
>>>>>>> de014216fcd3c36e5d72e9479cfe688c23505302
}
