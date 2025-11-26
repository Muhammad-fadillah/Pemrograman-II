package Solid.pages;

import java.util.Scanner;
import Solid.app.CLIApp;
import Solid.repository.StudentRepository;

public class DeletePage extends AbstractPage {

    private StudentRepository repository;

    public DeletePage(Scanner scanner, CLIApp app, StudentRepository repository) {
        super(scanner, app);
        this.repository = repository;
    }

    @Override
    public void show() {
        System.out.println("=== HAPUS DATA MAHASISWA ===");
        System.out.print("Masukkan nama atau NIM yang ingin dihapus: ");
        String input = scanner.nextLine();

        repository.removeByKeyword(input);
        System.out.println("Jika data ditemukan, telah dihapus.");

        pause();
        app.setCurrentPage(app.getHomePage());
    }
}
