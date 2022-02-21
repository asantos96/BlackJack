package com.company;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    List<String> suit = new ArrayList<>();
    List<String> rank = new ArrayList<>();
    List<Integer> value = new ArrayList<>();

    public Deck () {

        // Assign each Card a Suit (Spades, Clubs, Diamond, and Heart)
        suit.add ("Spades");
        suit.add ("Clubs");
        suit.add ("Diamond");
        suit.add ("Heart");

        // Assigning each card a Rank (2-10, Jack, Queen, King, Ace)
        rank.add ("2");
        rank.add ("3");
        rank.add ("4");
        rank.add ("5");
        rank.add ("6");
        rank.add ("7");
        rank.add ("8");
        rank.add ("9");
        rank.add ("10");
        rank.add ("Jack");
        rank.add ("Queen");
        rank.add ("King");
        rank.add ("Ace");

        //Assigning each card a value to 2-11
        value.add (2);
        value.add (3);
        value.add (4);
        value.add (5);
        value.add (6);
        value.add (7);
        value.add (8);
        value.add (9);
        value.add (10);
        value.add (11);
    }

    //Deck should have a public method that “builds” an arraylist of Card objects
    //FOR LOOP POSSIBLE HERE

    }




