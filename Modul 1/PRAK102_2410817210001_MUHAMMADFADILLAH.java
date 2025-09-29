import java.util.Scanner;

public class PRAK102_2410817210001_MUHAMMADFADILLAH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int angka = input.nextInt();
        input.nextLine();

        int iterasi = 0;
        while (iterasi < 11) {
            if (angka % 5 == 0) {
                System.out.print((angka / 5 - 1) + ", ");
            } else {
                System.out.print(angka + ", ");
            }
            angka++;
            iterasi++;
        }
        System.out.print("\b\b");

        input.close();
    }
}