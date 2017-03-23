package com.forestnewark;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;

/**
 * Created by forestnewark on 3/22/17.
 */
public class DeckTest {

    @Test
    /**
     * Check that deck can be instantiated
     */
    public void checkThatDeckIsInstantiated(){
        Deck deck = new Deck();
        assertThat(deck,notNullValue());
    }

    @Test
    /**
     * Check that empty deck ArrayList is initialized
     */
    public void checkEmptyDeckArrayListInitialized() {
        Deck deck = new Deck();
        assertThat(deck.count(),equalTo(0));
    }


    @Test
    /**
     * Check that a card can be put into the deck
     */
    public void checkThatCardIsAddedToDeck() {
        Deck deck = new Deck();
        deck.add(new Card(5,"blue",null));
        assertThat(deck.count(),equalTo(1));
    }

    @Test
    /**
     * Load Deck should fill the deck with 108 cards
     */
    public void checkThatDeckHasAllCards() {
        Deck deck = new Deck();
        deck.load();
        System.out.println(deck.printDeck());
        assertThat(deck.count(),equalTo(108));
    }

    @Test
    /**
     * Ensure that Load deck and Shuffled Deck are different
     */
    public void checkThatShuffledDeckisDifferent(){
        Deck deck = new Deck();
        deck.load();
        String beforeShuffle = deck.printDeck();
        System.out.println(beforeShuffle);
        deck.shuffle();
        String afterShuffle = deck.printDeck();
        System.out.println(afterShuffle);
        assertThat(beforeShuffle,not(equalTo(afterShuffle)));
    }

}
