package cardgame;

import java.util.Random;

/**
 *
 * @author Mitch Pepito
 */
public class Card {

    private String suit;
    private int value;
    public static final String[] SUITS = {"Clubs", "Diamonds",
        "Spades", "Hearts"};
    public static final String[] VALUE = {"2", "3", "4", "5",
        "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public Card()
    {
        this.value=1;
        this.suit = "";
    }
    
    public Card(int value, String suit) {
        this.suit = suit;
        this.value = value;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}
