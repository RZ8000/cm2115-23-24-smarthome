package uk.ac.rgu.cm2115.devices;

import uk.ac.rgu.cm2115.devices.diagnostics.DeviceVisitor;
import uk.ac.rgu.cm2115.devices.visitor.DeviceTypeVisitor;

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

<<<<<<< HEAD
    @Override
    public void accept(DeviceTypeVisitor visitor) {
        /* Because a Light is both Switchable and Dimmable, we need two 
         * calls to visitor.visit, with a cast to disambiguate which method
         * we're actually calling
         */
        visitor.visit((Switchable)this, this.name);
        visitor.visit((Dimmable)this, this.name);
    }

    @Override
    public void accept(DeviceVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * Added to allow sub-types of light to be created in factories
     * @return
     */
    public String getType(){
        return "Generic light";
    }
=======
    

 

    
>>>>>>> de014216fcd3c36e5d72e9479cfe688c23505302
}
