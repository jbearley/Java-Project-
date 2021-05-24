package tweetlist;

import java.util.Scanner;

public class Tweet {
	private double lat, lon;
	private int year, month, day;
	private String time, text;
	
	public Tweet(String s)
	{
		Scanner scan = new Scanner(s);
		lat =scan.nextDouble();
		lat = Math.round(lat*10000)/10000;
		lon =scan.nextDouble();
		lon = Math.round(lon*10000)/10000;
		scan.next();
		String date = scan.next();
		String[]d = date.split("-");
		year = Integer.parseInt(d[0]);
		month = Integer.parseInt(d[1]);
		day = Integer.parseInt(d[2]);
		
		time = scan.next();
		text = scan.nextLine();

	}
	
	public void print()
	{
		System.out.println("Text: " + text);
		System.out.println("Location: " + lat + " " + lon);
		System.out.println("Date: " + day + "/" + month + "/" + year);
		System.out.println("Time: " + time);

	}
	
	public boolean textContains(String searchTerm)
	{
		return !(text.indexOf(searchTerm) == -1);
	}
}
