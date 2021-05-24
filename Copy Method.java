/*
Name: Jacob Earley
Date: 2/11/2021
Description: This code takes in input value for 5 int, gives out the average as double in a text file
Sources Cited: Adam Case lecture videos
*/
import java.util.Scanner;
import java.io.*;
public class Average {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		int d;
		int e;
		PrintWriter x = new PrintWriter("average.txt");
		Scanner keyboard =  new Scanner(System.in);
		System.out.println("Please enter 5 integers seperated by spaces.");
		a = keyboard.nextInt();
		b = keyboard.nextInt();
		c = keyboard.nextInt();
		d = keyboard.nextInt();
		e = keyboard.nextInt();
		
		double average = (a+b+c+d+e)/5;
		x.print(a + ", ");
		x.print(b + ", ");
		x.print(c + ", ");
		x.print(d + ", ");
		x.println(e + ", ");
		x.println("The average is: " + average);
		keyboard.close();
		x.close();
		System.out.print("Done!");
		
	}

}
