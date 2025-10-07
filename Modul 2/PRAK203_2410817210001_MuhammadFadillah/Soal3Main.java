package PRAK203_2410817210001_MuhammadFadillah;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        // Error karena tidak ada titik koma (;) di akhir baris
        // p1.nama = "Roi"
        p1.nama = "Roi";

        p1.asal = "Kingdom of Orvel";

        // Atribut umur belum diinisialisasi
        p1.umur = 17;

        p1.setJabatan("Assasin");

        // Output yang diinginkan adalah "Nama: " bukan "Nama Pegawai: "
        // System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);

        // Output yang diinginkan memiliki tambahan tahun di belakangnya
        // System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}
