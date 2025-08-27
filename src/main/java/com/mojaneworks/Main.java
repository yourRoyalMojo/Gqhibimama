package com.mojaneworks;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            int numberOfPlayers = 2;
            Table newTable = new Table(numberOfPlayers);
            newTable.dealCards();
        }
    }
