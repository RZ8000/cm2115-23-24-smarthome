package uk.ac.rgu.cm2115;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import uk.ac.rgu.cm2115.commands.Command;
import uk.ac.rgu.cm2115.devices.Device;
import uk.ac.rgu.cm2115.devices.diagnostics.DeviceDiagnosticsVisitor;
import uk.ac.rgu.cm2115.devices.visitor.AddCommandVisitor;
import uk.ac.rgu.cm2115.exceptions.CommandNotFoundException;

/**
 * Class to act as a hub for the smarthome
 * @author Mark Snaith
 */
public class Home {

    private ArrayList<Device> devices;
    private static Home instance;
    Map<String, Command> commands = new HashMap<>();
    private AddCommandVisitor addCommandVisitor;
    

    public static Home getInstance() {
        if (instance == null) {
            instance = new Home();
        }
        return instance;
    }


    


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

    public Command getCommand(String label) throws CommandNotFoundException{
        Command c =  commands.get(label);
        if (c == null) {
            throw new CommandNotFoundException(label);
        }
        return c;


    }



    public Map<String, Command> getCommands(){
        return this.commands;
    }

    

    public ArrayList<Device> getDevices(){
        return this.devices;
    }

    public void addCommand(String commandLabel, Command command) {
        commands.put(commandLabel, command);
    }   
    
    

}
