package DesignPattern.adapter;

import java.util.Scanner;

public class ScannerAdapter implements InputReader {
    private Scanner sc;

    public ScannerAdapter(Scanner sc){
        this.sc=sc;
    }

    @Override
    public String readLine(){
        return sc.nextLine();
    }
}
