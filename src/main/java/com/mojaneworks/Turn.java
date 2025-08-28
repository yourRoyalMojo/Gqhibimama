package com.mojaneworks;

import java.util.ArrayList;
import java.util.Scanner;

public class Turn {

    private Player currentPlayer;

    private ArrayList<Card> tableCards;

    public Turn(Player currentPlayer, ArrayList<Card> tableCards){

        this.currentPlayer = currentPlayer;
        this.tableCards = tableCards;
    }

    public void takeTurn(){

        Scanner input = new Scanner(System.in);
        System.out.println("enter 'build' or 'toss'");
        String playerInput = input.nextLine();

        if (!this.tableCards.isEmpty() && playerInput.equalsIgnoreCase("build")){
            System.out.println("Choose a card from the following: ");
            for (Card card : tableCards){

                System.out.println(card);
            }
            System.out.println("e.g '2 Spades'");

        } else if (this.tableCards.isEmpty()) {

            System.out.println("No cards on the table. 'toss' a card in your hand.");
            System.out.println("e.g '2 Spades'");
            System.out.println("Your hand: ");
            for (Card card : currentPlayer.getPlayerHand().getHandCards()){

                System.out.println(card.getCardNumber() + " of " + card.getCardSuit());
            }

            String correctInput = input.nextLine();
            ArrayList<Card> playerHand = currentPlayer.getPlayerHand().getHandCards();
            while (true) {

                String cardSuit = correctInput.split(" ")[1];
                String cardNumber = correctInput.split(" ")[0];


                for (int i = 0; i < playerHand.size(); i++) {

                    if (playerHand.get(i).getCardNumber() == Integer.parseInt(cardNumber) &&
                            playerHand.get(i).getCardSuit().equalsIgnoreCase(cardSuit)) {
                        System.out.println("Tossing the " +
                                playerHand.get(i).getCardNumber() + " of " + playerHand.get(i).getCardSuit());
                        currentPlayer.getPlayerHand().getHandCards().remove(playerHand.get(i));
                        this.tableCards.add(playerHand.get(i));
                        break;
                    }
                    else if(playerHand.get(i).getCardNumber() != Integer.parseInt(cardNumber) &&
                            !playerHand.get(i).getCardSuit().equalsIgnoreCase(cardSuit)){
                        System.out.println("card not in your hand. choose a card in your hand");
                        correctInput = input.nextLine();
                    }
                }
            }
        }
    }

    public Player getCurrentPlayer() {

        return currentPlayer;
    }

    public ArrayList<Card> getTableCards() {

        return tableCards;
    }


}
