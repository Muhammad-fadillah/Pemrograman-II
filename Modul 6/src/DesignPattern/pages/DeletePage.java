package DesignPattern.pages;

import DesignPattern.adapter.InputReader;
import DesignPattern.app.CLIApp;
import DesignPattern.factory.PageFactory;
import DesignPattern.repository.StudentRepository;

public class DeletePage extends AbstractPage {

    private StudentRepository repo;

    public DeletePage(InputReader in, CLIApp app, PageFactory f, StudentRepository r){
        super(in,app,f);this.repo=r;
    }

    public void show(){
        System.out.println("=== HAPUS DATA MAHASISWA ===");
        System.out.print("Masukkan nama atau NIM yang ingin dihapus: ");
        String inputStr = input.readLine();
        repo.remove(inputStr);
        System.out.println("Jika data ditemukan, telah dihapus.");
        pause();
        app.changePage("home");
    }
}
