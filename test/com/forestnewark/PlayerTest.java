package com.forestnewark;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by forestnewark on 3/22/17.
 */
public class PlayerTest {

    @Test
    /**
     * Ensure that player can be instantiated
     */
    public void playerCanBeInstantiated() {
        Player player = new Player();
    }

    @Test
    /**
     * Player instantiated with an empty "Hand" array
     */
    public void playerInstantiatedWithEmptyHand() {
        Player player = new Player();
        assertThat(player.hand.count(),equalTo(0));
    }

    @Test
    /**
     * Player hand can hold a card
     */
    public void playerHandCanHoldACard() {
        Player player = new Player();
        player.hand.add(new Card(5,"Blue",null));
        assertThat(player.hand.count(),equalTo(1));
    }

}
