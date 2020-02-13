import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
    }


    public int getSize() {
        return this.cards.size();
    }

    public ArrayList<Card> getCards(){
        return this.cards;
    }

    public void populateDeck(ArrayList<Card> cards){
        for (SuitType suit : SuitType.values()){
            for(RankType rank : RankType.values()){
                cards.add(new Card(suit, rank));
            }
        }
    }


    public Card dealCard() {
        Card dealtCard = getCards().remove(0);
        return dealtCard;
    }
}
