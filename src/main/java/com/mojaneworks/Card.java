package com.mojaneworks;

public class Card {

    private int cardNumber;

    private String cardSuit;

    public Card(int cardNumber, String cardSuit){

        this.cardNumber = cardNumber;
        this.cardSuit = cardSuit;
    }

    public int getCardNumber(){

        return this.cardNumber;
    }

    public String getCardSuit() {
        return cardSuit;
    }
}
