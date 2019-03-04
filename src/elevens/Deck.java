package elevens;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
public class Deck{
	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards = new ArrayList<Card>();
	private int top;

   //make a Deck constructor
        public Deck(){
            //set top to the top of the deck 51
            top = 51;
            //loop through all suits                      
            for (String s : SUITS){
                //loop through all faces 1 to 13
                for(int i = 1;i<14;i++){
                    //add a new TwentyOneCard to the deck
                    cards.add(new BlackJackCard(s,i));
                }
            }      
        }
   
   //make a dealCard() method that returns the top card
        public Card dealCard(){
            Card t = cards.get(top);
            top--;
            return t;
        }
   //write a shuffle() method
        public void shuffle(){
            //use Colletions.shuffle
            Collections.shuffle(cards);
            
            top = 51;
        }
   	
}