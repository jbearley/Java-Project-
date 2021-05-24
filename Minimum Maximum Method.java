import java.io.*;
import java.util.Scanner;

public class MinMax {
   public static void main(String[] args) throws IOException {
      File myFile = new File("data.txt");
      Scanner inputFile = new Scanner(myFile);
      int max = 0;
      int min = 5;
      for(int i =0; i < 5; i++) {
    	  int line = inputFile.nextInt();
    	  if(line > max)
    		  max = line;
    	  if(line < min)
    		  max = line;
     		  
       }
      
      System.out.print(max);
	
      inputFile.close();
      PrintWriter outputFile = new PrintWriter("file_results.txt");
      outputFile.println("The maximum in data.txt is:"+ max);
      outputFile.print("The minimum in data.txt is:"+ min);
      outputFile.close();
      
   }
}
