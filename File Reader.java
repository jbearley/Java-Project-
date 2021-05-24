/*
 Name: Jacob Earley
Date: 2/25/21
Description: takes values from a file and derives menaing from the sums
Sources Cited: Catlyn Crow
 */
import java.io.*;
import java.util.Scanner;
public class Ketchup {

	/*public static int compare(String x, int hz,int h, int d, int s) {
		hz = 0;
		h = 0;
		d = 0;
		s = 0;
		if(x.equals("heinz")) {
			hz++;
		} else if(x.equals("hunts")) {
			h++;
		} else if(x.equals("delmonte")) {
			d++;
		} else {
			s++;
		}
		return h,;
	}*/

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File myFile = new File("ketchupData.txt");
		Scanner scan = new Scanner(myFile);
		scan.nextLine();
		//skips over first line
		int hz = 0;
		//number of heinz bought
		int h = 0;
		//number of hunts bought
		int d = 0;
		//number of delomonte bought
		int s = 0;
		//number of store brand bought
		double hz$ = 0;
		//the sum cost of heinz bought
		double h$ = 0;
		//the sum cost of hunts bought
		double d$ = 0;
		//the sum cost of delmonte bought
		double s$ = 0;
		//the sum cost of store brand bought
		while(scan.hasNext()) {
			String x = scan.next();
			
			if(x.equals("heinz")) {
				hz++;
				//number of heinz bought increases if the x = heinz
				double a = scan.nextDouble();
				hz$ = hz$ + a;
				//takes the cost at the time of the heinz and adds it to previous sum
				scan.nextLine();
			} else if(x.equals("hunts")) {
				h++;
				//number of hunts bought increases if the x = hunts
				scan.nextDouble();
				//skips over price that dont apply to brand
				double b = scan.nextDouble();
				h$ = h$ + b;
				//takes the cost at the time of the hunts and adds it to previous sum
				scan.nextLine();
			} else if(x.equals("delmonte")) {
				d++;
				//number of delmonte bought increases if the x = delmonte
				scan.nextDouble();
				scan.nextDouble();
				//skips over price that dont apply to brand
				double c = scan.nextDouble();
				d$ = d$ + c;
				//takes the cost at the time of the delmonte and adds it to previous sum
				scan.nextLine();
			} else {
				s++;
				//number of store brand bought increases if the x = store brand
				scan.nextDouble();
				scan.nextDouble();
				scan.nextDouble();
				//skips over price that dont apply to brand
				double e = scan.nextDouble();
				s$ = s$ + e;
				//takes the cost at the time of the store brand and adds it to previous sum
			}
		
		}
		System.out.println("The total number of Heinz bottles purchased " + hz);
		System.out.println("The total number of Hunts bottles purchased " + h);
		System.out.println("The total number of Delmonte bottles purchased " + d);
		System.out.println("The total number of STB bottles purchased " + s);
		System.out.println("The total amount of money made by selling Heinz bottles " + hz$);
		System.out.println("The total amount of money made by selling Hunts bottles " + h$);
		System.out.println("The total amount of money made by selling Delmonte bottles " + d$);
		System.out.println("The total amount of money made by selling STB bottles " + s$);		
		scan.close();

	}

}
