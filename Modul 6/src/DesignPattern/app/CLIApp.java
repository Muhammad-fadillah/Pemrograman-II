package DesignPattern.app;

import DesignPattern.adapter.InputReader;
import DesignPattern.adapter.ScannerAdapter;
import DesignPattern.factory.DefaultPageFactory;
import DesignPattern.factory.PageFactory;
import DesignPattern.pages.Page;
import java.util.Scanner;

public class CLIApp {

    private InputReader input;
    private PageFactory factory;
    private boolean running = true;
    private Page current;

    public CLIApp() {
        this.input = new ScannerAdapter(new Scanner(System.in));
        this.factory = new DefaultPageFactory(input, this);
        this.current = factory.create("home");
    }

    public void run() {
        while (running) current.show();
        System.out.println("Aplikasi ditutup.");
    }

    public void changePage(String type) {
        current = factory.create(type);
    }

    public void stop() {
        running = false;
    }

    public InputReader getInput() {
        return input;
    }
}
