package DesignPattern.pages;

import DesignPattern.adapter.InputReader;
import DesignPattern.app.CLIApp;
import DesignPattern.factory.PageFactory;
import DesignPattern.command.*;
import java.util.*;

public class HomePage extends AbstractPage {

    private Map<String,Command> cmds = new HashMap<>();

    public HomePage(InputReader in, CLIApp app, PageFactory f){
        super(in,app,f);
        cmds.put("1", new GoToPageCommand(app,"add"));
        cmds.put("2", new GoToPageCommand(app,"view"));
        cmds.put("3", new GoToPageCommand(app,"delete"));
        cmds.put("4", new ExitCommand(app));
    }

    public void show(){
        System.out.println("=== MENU UTAMA ===");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Lihat Data Mahasiswa");
        System.out.println("3. Hapus Data Mahasiswa");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu: ");
        String x=input.readLine();
        Command c=cmds.get(x);
        if(c!=null) c.execute();
        else {
            System.out.println("Pilihan tidak valid!");
            pause();
        }
    }
}
