package com.forestnewark;

/**
 * Created by forestnewark on 3/22/17.
 */
public class Card {

    private String color;
    private int value;
    private String special;


    public Card(int value,String color,String special) {
        this.value = value;
        this.color = color;
        this.special = special;
    }

    public Card(int value,String color) {
        this.color = color;
        this.value = value;
    }

    public int getValue() {

        return value;

    }

    public String getColor() {
        return color;
    }

    public String getSpecial() {
        return special;

    }
}
