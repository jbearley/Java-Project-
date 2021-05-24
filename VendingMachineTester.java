package Vending;
import static org.junit.Assert.*;
import org.junit.Test;


public class VendingMachineTester {
	@Test(expected = ImproperCoinsException.class)
    public void testInsert() {
		VendingMachine vending = new VendingMachine(7,6,8);
		//Initializing vending object
		vending.insertCents(11);
		//vending is given a amount for cents that isn't divisible by 5
	}
	
	@Test(expected = ImproperSelectionException.class)
    public void testSelection1() {
		VendingMachine vending = new VendingMachine(7,6,8);
		//Initializing vending object
		vending.makeSelection(5);
		//makes a selection for an item number that doesn't exist
	}
	
	@Test(expected = ImproperSelectionException.class)
    public void testSelection2() {
		VendingMachine vending = new VendingMachine(0,6,8);
		//Initializing vending object with a item option without any available items
		vending.makeSelection(0);
		//selecting an item that isn't available 
	}
	
	@Test(expected = ImproperPurchaseException.class)
    public void testPurchase1() {
		VendingMachine vending = new VendingMachine(7,6,8);
		vending.purchaseSelection();
		//making a purchase without making a selection
	}
	
	@Test(expected = ImproperPurchaseException.class)
    public void testPurchase2() {
		VendingMachine vending = new VendingMachine(7,6,8);
		vending.insertCents(5);
		//Initializing a cent amount that has shorted amount
		vending.makeSelection(0);
		//making a selection
		vending.purchaseSelection();
		//making a purchase without having correct money
	}
	
	@Test
    public void centReturnTest1() {
		VendingMachine vending = new VendingMachine(7,6,8);
		vending.insertCents(10);
		//inserts a amount divisible by 5 and enough to buy
		vending.makeSelection(1);
		//make a selection
		vending.purchaseSelection();
		//purchase the selection
		int a= vending.returnUnspentCents();
		//returns the cents that you have after spending
		assertEquals(a,0);
		//the values equal
	}
	
	@Test
    public void centReturnTest2() {
		VendingMachine vending = new VendingMachine(7,6,8);
		vending.insertCents(10);
		//inserts a amount divisible by 5 and enough to buy
		vending.makeSelection(1);
		//make a selection
		int a = vending.returnUnspentCents();
		//return cents after not spending 
		assertEquals(a,10);
		//values  equal
	}
	
	@Test
    public void getProftTest() {
		VendingMachine vending = new VendingMachine(7,6,8);
		vending.insertCents(20);
		//inserts a amount divisible by 5 and enough to buy;
		vending.makeSelection(1);
		//make a selection
		vending.purchaseSelection();
		//purchase the selection
		vending.makeSelection(2);
		//make a selection
		vending.purchaseSelection();
		//purchase the selection
		int a = vending.getProfits();
		//get the profits 
		assertEquals(a,10);
		//values equal
		
	}
		
}


