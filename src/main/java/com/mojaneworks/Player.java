package com.mojaneworks;

import java.util.ArrayList;

public class Player {

    private ArrayList<Card> playerBin;

    private int playerNumber;

    private PlayerBuild playerBuild;

    private PlayerHand playerHand = new PlayerHand();

    public Player(int playerNumber){

        this.playerNumber = playerNumber;
    }

    public void setPlayerBuild(PlayerBuild playerBuild){

        this.playerBuild = playerBuild;
    }


    public void setPlayerBin(ArrayList<Card> playerBin) {

        this.playerBin = playerBin;
    }

    public ArrayList<Card> getPlayerBin() {

        return playerBin;
    }

    public PlayerBuild getPlayerBuild() {

        return playerBuild;
    }

    public PlayerHand getPlayerHand() {

        return playerHand;
    }

    public int getPlayerNumber() {

        return playerNumber;
    }

}
