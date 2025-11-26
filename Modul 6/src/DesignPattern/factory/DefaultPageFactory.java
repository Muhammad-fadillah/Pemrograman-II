package DesignPattern.factory;

import DesignPattern.adapter.InputReader;
import DesignPattern.app.CLIApp;
import DesignPattern.pages.*;
import DesignPattern.repository.*;

public class DefaultPageFactory implements PageFactory {

    private InputReader input;
    private CLIApp app;
    private static StudentRepository repo = new InMemoryStudentRepository();

    public DefaultPageFactory(InputReader in, CLIApp app){
        this.input=in;
        this.app=app;
    }

    @Override
    public Page create(String t){
        return switch(t){
            case "home" -> new HomePage(input,app,this);
            case "add" -> new AddPage(input,app,this,repo);
            case "view" -> new ViewPage(input,app,this,repo);
            case "delete" -> new DeletePage(input,app,this,repo);
            default -> new HomePage(input,app,this);
        };
    }
}
