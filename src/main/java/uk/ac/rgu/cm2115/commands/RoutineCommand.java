package uk.ac.rgu.cm2115.commands;

import uk.ac.rgu.cm2115.RoutineStrategy;

public class RoutineCommand implements Command{

    private RoutineStrategy strategy;
    private Command[] commands;

    public RoutineCommand(RoutineStrategy strategy){
        this.strategy = strategy;
        this.commands = new Command[10];
    }

    public void addCommand(Command command){
        for(int i=0;i<this.commands.length;i++){
            if(this.commands[i]==null){
                this.commands[i] = command;
                break;
            }
        }
    }

    @Override
    public void execute() {
        this.strategy.perform(this.commands);
    }
    
}
