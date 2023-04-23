import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1_DataTypes {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
          int ei;
          double ed;
          String es;
        
        
        /* Read and save an integer, double, and String to your variables.*/
            
             ei=scan.nextInt();
             ed=scan.nextDouble();
             scan.nextLine();
             es=scan.nextLine();
            
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
        
        System.out.println(i+ei);

        /* Print the sum of the double variables on a new line. */
		System.out.println(d+ed);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        s=s.concat(es);
        System.out.println(s);
        scan.close();
    }
}