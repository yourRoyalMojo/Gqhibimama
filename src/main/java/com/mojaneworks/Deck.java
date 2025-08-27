package com.mojaneworks;

import java.util.ArrayList;

public class Deck {

    private final ArrayList<String> suits = new ArrayList<>();

    private final ArrayList<Card> deckCards = new ArrayList<>();

    private final int suitLength = 10;

    public Deck(){

        suits.add("Hearts");
        suits.add("Clubs");
        suits.add("Spades");
        suits.add("Diamonds");

    }

    public void setDeckCards() {

        for (int i = 1; i <= suitLength; i++){
            for (String suit : suits) {
                if (i == 1 || (i == 2 && suit.equals("Spades"))) {

                    Card newCard = new Card(i, suit, 1);
                    deckCards.add(newCard);
                }

                else if ((i == 10 && suit.equals("Diamonds"))) {

                    Card newCard = new Card(i, suit, 2);
                    deckCards.add(newCard);
                }

                else {

                    Card newCard = new Card(i, suit);
                    deckCards.add(newCard);
                }


            }

        }
    }

    public ArrayList<Card> getDeckCards(){

        return this.deckCards;
    }
}
