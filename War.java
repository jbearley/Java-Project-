package cardGame;

import java.io.IOException;

public class War extends Deck{
	public static void promptEnterKey(){
		try {
		System.in.read(new byte[2]);
		}
		catch (IOException e) {
		e.printStackTrace();
		}
		}
	//stops program for user
	
    public static void main(String[] args) {
    	Deck d = new Deck();
    	//creates a deck
    	int p1_p=0;
    	// player 1 points
    	int p2_p=0;
    	// player 1 points
    	int[] array_1 = new int[52];
    	// int array to college rank values of player 1
    	int[] array_2 = new int[52];
    	// int array to college rank values of player 2
    	d.shuffle();
    	//shuffles
   
    	
    	for(int i = 0;i < card_num; i++) {
    		Card p1c = d.draw();
    		//draws a card
    		int x = p1c.getRank();
    		//gets rank
    		array_1[i] = x;
    		//puts it into array for player 1
    	}
    	  
    	for(int i = 0;i < Deck.card_num; i++) {
    		Card p2c = d.draw();
    		//draws a card
   		 	int x = p2c.getRank();
   		    //gets rank
   		 	array_2[i]= x;
   		    //puts it into array for player 1
    	}
    	
    	
    	System.out.println("Enter");
    	for(int i =0; i < card_num; i++) {
    		promptEnterKey();
    		//prompts user
    		if(array_1[i] > array_2[i]) {
    			p1_p++;
    			//if rank player 1 is higher than 2
    		}
    		if(array_2[i] > array_1[i]) {
    			p2_p++;
    			//if rank player 2 is higher than 1
    		}
    		if(array_1[i] == array_2[i]) {
    			int k = i + 1;
    			//index increases 
    			int j = i + 2;
    			//index increases
    			if(array_1[k] > array_2[k]) {
    				p1_p = p1_p +2;
    				//if rank player 1 is higher than 2
    				i++;
    				//index increases because of war mode
    				
    			}
    			else if(array_2[k] > array_1[k]) {
    				p2_p = p1_p +2;
    				//if rank player 2 is higher than 1
    				i++;
    				//index increases because of war mode
    				
    			}
    			else if (array_1[k] == array_2[k]) {
    				if(array_1[j] > array_2[j]) {
    					p1_p = p1_p +2;
    					//if rank player 1 is higher than 2
    					i = i +2;
    					//index twice increases because of war mode
    				}
    				if(array_2[j] > array_1[j]) {
    					p2_p = p2_p +2;
    					//if rank player 2 is higher than 1
    					i = i +2;
    					//index twice increases because of war mode
    				}

    			}
    	System.out.print("your points" + p1_p);
    	System.out.print("the computer's points" + p2_p);
    		}
    	}
    }
}

