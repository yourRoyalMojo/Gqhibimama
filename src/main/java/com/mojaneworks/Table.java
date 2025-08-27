package com.mojaneworks;

import java.util.ArrayList;
import java.util.Random;

public class Table {

    private final ArrayList<Player> players = new ArrayList<>();

    private ArrayList<Card> tableCards;

    private final Deck cardDeck = new Deck();

    public Table(int numberOfPlayers){

        for (int i = 0; i < numberOfPlayers; i++){

            Player newPlayer = new Player(i);
            players.add(newPlayer);
        }
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

    public void dealCards() {

        while (players.get(0).getPlayerHand().getHandCards().size() < 10 &&
                players.get(1).getPlayerHand().getHandCards().size() < 10) {


            for (int i = 0; i < players.size(); i++) {

                Random randomizer = new Random();
                Card newCard = cardDeck.getDeckCards().get(randomizer.nextInt(cardDeck.
                        getDeckCards().size()));

                if (!players.get(i).getPlayerHand().getHandCards().contains(newCard)) {

                    players.get(i).getPlayerHand().getHandCards().add(newCard);
                    cardDeck.getDeckCards().remove(newCard);
                }
            }

        }
    }
}
