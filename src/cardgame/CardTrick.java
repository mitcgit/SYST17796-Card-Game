package cardgame;

import java.util.Random;
import java.util.Scanner;

/**
 * This program is a card game where the
 * user has to pick a random card in the computer's
 * "hand". This is built off of Professor Paul Bonenfant's
 * code and modified by me.
 * Due Date: February 4, 2022
 * @author Mitch Pepito
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pick any card");
        Card[] hand = new Card[7];
        Random random = new Random();
        
        for (int i = 0; i < hand.length; i++) {
            int value = random.nextInt(13) + 1;
            String suit = Card.SUITS[random.nextInt(4)];

            Card card = new Card(value, suit);
            hand[i] = card;
            System.out.println("Testing" + i);
        }
        
        // print them out for debugging purposes
        System.out.println("Here are the cards in the hand:");
        for (Card card : hand) {
            System.out.printf("%d of %s\n", card.getValue(), card.getSuit());
        }

        // Now ask the user for a card
        System.out.println("Pick a suit for your card:");
        for (int i = 0; i < Card.SUITS.length; i++) {
            System.out.println((i + 1) + ": " + Card.SUITS[i]);
        }
        int suit = sc.nextInt();

        System.out.println("Enter a value (1 to 13):");
        int value = sc.nextInt();

        Card userGuess = new Card(value, Card.SUITS[suit - 1]);
        boolean match = false;
        for (Card card : hand) {
            if (card.getValue() == userGuess.getValue()
                    && card.getSuit().equals(userGuess.getSuit())) {
                match = true;
                break;
            }
        }

        String response = match ? "Right guess" : "No match";

        System.out.println(response);

    }
}
