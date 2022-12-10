package war;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  
    ArrayList<Card> deck = new ArrayList<>();
    
    public Deck() {
      deck = new ArrayList<Card>();
      
      
      //new deck = total of 52 cards
      //for loop to increase each card beginning from 2-14/2-Ace(Rank) and the suit.
      for(int i=2; i<15; i++) {
        deck.add(new Card(i, "Spades"));
        deck.add(new Card(i, "Hearts"));
        deck.add(new Card(i, "Diamonds"));
        deck.add(new Card(i, "Clubs"));
      }
    }
    
    
    //Shuffles the deck
    public void shuffle() {
      Collections.shuffle(deck);
    }
    
    //removes the card after it is drawn
    public Card drawCard() {
      return deck.remove(0);
    }
    
  
    
    
}