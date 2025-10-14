package Soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int choice = input.nextInt();
        input.nextLine();

        System.out.print("Nama hewan peliharaan: ");
        String name = input.nextLine();
        System.out.print("Ras: ");
        String breed = input.nextLine();
        System.out.print("Warna bulu: ");
        String furColor = input.nextLine();

        if (choice == 1) {
            Cat cat = new Cat(breed, name, furColor);
            cat.displayCatDetails();
        } else if (choice == 2) {
            System.out.print("Kemampuan: ");
            String abilitiesInput = input.nextLine();
            String[] abilities = abilitiesInput.split(", ");
            Dog dog = new Dog(breed, name, furColor, abilities);
            dog.displayDogDetails();
        } else {
            System.out.println("Input tidak valid.");
        }

        input.close();
    }
}