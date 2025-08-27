package com.mojaneworks;

public class Card {
    /** I'm a card class that is used to populate the Deck to be used by the players */
    private final int cardNumber;

    private final String cardSuit;

    private int pointCount = 0;

    // Used to create normal cards
    public Card(int cardNumber, String cardSuit){

        this.cardNumber = cardNumber;
        this.cardSuit = cardSuit;
    }

    // Used to create point bearing cards
    public Card(int cardNumber, String cardSuit, int pointCount){

        this.cardNumber = cardNumber;
        this.cardSuit = cardSuit;
        this.pointCount = pointCount;
    }

    public int getCardNumber(){

        return this.cardNumber;
    }

    public String getCardSuit() {
        return cardSuit;
    }

    /**Instead of looking for each of the point bearing cards in each players bin,
     we'll just add up the point counts and the player with the highest wins*/

    public int getPointCount() {
        return pointCount;
    }
}
