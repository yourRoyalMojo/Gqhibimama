package com.mojaneworks;

import java.util.ArrayList;

public class Table {

    private final ArrayList<Player> players;

    private ArrayList<Card> tableCards;

    private final Deck cardDeck = new Deck();

    public Table(ArrayList<Player> players){

        this.players = players;
    }

    public void setTableCards(ArrayList<Card> tableCards){

        this.tableCards = tableCards;
    }

    public ArrayList<Card> getTableCards() {

        return tableCards;
    }

    public ArrayList<Player> getPlayers(){

        return players;
    }
}
