package uk.ac.rgu.cm2115.devices;

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

<<<<<<< HEAD
    public abstract String getStatus();
=======
    public abstract String getStatus(); 
>>>>>>> 914b944814597548ccbfc984ece09c743977cb1f
}
