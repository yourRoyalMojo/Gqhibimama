package com.mojaneworks;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Deck newDeck = new Deck();
            newDeck.setDeckCards();
            int pointCount = newDeck.getDeckCards().get(39).getPointCount();
            System.out.println(pointCount);
        }
    }
