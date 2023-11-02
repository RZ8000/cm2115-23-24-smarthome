package uk.ac.rgu.cm2115.devices;

<<<<<<< HEAD
public class Thermostat extends Device implements Adjustable{
=======
public class Thermostat extends Device{
    private int temp;

>>>>>>> 914b944814597548ccbfc984ece09c743977cb1f
    
    private int temperature;

    public Thermostat(String name) {
        super(name);
        this.temperature = 10;
    }

    @Override
    public void turnUp(){
        System.out.println("Thermostat is turned up");
<<<<<<< HEAD
        this.temperature++;
=======
        this.temp++;  
>>>>>>> 914b944814597548ccbfc984ece09c743977cb1f
    }

    @Override
    public void turnDown(){
        System.out.println("Thermostat is turned down");
<<<<<<< HEAD
        this.temperature--;
        // could also include code here to stop the thermostat going below a certain level
    }

    @Override
    public String getStatus(){
        return this.name + " is set to temperature " + this.temperature;
=======
        this.temp--;
>>>>>>> 914b944814597548ccbfc984ece09c743977cb1f
    }

    public String getStatus() {
        return "Thermostat is" + this.temp; 
    }


}
