package Solid.pages;

import java.util.Scanner;
import Solid.app.CLIApp;
import Solid.entity.Student;
import Solid.repository.StudentRepository;

public class AddPage extends AbstractPage {

    private StudentRepository repository;

    public AddPage(Scanner scanner, CLIApp app, StudentRepository repository) {
        super(scanner, app);
        this.repository = repository;
    }

    @Override
    public void show() {
        System.out.println("=== TAMBAH DATA MAHASISWA ===");
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        repository.add(new Student(nama, nim));
        System.out.println("Data berhasil ditambahkan!");

        pause();
        app.setCurrentPage(app.getHomePage());
    }
}
