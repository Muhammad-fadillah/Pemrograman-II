package Solid.app;

import java.util.Scanner;
import Solid.pages.*;
import Solid.repository.*;

public class CLIApp {

    private Scanner scanner;
    private boolean running;
    private Page current;

    private HomePage homePage;
    private AddPage addPage;
    private ViewPage viewPage;
    private DeletePage deletePage;

    private StudentRepository repository;

    public CLIApp() {
        scanner = new Scanner(System.in);
        repository = new InMemoryStudentRepository();

        homePage = new HomePage(scanner, this);
        addPage = new AddPage(scanner, this, repository);
        viewPage = new ViewPage(scanner, this, repository);
        deletePage = new DeletePage(scanner, this, repository);

        current = homePage;
        running = true;
    }

    public void run() {
        while (running) {
            current.show();
        }
        scanner.close();
        System.out.println("Aplikasi ditutup.");
    }

    public StudentRepository getRepository() { return repository; }

    public HomePage getHomePage() { return homePage; }
    public AddPage getAddPage() { return addPage; }
    public ViewPage getViewPage() { return viewPage; }
    public DeletePage getDeletePage() { return deletePage; }

    public void setCurrentPage(Page p) { this.current = p; }

    public void stop() { running = false; }
}
