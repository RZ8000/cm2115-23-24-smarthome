package uk.ac.rgu.cm2115;

import java.util.ArrayList;
import java.util.HashMap;
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> de014216fcd3c36e5d72e9479cfe688c23505302
import java.util.Map;
import java.util.Set;

import uk.ac.rgu.cm2115.commands.Command;
import uk.ac.rgu.cm2115.devices.Device;
import uk.ac.rgu.cm2115.devices.diagnostics.DeviceDiagnosticsVisitor;
import uk.ac.rgu.cm2115.devices.visitor.AddCommandVisitor;

/**
 * Class to act as a hub for the smarthome
 * @author Mark Snaith
 */
public class Home {

<<<<<<< HEAD
    private List<Device> devices;
    private Map<String, Command> commands;

    private AddCommandVisitor addCommandVisitor;

    private static Home instance = null;

    public static Home getInstance(){
        if(instance == null){
=======
    private ArrayList<Device> devices;
    private static Home instance;
    Map<String, Command> commands = new HashMap<>();

    

    public static Home getInstance() {
        if (instance == null) {
>>>>>>> de014216fcd3c36e5d72e9479cfe688c23505302
            instance = new Home();
        }
        return instance;
    }

<<<<<<< HEAD
    private Home(){
        this.devices = new ArrayList<>();
        this.commands = new HashMap<>();

        this.addCommandVisitor = new AddCommandVisitor(this);
    }

    public void addDevice(Device device){
        if(device != null){
            this.devices.add(device);
            device.accept(addCommandVisitor);
        }
    }

    public void addCommand(String label, Command command){

        this.commands.put(label, command);
    }

    public Command getCommand(String label){
        return this.commands.get(label);
    }

    public void runDiagnostics(){
        DeviceDiagnosticsVisitor visitor = new DeviceDiagnosticsVisitor();

        for(Device device : this.devices){
            if(device != null){
                device.accept(visitor);
            }
        }
    }

    public Set<String> getCommandLabels(){
        return this.commands.keySet();
    }

=======

    


//     private Home(){
//     String[] commandLabels;
// }

    public Set<String> getCommandLabels() {
        return commands.keySet();
    }


    private Home(){
        this.devices = new ArrayList<>();
        this.commands = new HashMap<>();
        
    }

    public void addDevice(Device device){
        this.devices.add(device);
    }

    
    // public void addCommand(String commandLabel, Command command){
    //     for(int i=0;i<this.commands.length;i++){
    //         if(commands[i] == null){
    //             commands[i] = command;
    //             commandLabels[i] = commandLabel;
    //             break;
    //         }
    //     }
    //     labelMap.put(command, "word");
    // }

    public Command getCommand(String label){
        return commands.get(label);
    }



>>>>>>> de014216fcd3c36e5d72e9479cfe688c23505302
    public Map<String, Command> getCommands(){
        return this.commands;
    }

<<<<<<< HEAD
    public List<Device> getDevices(){
=======
    

    public ArrayList<Device> getDevices(){
>>>>>>> de014216fcd3c36e5d72e9479cfe688c23505302
        return this.devices;
    }

    public void addCommand(String commandLabel, Command command) {
        commands.put(commandLabel, command);
    }   
    
    

}
