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

/**
 * Class to act as a hub for the smarthome
 * @author Mark Snaith
 */
public class Home {

    private List<Device> devices;
    private Map<String, Command> commands;

    private AddCommandVisitor addCommandVisitor;

    private static Home instance = null;

    public static Home getInstance(){
        if(instance == null){
            instance = new Home();
        }
        return instance;
    }

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

    public Map<String, Command> getCommands(){
        return this.commands;
    }

    public List<Device> getDevices(){
        return this.devices;
    }
}
