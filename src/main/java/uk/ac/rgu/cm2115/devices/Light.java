package uk.ac.rgu.cm2115.devices;

public class Light extends Device {
    
    public Light(String name) {
        super(name);
    }

    public void turnOn(){
        System.out.println("Light is turned on");
    }

    public void turnOf(){
        System.out.println("Light is turned off");
    }

    public void dimUp(){
        System.out.println("Light is dimmed up");
    }

    public void dimDown(){
        System.out.println("Light is dimmed down");
    }
}
