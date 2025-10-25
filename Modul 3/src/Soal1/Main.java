package Soal1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Dice> diceList = new LinkedList<>();

        System.out.print("");
        int numberOfDice = input.nextInt();

        for (int i = 0; i < numberOfDice; i++) {
            Dice dice = new Dice();
            dice.rollValue();
            diceList.add(dice);
        }

        int totalValue = 0;

        for (int i = 0; i < diceList.size(); i++) {
            int value = diceList.get(i).getValue();
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + value);
            totalValue += value;
        }

        System.out.println("Total nilai dadu keseluruhan " + totalValue);
    }
}
