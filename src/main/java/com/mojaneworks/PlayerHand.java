package com.mojaneworks;

import java.util.ArrayList;

public class PlayerHand {

    private int handCount;

    private ArrayList<Card> handCards = new ArrayList<>();

    private boolean isFinished = false;

    public PlayerHand(){

        this.handCount = 10;
    }

    public void setHandCount(){

        this.handCount -=1;
    }

    public void useCard(Card cardToUse){

        this.handCards.remove(cardToUse);
        setHandCount();
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
