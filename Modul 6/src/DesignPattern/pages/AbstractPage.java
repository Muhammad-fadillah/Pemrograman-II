package DesignPattern.pages;

import DesignPattern.adapter.InputReader;
import DesignPattern.app.CLIApp;
import DesignPattern.factory.PageFactory;

public abstract class AbstractPage implements Page {
    protected InputReader input;
    protected CLIApp app;
    protected PageFactory factory;

    public AbstractPage(InputReader in, CLIApp app, PageFactory f){
        this.input=in;this.app=app;this.factory=f;
    }

    protected void pause(){
        System.out.println("\nTekan ENTER untuk kembali ke menu utama...");
        input.readLine();
    }
}
