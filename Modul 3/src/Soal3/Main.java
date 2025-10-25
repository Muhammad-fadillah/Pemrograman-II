package Soal3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String name = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = input.nextLine();

                    boolean exists = false;
                    for (Student s : students) {
                        if (s.getNim().equals(nim)) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Mahasiswa dengan NIM " + nim + " sudah ada. Gagal menambahkan.");
                    } else {
                        students.add(new Student(name, nim));
                        System.out.println("Mahasiswa " + name + " ditambahkan.");
                    }
                    break;

                case "2":
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String deleteNim = input.nextLine();
                    boolean removed = false;

                    Iterator<Student> iterator = students.iterator();
                    while (iterator.hasNext()) {
                        Student s = iterator.next();
                        if (s.getNim().equals(deleteNim)) {
                            iterator.remove();
                            removed = true;
                            break;
                        }
                    }

                    if (removed) {
                        System.out.println("Mahasiswa dengan NIM " + deleteNim + " dihapus.");
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + deleteNim + " tidak ditemukan.");
                    }
                    break;

                case "3":
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    String searchNim = input.nextLine();
                    boolean found = false;

                    for (Student s : students) {
                        if (s.getNim().equals(searchNim)) {
                            System.out.println("Data Mahasiswa Ditemukan:");
                            System.out.println("NIM: " + s.getNim() + ", Nama: " + s.getName());
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Mahasiswa dengan NIM " + searchNim + " tidak ditemukan.");
                    }
                    break;

                case "4":
                    if (students.isEmpty()) {
                        System.out.println("Daftar Mahasiswa kosong.");
                    } else {
                        System.out.println("Daftar Mahasiswa:");
                        for (Student s : students) {
                            System.out.println("NIM: " + s.getNim() + ", Nama: " + s.getName());
                        }
                    }
                    break;

                case "0":
                    System.out.println("Terima kasih!");
                    students.clear();
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}