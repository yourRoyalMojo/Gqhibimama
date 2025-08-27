package com.mojaneworks;

import java.util.ArrayList;

public class PlayerHand {

    private int handCount;

    private ArrayList<Card> handCards;

    private boolean isFinished = false;

    public PlayerHand(ArrayList<Card> handCards){

        this.handCount = 10;
        this.handCards = handCards;
    }

    public void setHandCount(){

        this.handCount -=1;
    }

    public void useCard(Card cardToUse){

        this.handCards.remove(cardToUse);
    }

    public void setFinished() {

        this.isFinished = true;
    }

    public ArrayList<Card> getHandCards() {

        return this.handCards;
    }

    public boolean getIsFinished() {

        return this.isFinished;
    }

    public int getHandCount() {

        return this.handCount;
    }
}
