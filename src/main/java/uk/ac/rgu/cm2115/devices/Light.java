package uk.ac.rgu.cm2115.devices;

public class Light extends Device {
    private boolean on;

    private int level; 
    public Light(String name) {
        super(name);
    }

    public void switchOn(){
        System.out.println("Light is turned on");
        this.on = true;
        level = 3;
    }

    public void switchOff(){
        System.out.println("Light is turned off");
        on = false;
        level =0; 
    }

    public void dimUp(){
        this.level ++;
        System.out.println("Light is dimmed up");
    }

    public void dimDown(){
        this.level -=1;
        System.out.println("Light is dimmed down");
        if (this.level == 0) {
            System.out.print("Light is already off");
        }
    }

    public String getStatus() {
        return "light is " + this.on + " and level is" + this.level;
    }

    
}
