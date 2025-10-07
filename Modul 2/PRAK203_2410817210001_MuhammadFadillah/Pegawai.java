package PRAK203_2410817210001_MuhammadFadillah;

// Nama kelas salah seharusnya Pegawai agar sesuai dengan nama file
// public class Employee {
public class Pegawai {
    public String nama;
    // Tipe data untuk 'asal' tidak sesuai, seharusnya String karena menerima inputan berupa kalimat
    // public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

     public String getAsal() {
         return asal;
    }

    // Method setJabatan tidak memiliki parameter untuk menerima data jabatan
    // public void setJabatan() {
    public void setJabatan(String j) {
         this.jabatan = j;
    }
}