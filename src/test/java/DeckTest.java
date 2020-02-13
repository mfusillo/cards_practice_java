import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;
    private Card card;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.getSize());
    }

    @Test
    public void deckHas52CardsAfterPopulatingIt() {
        deck.populateDeck(deck.getCards());
        assertEquals(52, deck.getSize());
    }

    @Test
    public void deckHas51CardsAfterOneCard(){
        deck.populateDeck(deck.getCards());
        Collections.shuffle(deck.getCards());
        deck.dealCard();
        assertEquals(51, deck.getSize());
    }

}
