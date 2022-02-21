package com.company;

public class Card {
    private String suit;
    private String rank;
    private int value;

    //Constructor for creating card
    public Card (String suit, String rank, int value){
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }


    //Setters & Getters
    public void setSuit (String suit) {
        this.suit = suit;
    }
     public String getSuit(){
        return suit;
    }
    public void setRank (String rank) {
        this.rank = rank;
    }
    public String getRank() {
        return rank;
    }
    public void setValue (int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
