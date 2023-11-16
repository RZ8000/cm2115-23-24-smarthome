package uk.ac.rgu.cm2115.exceptions;

public class CommandNotFoundException extends Exception{
    String msg; 

    public CommandNotFoundException (String msg) {
        super(msg);
    }
}
