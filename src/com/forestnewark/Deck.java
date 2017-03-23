package com.forestnewark;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by forestnewark on 3/22/17.
 */
public class Deck {

    private ArrayList<Card> deck;

    public Deck(){
        deck = new ArrayList<>();
    }

    public void add(Card card) {
        deck.add(card);
    }


    public int count() {
        return deck.size();
    }

    public void load() {
        //Load Blue Value Cards
        for(int x = 0; x <= 12;x++) {
            if(x == 0) {
                deck.add(new Card(x,"Blue",null));
            }
            if(x <= 9 && x>0) {
                deck.add(new Card(x, "Blue", null));
                deck.add(new Card(x, "Blue", null));
            }
            if(x == 10) {
                deck.add(new Card(x,"Blue","DrawTwo"));
                deck.add(new Card(x,"Blue","DrawTwo"));
            }
            if(x == 11) {
                deck.add(new Card(x,"Blue", "Reverse"));
                deck.add(new Card(x,"Blue", "Reverse"));
            }
            if(x == 12) {
                deck.add(new Card(x,"Blue","Skip"));
                deck.add(new Card(x,"Blue","Skip"));

            }
        }
        //Load Green Value Cards
        for(int x = 0; x <= 12; x++) {
            if(x == 0) {
                deck.add(new Card(x,"Green",null));
            }
            if(x <= 9 && x>0) {
                deck.add(new Card(x, "Green", null));
                deck.add(new Card(x, "Green", null));
            }
            if(x == 10) {
                deck.add(new Card(x,"Green","DrawTwo"));
                deck.add(new Card(x,"Green","DrawTwo"));
            }
            if(x == 11) {
                deck.add(new Card(x,"Green", "Reverse"));
                deck.add(new Card(x,"Green", "Reverse"));
            }
            if(x == 12) {
                deck.add(new Card(x,"Green","Skip"));
                deck.add(new Card(x,"Green","Skip"));

            }
        }
        //Load Yellow Value Cards
        for(int x = 0; x <= 12; x++) {
            if(x == 0) {
                deck.add(new Card(x,"Yellow",null));
            }
            if(x <= 9 && x>0) {
                deck.add(new Card(x, "Yellow", null));
                deck.add(new Card(x, "Yellow", null));
            }
            if(x == 10) {
                deck.add(new Card(x,"Yellow","DrawTwo"));
                deck.add(new Card(x,"Yellow","DrawTwo"));
            }
            if(x == 11) {
                deck.add(new Card(x,"Yellow", "Reverse"));
                deck.add(new Card(x,"Yellow", "Reverse"));
            }
            if(x == 12) {
                deck.add(new Card(x,"Yellow","Skip"));
                deck.add(new Card(x,"Yellow","Skip"));

            }
        }
        //Load Red Value
        for(int x = 0; x <= 12; x++) {
            if(x == 0) {
                deck.add(new Card(x,"Red",null));
            }
            if(x <= 9 && x>0) {
                deck.add(new Card(x, "Red", null));
                deck.add(new Card(x, "Red", null));
            }
            if(x == 10) {
                deck.add(new Card(x,"Red","DrawTwo"));
                deck.add(new Card(x,"Red","DrawTwo"));
            }
            if(x == 11) {
                deck.add(new Card(x,"Red", "Reverse"));
                deck.add(new Card(x,"Red", "Reverse"));
            }
            if(x == 12) {
                deck.add(new Card(x,"Red","Skip"));
                deck.add(new Card(x,"Red","Skip"));

            }
        }

        //Load Wild Cards
        for (int x = 0; x < 8; x++) {
            if(x < 4) {
                deck.add(new Card(13,null,"Wild"));
            }
            if(x >= 4) {
                deck.add(new Card(13,null,"WildDraw4"));
            }
        }

    }

    public String printDeck() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deck Printout");
        sb.append("\n");
        for(Card card:deck) {
            sb.append("Value: ");
            sb.append(card.getValue());
            sb.append(" Color: ");
            sb.append(card.getColor());
            sb.append(" Special: ");
            sb.append(card.getSpecial());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void shuffle() {
        Collections.shuffle(deck);
        Collections.shuffle(deck);
        Collections.shuffle(deck);
    }
}
