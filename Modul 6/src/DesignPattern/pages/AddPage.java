package DesignPattern.pages;

import DesignPattern.adapter.InputReader;
import DesignPattern.app.CLIApp;
import DesignPattern.factory.PageFactory;
import DesignPattern.repository.StudentRepository;
import DesignPattern.entity.Student;

public class AddPage extends AbstractPage {

    private StudentRepository repo;

    public AddPage(InputReader in, CLIApp app, PageFactory f, StudentRepository r){
        super(in,app,f);this.repo=r;
    }

    public void show(){
        System.out.println("=== TAMBAH DATA MAHASISWA ===");
        System.out.print("Masukkan nama: ");
        String nama = input.readLine();
        System.out.print("Masukkan NIM: ");
        String nim = input.readLine();
        repo.add(new Student(nama, nim));
        System.out.println("Data berhasil ditambahkan!");
        pause();
        app.changePage("home");
    }
}
