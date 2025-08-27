package com.mojaneworks;

public class Card {

    private int cardNumber;

    private String cardSuit;

    private int pointCount = 0;

    public Card(int cardNumber, String cardSuit){

        this.cardNumber = cardNumber;
        this.cardSuit = cardSuit;
    }

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
}
