/*
Name: Jacob Earley
3
Date: 4/12/2021
Description: Vending machine methods for inner transaction in the vending machine
Sources Cited: Adam Case
*/
package Vending;

public class VendingMachine implements VendingMachineInterface{
	private int Snickers;
	//num of snickers
	private int Twix;
	//num of twix
	private int Reeses;
	//num of reeses
	public int Cents;
	// amount of cents
	private int Zero;
	// null variable
	private int Snickers$ = 10;
	// snickers cost
	private int Twix$ = 10;
	//twix cost
	private int Reeses$ = 10;
	//reeses cost
	public int choice = -1;
	//choice of item listed by number(0-2)
	public VendingMachine(int s, int t, int r) {
		//constructing vending machine with number of item varaible
		Snickers = s;
		Twix = t;
		Reeses = r;
	}
	public void insertCents(int c) {
		Cents = c;
		//intialize cents 
		int p = Cents%5;
		// coin acceptance test if it is a coint divisible by 5 then you can input it into function 
		if (p != 0) {
			throw new ImproperCoinsException();
			//Doesn't pass test throw exception
		}
		/*
		 * The insertCents function takes an int c that represents a certain amount of cents and
		 * stores it in the machine.
		 * 
		 * Exception: An ImproperCoinsException is thrown if c is not a multiple of 5.
		 */
	}
	private int Count(int s) {
		//counts the number of items in vending machine
		if (s == 0) {
			return Snickers; 
		}
		if (s == 1) {
			return Twix; 
		}
		if (s == 2) {
			return Reeses; 
		}
		return Zero;
		
	}
	
	public void makeSelection(int s) {
		choice = s;
		//public variable used to keep track of choice
		if (choice != 0 && choice != 1  && choice != 2 ) {
			//if the selection chosen is not between(0-2) then throw exception
			throw new ImproperSelectionException();
		}
		if (choice == 0) {
			if (Count(s) <= 0) {
				//if there isn't enough items for you to make a selection an exception is thrown
				throw new ImproperSelectionException("Snickers");
			}
		}
		if (choice == 1) {
			if (Count(s) <= 0) {
				//if there isn't enough items for you to make a selection an exception is thrown
				throw new ImproperSelectionException("Twix");
			}
		}
		if (choice == 2) {
			if (Count(s) <= 0) {
				//if there isn't enough items for you to make a selection an exception is thrown
				throw new ImproperSelectionException("Reeses");
			}
		}
		/*
		 * The makeSelection function takes an int s that represents a selected item. There are only three items
		 * to purchase, so a customer can only select option 0, 1, or 2.
		 * 
		 * Exception: An ImproperSelectionException is thrown if s is not either a 0, 1, or 2.
		 * Exception: An ImproperSelectionException is thrown if the selected item s is sold out.
		 */
	}
	
	
	public int purchaseSelection() {
		if (choice == -1) {
			//if a purchase is made without a section throws an exception
			throw new ImproperPurchaseException();
		}
		if(choice ==0) {
			if (Cents >= Snickers$ ) {
				//if the cents is equal to or greater than the cost of item then you can purchase
				Cents = Cents - Snickers$;		
				//the cents difference between total to cost
			}
			else {
				throw new ImproperPurchaseException(Cents);
			}
		}
		if(choice == 1) {
			if (Cents >= Twix$ ) {
				//if the cents is equal to or greater than the cost of item then you can purchase
				Cents = Cents - Twix$;
				//the cents difference between total to cost

			}
			else {
				throw new ImproperPurchaseException(Cents);
			}
			
		}
		if(choice ==2) {
			if (Cents >= Reeses$ ) {
				//if the cents is equal to or greater than the cost of item then you can purchase
				Cents = Cents - Reeses$;
				//the cents difference between total to cost
			}
			else {
				throw new ImproperPurchaseException(Cents);
			}
			
		}
		return Cents;
		/*
		 * The purchaseSelection function makes the purchase that was selected after calling makeSelection. It returns
		 * the amount of cents that should be given back to the customer if he/she overpaid. 0 should be
		 * returned if the customer inserted the exact number of cents needed to make the purchase.
		 * 
		 * Exception: An ImproperPurchaseException is thrown if the customer has not yet selected an item.
		 * Exception: An ImproperPurchaseException is thrown if the customer has not yet inserted enough
		 * cents into the machine to make the purchase.
		 */
	}
	
	
	
	
	
	public int returnUnspentCents() {
		return Cents;
		//returning the cents after conversion done in purchase method
		/*
		 * The returnUnspentCents function returns the amount of unspent cents that were inserted into the machine.
		 */

	}
	
	public int getProfits(){
		int count = 0;
		//count for number of purchase and the attached cost of the item
		if(choice == 0) {
			count = count + Snickers$;
			return Snickers$ ;	
		}
		if(choice == 1) {
			count = count + Twix$;
			return Twix$;
		}
		if(choice == 2) {
			count = count + Reeses$;
			return Reeses$;
		}
		return count ;
		//placeholder
		/*
		 * The getProfits function returns the profits (in cents) that have been collected from customer purchases.
		 */
	}
	
	

}
