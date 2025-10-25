package Soal2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Country> countries = new LinkedList<>();

        HashMap<Integer, String> monthNames = new HashMap<>();
        monthNames.put(1, "Januari");
        monthNames.put(2, "Februari");
        monthNames.put(3, "Maret");
        monthNames.put(4, "April");
        monthNames.put(5, "Mei");
        monthNames.put(6, "Juni");
        monthNames.put(7, "Juli");
        monthNames.put(8, "Agustus");
        monthNames.put(9, "September");
        monthNames.put(10, "Oktober");
        monthNames.put(11, "November");
        monthNames.put(12, "Desember");

        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            String name = input.nextLine();
            String leadershipType = input.nextLine();
            String leaderName = input.nextLine();

            if (leadershipType.equalsIgnoreCase("monarki")) {
                countries.add(new Country(name, leadershipType, leaderName));
            } else {
                int independenceDate = Integer.parseInt(input.nextLine());
                int independenceMonth = Integer.parseInt(input.nextLine());
                int independenceYear = Integer.parseInt(input.nextLine());
                countries.add(new Country(name, leadershipType, leaderName, independenceDate, independenceMonth, independenceYear));
            }
        }

        System.out.println();

        for (Country c : countries) {
            String title = "";
            switch (c.getLeadershipType().toLowerCase()) {
                case "presiden":
                    title = "Presiden";
                    break;
                case "perdana menteri":
                    title = "Perdana Menteri";
                    break;
                case "monarki":
                    title = "Raja";
                    break;
                default:
                    title = c.getLeadershipType();
            }

            System.out.println("Negara " + c.getName() + " mempunyai " + title + " bernama " + c.getLeaderName());

            if (c.getIndependenceYear() != 0) {
                String monthName = monthNames.get(c.getIndependenceMonth());
                System.out.println("Deklarasi Kemerdekaan pada Tanggal "
                        + c.getIndependenceDate() + " "
                        + monthName + " "
                        + c.getIndependenceYear());
            }
            System.out.println();
        }
        input.close();
    }
}