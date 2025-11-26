package DesignPattern.entity;

public class Student {
    private String name;
    private String nim;

    public Student(String n, String i) {
        name = n;
        nim  = i;
    }

    public String getName() {
        return name;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public String toString() {
        return "Nama: " + name + ", NIM: " + nim;
    }
}
