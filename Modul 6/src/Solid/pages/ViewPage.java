package Solid.pages;

import java.util.List;
import java.util.Scanner;
import Solid.app.CLIApp;
import Solid.entity.Student;
import Solid.repository.StudentRepository;

public class ViewPage extends AbstractPage {

    private StudentRepository repository;

    public ViewPage(Scanner scanner, CLIApp app, StudentRepository repository) {
        super(scanner, app);
        this.repository = repository;
    }

    @Override
    public void show() {
        System.out.println("=== DATA MAHASISWA ===");
        List<Student> students = repository.getAll();

        if (students.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }

        pause();
        app.setCurrentPage(app.getHomePage());
    }
}
