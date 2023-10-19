package uk.ac.rgu.cm2115;

import uk.ac.rgu.cm2115.commands.Command;
import uk.ac.rgu.cm2115.devices.Device;

/**
 * Class to act as a hub for the smarthome
 * @author Mark Snaith
 */
public class Home {

    Device[] devices;
    Command[] commands;

    public Home(){
        this.devices = new Device[5];
        this.commands = new Command[10];
    }

    public void addDevice(Device device){
        for(int i=0;i<this.devices.length;i++){
            if(this.devices[i] == null){
                this.devices[i] = device;
                break;
            }
        }
    }

    public void addCommand(Command command){
        for(int i=0;i<this.commands.length;i++){
            if(commands[i] == null){
                commands[i] = command;
                break;
            }
        }
    }

    public Command[] getCommands(){
        return this.commands;
    }

    public Device[] getDevices(){
        return this.devices;
    }
}
