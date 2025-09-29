import java.util.Scanner;

public class PRAK104_2410817210001_MUHAMMADFADILLAH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String[] abu = input.nextLine().split(" ");
        System.out.print("Tangan Bagas: ");
        String[] bagas = input.nextLine().split(" ");

        int skorAbu = 0;
        int skorBagas = 0;

        for (int i = 0; i < 3; i++) {
            String tanganAbu = abu[i];
            String tanganBagas = bagas[i];

            if (tanganAbu.equals(tanganBagas)) {
            } else if (tanganAbu.equals("B") && tanganBagas.equals("G")) {
                skorAbu++;
            } else if (tanganAbu.equals("G") && tanganBagas.equals("K")) {
                skorAbu++;
            } else if (tanganAbu.equals("K") && tanganBagas.equals("B")) {
                skorAbu++;
            } else {
                skorBagas++;
            }
        }

        if (skorAbu > skorBagas) {
            System.out.println("Abu");
        } else if (skorBagas > skorAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }

        input.close();
    }
}
