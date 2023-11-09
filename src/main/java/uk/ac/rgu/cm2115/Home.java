package uk.ac.rgu.cm2115;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import uk.ac.rgu.cm2115.commands.Command;
import uk.ac.rgu.cm2115.devices.Device;

/**
 * Class to act as a hub for the smarthome
 * @author Mark Snaith
 */
public class Home {

    private ArrayList<Device> devices;
    private static Home instance;
    Map<String, Command> commands = new HashMap<>();

    

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

    public Command getCommand(String label){
        return commands.get(label);
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
