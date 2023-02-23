package cardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CardRankWithPower cardRank = CardRankWithPower.valueOf(scanner.nextLine());
        CardSuitWithPower cardSuit = CardSuitWithPower.valueOf(scanner.nextLine());
        int cardPower = cardRank.getPower() + cardSuit.getPower();

        System.out.printf("Card name: %s of %s; Card power: %d", cardRank, cardSuit, cardPower);
    }
}
