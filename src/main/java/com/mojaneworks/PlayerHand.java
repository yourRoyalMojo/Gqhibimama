package com.mojaneworks;

import java.util.ArrayList;

public class PlayerHand {

    private int handCount;

    private ArrayList<Card> handCards = new ArrayList<>();

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


    public ArrayList<Card> getHandCards() {

        return this.handCards;
    }
    

    public int getHandCount() {

        return this.handCount;
    }
}
