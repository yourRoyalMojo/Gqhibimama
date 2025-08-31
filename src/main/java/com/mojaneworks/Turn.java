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
        System.out.println("Player " + (currentPlayer.getPlayerNumber() + 1) + "'s turn\n");
        for (Card card : currentPlayer.getPlayerHand().getHandCards()){

            System.out.println(card.getCardNumber() + " of " + card.getCardSuit());
        }
        System.out.println("enter 'build' or 'toss'");
        String playerInput = input.nextLine();

        while (!playerInput.equalsIgnoreCase("build") && !playerInput.equalsIgnoreCase("toss")) {
            System.out.println("Choose between 'build' and 'toss' please");
            playerInput = input.nextLine();
        }

        if (!this.tableCards.isEmpty() && playerInput.equalsIgnoreCase("build")){

            System.out.println("What number are you building?");
            int buildNumber = input.nextInt();
            currentPlayer.setPlayerBuild(buildNumber);
            System.out.println("Your hand: ");
            for (Card card : currentPlayer.getPlayerHand().getHandCards()){

                System.out.println(card.getCardNumber() + " of " + card.getCardSuit());
            }
            System.out.println("____________________________________________");

            System.out.println("Cards on table:");
            for (Card card : this.tableCards){

                System.out.println(card.getCardNumber() + " of " + card.getCardSuit());
            }

            System.out.println("Pick a card from your hand.");
            boolean cardFound = false;
            input.nextLine();
            String correctInput = input.nextLine();
            String cardSuit = correctInput.split(" ")[1];
            String cardNumber = correctInput.split(" ")[0];
            ArrayList<Card> playerHand = currentPlayer.getPlayerHand().getHandCards();

            for (int i = 0; i < playerHand.size(); i++) {

                if (playerHand.get(i).getCardNumber() == Integer.parseInt(cardNumber) &&
                        playerHand.get(i).getCardSuit().equalsIgnoreCase(cardSuit)){
                    currentPlayer.getPlayerBuild().addToBuild(playerHand.get(i));
                    currentPlayer.getPlayerHand().getHandCards().remove(playerHand.get(i));
                    break;
                }

            }
            System.out.println(currentPlayer.getPlayerBuild().getBuildCards());
            ArrayList<String> inputString = new ArrayList<>();
            System.out.println("Pick a card or cards to add to your build.");
            String cardString = input.nextLine();

            while(!cardString.equalsIgnoreCase("done")){

                inputString.add(cardString);
                if (!cardString.equalsIgnoreCase("done")){

                    cardString = input.nextLine();
                }

            }

//            for (Card card : tableCards){
//
//                if(currentPlayer.getPlayerBuild()== null || ){
//
//                }
//            }


        } else if (this.tableCards.isEmpty() && playerInput.equalsIgnoreCase("build")) {

            System.out.println("No cards on the table. 'toss' a card in your hand.");
            System.out.println("e.g '2 Spades'");
            System.out.println("Your hand: \n");
            for (Card card : currentPlayer.getPlayerHand().getHandCards()){

                System.out.println(card.getCardNumber() + " of " + card.getCardSuit());
            }

            String correctInput = input.nextLine();
            ArrayList<Card> playerHand = currentPlayer.getPlayerHand().getHandCards();
            playToss(correctInput, playerHand);
        }

        else if (playerInput.equalsIgnoreCase("toss")) {

            System.out.println("Your hand: \n");

            for (Card card : currentPlayer.getPlayerHand().getHandCards()){

                System.out.println(card.getCardNumber() + " of " + card.getCardSuit());
            }

            String correctInput = input.nextLine();
            ArrayList<Card> playerHand = currentPlayer.getPlayerHand().getHandCards();
            playToss(correctInput, playerHand);
        }
    }

    public void playToss(String correctInput, ArrayList<Card> playerHand){

        Scanner input = new Scanner(System.in);
        while (true) {

            boolean cardFound = false;
            String cardSuit = correctInput.split(" ")[1];
            String cardNumber = correctInput.split(" ")[0];


            for (int i = 0; i < playerHand.size(); i++) {

                if (playerHand.get(i).getCardNumber() == Integer.parseInt(cardNumber) &&
                        playerHand.get(i).getCardSuit().equalsIgnoreCase(cardSuit)) {
                    System.out.println("Tossing the " +
                            playerHand.get(i).getCardNumber() + " of " + playerHand.get(i).getCardSuit());
                    this.tableCards.add(playerHand.get(i));
                    currentPlayer.getPlayerHand().getHandCards().remove(playerHand.get(i));
                    cardFound = true;
                }
            }
            if(!cardFound){
                System.out.println("card not in your hand. choose a card in your hand");
                System.out.println("i'm here");
                correctInput = input.nextLine();
            }
            else{

                break;
            }
        }

    }

    public void playBuild(){


    }

    public Player getCurrentPlayer() {

        return currentPlayer;
    }

    public ArrayList<Card> getTableCards() {

        return tableCards;
    }


}
