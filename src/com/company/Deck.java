package com.company;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    //ArrayLists for card classifications and deck
    List<String> suit = new ArrayList<>();
    List<Integer> rankIsValue = new ArrayList<>();
    List<String> rank = new ArrayList<>();
    List<Integer> value = new ArrayList<>();
    //Deck should have a public method that “builds” an arraylist of Card objects
    List<Card> deckOfCards = new ArrayList<>();

    public Deck() {

        // Assign each Card a Suit (Spades, Clubs, Diamond, and Heart)
        suit.add("Spades");
        suit.add("Clubs");
        suit.add("Diamonds");
        suit.add("Hearts");

        // Assigning each card a Rank where it is equal to its value (2-9)
        rankIsValue.add(2);
        rankIsValue.add(3);
        rankIsValue.add(4);
        rankIsValue.add(5);
        rankIsValue.add(6);
        rankIsValue.add(7);
        rankIsValue.add(8);
        rankIsValue.add(9);

        // Assigning each card a Rank (10, Jack, Queen, King, Ace)
        rank.add("10");
        rank.add("Jack");
        rank.add("Queen");
        rank.add("King");
        rank.add("Ace");

        //Assigning each card a value for 10 & 11

        value.add(10);
        value.add(11);
    }



    //For loop - runs through first suit then each rankIsValue index 0-8, then runs through second suit with each
    // rankIsValue index 0-8, etc.
    public void deckBuilder() {
        for (int suitIndex = 0; suitIndex < suit.size(); suitIndex++) {
            for (int rankIsValueIndex = 0; rankIsValueIndex < rankIsValue.size(); rankIsValueIndex++) {

                //New Variables to pass through cards
                String newSuit = suit.get(suitIndex);
                int newValue = rankIsValue.get(rankIsValueIndex);
                String newRankIsValue = String.valueOf(newValue);

                //Creates first group of cards
                Card newCard = new Card(newSuit, newRankIsValue, newValue);

                //Adds above cards to arrayList, Deck should have a public method that “builds” an arraylist of Card objects
                deckOfCards.add(newCard);

                //Prints
                int index = deckOfCards.size() - 1;
                deckOfCards.get(index).Print();


            }

            //For loop within suit loop that goes through 10-King ranks with 10 value for all
            for (int rankIndex = 0; rankIndex <= 3; rankIndex++) {
                for (int valueIndex = 0; valueIndex < 1; valueIndex++) {

                    //Creates second group of cards
                    Card additionalCard = new Card((suit.get(suitIndex)), (rank.get(rankIndex)), (value.get(valueIndex)));

                    //Adds above cards to arrayList
                    deckOfCards.add(additionalCard);
                }

                //Prints
                int index = deckOfCards.size() - 1;
                deckOfCards.get(index).Print();
            }

            //For loop within suit loop that goes through Ace rank with 11 value for it
            for (int rankIndex = 4; rankIndex <= 4; rankIndex++) {
                for (int valueIndex = 1; valueIndex <= 1; valueIndex++) {


                    //Creates last group of cards
                    Card lastCard = new Card((suit.get(suitIndex)), (rank.get(rankIndex)), (value.get(valueIndex)));


                    //Adds above cards to arrayList
                    deckOfCards.add(lastCard);

                    // Prints
                    int index = deckOfCards.size() - 1;
                    deckOfCards.get(index).Print();
                }

            }

        }
        System.out.println(deckOfCards);
    }

}



