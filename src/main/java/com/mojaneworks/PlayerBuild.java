package com.mojaneworks;

import java.util.ArrayList;

public class PlayerBuild {

    private final int buildNumber;

    private boolean isClaimed = false;

    private ArrayList<Card> buildCards;

    public PlayerBuild(int buildNumber){

        this.buildNumber = buildNumber;
    }

    public int getBuildNumber() {

        return buildNumber;
    }

    public void setClaimed(){

        this.isClaimed = true;
    }

    public boolean isClaimed() {
        return isClaimed;
    }

    public void addToBuild(ArrayList<Card> cardsToAdd){

        this.buildCards.addAll(cardsToAdd);
    }
}
