package uk.ac.rgu.cm2115.devices;

public class SmartPlug extends Device {
    private boolean on; 
    
    public SmartPlug(String name) {
        super(name);
    }

    public void switchOn(){
        System.out.println("Smart plug is switched on");
        this.on = true;
    }

    public void swithOff(){
        System.out.println("Smart plug is switched off");
        on = false;
    }

    public String getStatus() {
        return "The smartplug is " + this.on;
    }

}
