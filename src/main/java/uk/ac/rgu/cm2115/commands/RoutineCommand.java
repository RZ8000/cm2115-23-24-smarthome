package uk.ac.rgu.cm2115.commands;

import uk.ac.rgu.cm2115.RoutineStrategy;

<<<<<<< HEAD
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
=======
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
>>>>>>> de014216fcd3c36e5d72e9479cfe688c23505302
                break;
            }
        }
    }

<<<<<<< HEAD
    @Override
    public void execute() {
        this.strategy.perform(this.commands);
    }
    
}
=======
    public void execute() {
        strategy.perform(commands);
    }
}
>>>>>>> de014216fcd3c36e5d72e9479cfe688c23505302
