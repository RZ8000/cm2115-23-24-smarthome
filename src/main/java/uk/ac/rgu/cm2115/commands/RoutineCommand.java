package uk.ac.rgu.cm2115.commands;

import uk.ac.rgu.cm2115.RoutineStrategy;

public class RoutineCommand implements Command {
    private RoutineStrategy strategy;
    private Command[] commands;

    public RoutineCommand(RoutineStrategy strategy) {
        this.commands = new Command[10];
        this.strategy = strategy;
    }

    public void addCommand(Command command) {
        for (int i=0; i < this.commands.length; i++) {
            if (commands[i] == null) {
                commands[i] = command;
                break;
            }
        }
    }

    public void execute() {
        strategy.perform(commands);
    }
}