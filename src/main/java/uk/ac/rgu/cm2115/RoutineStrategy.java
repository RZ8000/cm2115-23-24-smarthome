package uk.ac.rgu.cm2115;

import uk.ac.rgu.cm2115.commands.Command;

public interface RoutineStrategy {
    

    public void perform(Command[] commands);

}
