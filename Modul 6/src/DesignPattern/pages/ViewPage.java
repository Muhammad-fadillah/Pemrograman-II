package DesignPattern.pages;

import DesignPattern.adapter.InputReader;
import DesignPattern.app.CLIApp;
import DesignPattern.factory.PageFactory;
import DesignPattern.repository.StudentRepository;
import DesignPattern.entity.Student;
import java.util.List;

public class ViewPage extends AbstractPage {

    private StudentRepository repo;

    public ViewPage(InputReader in, CLIApp app, PageFactory f, StudentRepository r){
        super(in,app,f);this.repo=r;
    }

    public void show(){
        System.out.println("=== DATA MAHASISWA ===");
        List<Student> students = repo.all();
        if (students.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
        pause();
        app.changePage("home");
    }
}
