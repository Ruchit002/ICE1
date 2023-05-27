/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
    
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    
    import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    private static final String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
    private static final Random random = new Random();
    private static final int HAND_SIZE = 7;

    private static class Card {
        private final String suit;
        private final int number;

        public Card(String suit, int number) {
            this.suit = suit;
            this.number = number;
        }

        public String getSuit() {
            return suit;
        }

        public int getNumber() {
            return number;
        }
    }
Card luckyCard = new Card();
        luckyCard.setValue(1);
        luckyCard.setSuit("Spades");
    
    public static void main(String[] args) {
        Card[] hand = generateRandomHand();
        displayHand(hand);

        Card luckyCard = new Card("Spades", 7);

        System.out.print("Pick a card (any card): ");
        Scanner scanner = new Scanner(System.in);
        String pickedCard = scanner.nextLine();

        if (isCardInHand(hand, pickedCard)) {
            System.out.println("Congratulations! You picked the lucky card.");
        } else {
            System.out.println("Sorry, the lucky card was not picked.");
        }

        scanner.close();
    }

    private static Card[] generateRandomHand() {
        Card[] hand = new Card[HAND_SIZE];
        for (int i = 0; i < HAND_SIZE; i++) {
            String suit = suits[random.nextInt(suits.length)];
            int number = random.nextInt(13) + 1;
            hand[i] = new Card(suit, number);
        }
        return hand;
    }

    private static void displayHand(Card[] hand) {
        System.out.println("Randomly generated hand of cards:");
        for (Card card : hand) {
            System.out.println(card.getNumber() + " of " + card.getSuit());
        }
    }

    private static boolean isCardInHand(Card[] hand, String pickedCard) {
        for (Card card : hand) {
            if (card.getSuit().equalsIgnoreCase(pickedCard) || String.valueOf(card.getNumber()).equals(pickedCard)) {
                return true;
            }
        }
        return false;
    }
}

}

