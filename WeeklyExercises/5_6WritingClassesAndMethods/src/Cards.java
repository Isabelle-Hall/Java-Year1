import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Cards {

    public static void main(String[] args) {
        deck myDeck = new deck();
        suit mySuit = new suit();
        int count = 1;

        while (count <= 5) {
            Random rand = new Random();
            String randomValue = myDeck.NumberDeck.get(rand.nextInt(myDeck.NumberDeck.size()));
            String randomSuit = mySuit.SuitDeck.get(rand.nextInt(mySuit.SuitDeck.size()));
            System.out.println("Card Number " + count + " is " + randomValue + " of " + randomSuit);
            count++;
        }
    }

        public static class deck {
            List<String> NumberDeck = new ArrayList<>();

            public deck() {
                NumberDeck.add("1");
                NumberDeck.add("2");
                NumberDeck.add("3");
                NumberDeck.add("4");
                NumberDeck.add("5");
                NumberDeck.add("6");
                NumberDeck.add("7");
                NumberDeck.add("8");
                NumberDeck.add("9");
                NumberDeck.add("10");
                NumberDeck.add("Jack");
                NumberDeck.add("King");
                NumberDeck.add("Queen");
                NumberDeck.add("Ace");
            }
        }

            public static class suit {
                List<String> SuitDeck = new ArrayList<>();

                public suit() {
                    SuitDeck.add("Diamonds");
                    SuitDeck.add("Hearts");
                    SuitDeck.add("Spades");
                    SuitDeck.add("Clubs");
                }


            }

        }