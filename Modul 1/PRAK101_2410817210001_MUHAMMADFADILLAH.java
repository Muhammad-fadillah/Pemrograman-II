import java.util.Scanner;
import java.util.Locale;

public class PRAK101_2410817210001_MUHAMMADFADILLAH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = input.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = input.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = input.nextInt();
        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = input.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        int tinggiBadan = input.nextInt();
        System.out.print("Masukkan Berat Badan: ");
        double berat = input.nextDouble();

        String[] namaBulan = {"", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        System.out.printf("\nOutput:\nNama Lengkap %s, Lahir di %s pada Tanggal %d %s %d%nTinggi Badan %d cm dan Berat Badan %.2f kilogram%n",
                namaLengkap, tempatLahir, tanggalLahir, namaBulan[bulanLahir], tahunLahir, tinggiBadan, berat);

        input.close();
    }
}