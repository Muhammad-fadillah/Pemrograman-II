package DesignPattern.command;
import DesignPattern.app.CLIApp;

public class ExitCommand implements Command{
    private CLIApp app;

    public ExitCommand(CLIApp app){
        this.app=app;
    }

    public void execute(){
        app.stop();
    }
}
