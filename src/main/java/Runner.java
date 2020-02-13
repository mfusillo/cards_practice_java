import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Runner {


    public static void main(String[] args){
        Deck deck = new Deck();
        deck.populateDeck(deck.getCards());
        Collections.shuffle(deck.getCards());
        System.out.println(deck.getCards().get(0).getRankType());
        System.out.println(deck.getCards().get(0).getSuitType());
    }

}
