package com.forestnewark;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;

/**
 * Created by forestnewark on 3/22/17.
 */
public class CardTest {

    @Test
    /**
     * Check to see that card object can be instantiated
     */
    public void checkThatCardObjectCanBeInstantiated() {
        Card card = new Card(0,"blue");
        assertThat(card,notNullValue());
    }

    @Test
    /**
     * Check that card is instantiated with a integer value
     */
    public void cardInstantiatedWithIntegerValue() {
        Card card = new Card(5,"yellow");
        assertThat(card.getValue(),equalTo(5));
    }

    @Test
    /**
     * Check that card is instantiated with color value
     */
    public void cardInstantiatedWithColorValue(){
        Card card = new Card(6,"Blue");
        assertThat(card.getColor(),equalTo("Blue"));
    }

    @Test
    /**
     * Check that card is instantiated with specialAbility
     */
    public void cardInstantiatedWithSpecialAbility() {
        Card card = new Card(7,"Red","DrawTwo");
        assertThat(card.getSpecial(),equalTo("DrawTwo"));
    }
}
