package tweetlist;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class TwitterListSearcher {
	public static void main(String[] args) {
	    TweetList list = new TweetList();
	    
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter in a filename: ");
	    String fname = myObj.next();
	    //create linked lists
	    
	    try
	    {
	    	
	    	FileReader file = new FileReader(fname);
	    	//file object create
	    	BufferedReader read = new BufferedReader(file);
	    	//create reader object from file reference
	    	String line;
	    	//variable made
	    	while ((line = read.readLine()) != null)
	    {
	    	//iterate through file until null
	    	Tweet obj = new Tweet(line);
			list.prepend(obj);
	    // Add tweets to your TweetList here
	    }
	    read.close();
	    // close reader object
	    }
	    catch (FileNotFoundException e)
	    //exception if file isn't found
	    {
	    System.out.println("The file " + fname + " has not been found.");
	    }
	    catch (IOException e)
	    //exception thrown if problem with reader
	    {
	    System.out.println("An error occurred while reading " + fname + ".");
	    }
	    
	    System.out.println("Enter in search term: ");
	    String search = myObj.next();
	    System.out.println("'"+search+ "'");
	    //search variable 
	    list.filter(search);
	    //filter with search variable
	    int size = list.size();
	    //size of linked listed after filter
	    System.out.println("Your search returned" + size +"results. You can do the following:");
	    System.out.println("0: Exit");
	    System.out.println("1: Print results");
	    System.out.println("2: Search within these results");
	    System.out.println("What would you like to do?");
	    int choice = myObj.nextInt();  // Read user input
	    while (choice != 0) {
	    	
	    	if(1 == choice) {
		    	list.print();
		    	//print new filtered list
		        int new_size = list.size();
			    System.out.println("Your search returned" + size +"results. You can do the following:");
	    	}
		    
		 
		    if( 2== choice) {
		    	System.out.print("Enter search term: ");
		    	search = myObj.next();  // Read user input
		    	list.filter(search);
		    	//filter with new search variable
		    	int new_size = list.size();
			    System.out.println("Your search returned" + new_size +"results. You can do the following:");
		    }
		    System.out.println("0: Exit");
		    System.out.println("1: Print results");
		    System.out.println("2: Search within these results");
		    System.out.println("What would you like to do?");
		    System.out.println("What would you like to do?");
		    choice = myObj.nextInt();  // Read user input
		    //get new choice 0-2
		    }
}
}
