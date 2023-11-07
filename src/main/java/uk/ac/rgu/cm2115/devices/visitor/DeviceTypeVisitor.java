package uk.ac.rgu.cm2115.devices.visitor;

import uk.ac.rgu.cm2115.devices.Adjustable;
import uk.ac.rgu.cm2115.devices.Dimmable;
import uk.ac.rgu.cm2115.devices.Playable;
import uk.ac.rgu.cm2115.devices.Switchable;

public interface DeviceTypeVisitor {
    public void visit(Switchable device, String name);
    public void visit(Adjustable device, String name);
    public void visit(Dimmable device, String name);
    public void visit(Playable device, String name);
}
