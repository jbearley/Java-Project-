package cardGame;

import java.util.Random;

public class Deck {
	private Card[] deck;
	private int top;
	public final static int card_num = 52;
	public Deck()
	{
		top = 0;
		//the card you pick up 
		int inc = 0;
		//allows to keep track of indexes in array
		char[] suits = new char[4];
		//suit array for giving value to suit index
		suits[0] = 's';
		suits[1] = 'h';
		suits[2] = 'd';
		suits[3] = 'c';
		deck = new Card[card_num];
		//Initializing the card class 
		for(int i = 0; i < 4; i++) {
			//iterate over the suits
			for(int j = 0; j < 13; j++) {
				//iterate over the ranks
				char a = suits[i];
				//changing the int to char for suits
				deck[inc] = new Card(j,a);
				//makes the new deck
				inc ++;
				//Iterates 
				}
			}
	}
	
	public void shuffle()
	{
		top = 0;
		//top starts at index 0
		int n;
		//variable used to swap places with unshuffled deck
		Random rand = new Random();
		//makes random number object
		for(int i=0; i < card_num; i++) {
			n = rand.nextInt(52);
			//makes random number
			swap(i,n);
			//swaps natural index with random number
			
		}
	}
	
	public Card draw()
	{
	    if (top < card_num) {
	    	top++;
	    	//increases top so it goes through the shuffled deck
	    	return deck[top];
	    	//returns card on top
	    }
	    else{
	    	System.exit(1);
	    	//ends system if reaches empty deck
	    }
	    return null;
	    //nothing because there are only two options
	}
	
	public boolean isEmpty()
	{
		if(top > card_num) {
			return true;
			//tells if there is any more cards
		}
		return false;
		
	}
	
	private void swap(int i, int j)	
	{
		 Card num = deck[i];
		 deck[i]=deck[j];
		 deck[j]= num;
		 //swaps i with j
	}
	
}