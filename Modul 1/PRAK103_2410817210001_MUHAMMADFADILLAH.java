import java.util.Scanner;

public class PRAK103_2410817210001_MUHAMMADFADILLAH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input jumlah baris (N): ");
        int total = input.nextInt();
        System.out.print("Input angka awal: ");
        int awal = input.nextInt();

        int hitung = 0;
        while (hitung < total) {
            if (awal % 2 == 1) {
                System.out.print(awal);
                hitung++;

                if (hitung < total) {
                    System.out.print(", ");
                }
            }
            awal++;
        }
        input.close();
    }
}
