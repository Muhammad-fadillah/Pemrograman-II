package DesignPattern.command;

import DesignPattern.app.CLIApp;

public class GoToPageCommand implements Command {
    private CLIApp app;
    private String type;

    public GoToPageCommand(CLIApp app,String t){
        this.app=app;this.type=t;
    }

    public void execute(){
        app.changePage(type);
    }
}
