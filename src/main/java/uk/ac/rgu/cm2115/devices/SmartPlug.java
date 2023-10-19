package uk.ac.rgu.cm2115.devices;

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

}
