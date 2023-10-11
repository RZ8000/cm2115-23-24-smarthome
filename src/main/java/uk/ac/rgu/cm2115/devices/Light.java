package uk.ac.rgu.cm2115.devices;

public class Light extends Device{
    
    private boolean on;
    private int level;

    public Light(String name) {
        super(name);
        this.on = false;
        this.level = 0;
    }

    public void switchOn(){
        System.out.println("Light is turned on");
        this.on = true;
        this.level = 3;
    }

    public void switchOff(){
        System.out.println("Light is turned off");
        this.on = false;
        this.level = 0;
    }

    public void dimUp(){
        System.out.println("Light is dimmed up");
        this.level++;
    }

    public void dimDown(){
        System.out.println("Light is dimmed down");
        this.level--;
    }

    @Override
    public String getStatus(){
        String status = "off";

        if(this.on){
            status = "on";
        }

        return this.name + " is " + status + " (level " + this.level + ")";
    }
}
