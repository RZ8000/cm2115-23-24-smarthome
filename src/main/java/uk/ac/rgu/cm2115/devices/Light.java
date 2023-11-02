package uk.ac.rgu.cm2115.devices;

public class Light extends Device implements Switchable, Dimmable{
    
    private boolean on;
    private int level;

    public Light(String name) {
        super(name);
        this.on = false;
        this.level = 0;
    }

    @Override
    public void switchOn(){
        System.out.println("Light is turned on");
        this.on = true;
        this.level = 3;
    }

    @Override
    public void switchOff(){
        System.out.println("Light is turned off");
        this.on = false;
        this.level = 0;
    }

    @Override
    public void dimUp(){
        this.level ++;
        System.out.println("Light is dimmed up");
        this.level++;
    }

    @Override
    public void dimDown(){
        this.level -=1;
        System.out.println("Light is dimmed down");
        this.level--;

        if(this.level == 0){
            this.on = false; //could also call switchOff() method - effect is the same
        }
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
