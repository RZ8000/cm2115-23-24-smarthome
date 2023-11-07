package uk.ac.rgu.cm2115.devices.visitor;

import uk.ac.rgu.cm2115.Home;
import uk.ac.rgu.cm2115.devices.Adjustable;
import uk.ac.rgu.cm2115.devices.Dimmable;
import uk.ac.rgu.cm2115.devices.Playable;
import uk.ac.rgu.cm2115.devices.Switchable;

public class AddCommandVisitor implements DeviceTypeVisitor {

    private Home home;

    public AddCommandVisitor(Home home){
        this.home = home;
    }

    @Override
    public void visit(Switchable device, String name) {
        this.home.addCommand("Switch on " + name, device::switchOn);
        this.home.addCommand("Switch off " + name, device::switchOff);
    }

    @Override
    public void visit(Adjustable device, String name) {
        this.home.addCommand("Turn up " + name, device::turnUp);
        this.home.addCommand("Turn down " + name, device::turnDown);
    }

    @Override
    public void visit(Dimmable device, String name) {
        this.home.addCommand("Dim up " + name, device::dimUp);
        this.home.addCommand("Dim down " + name, device::dimDown);
    }

    @Override
    public void visit(Playable device, String name) {
        this.home.addCommand("Play " + name, device::play);
        this.home.addCommand("Stop " + name, device::stop);
    }
    
}
