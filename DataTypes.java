//Day 01
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        /* Declare second integer, double, and String variables. */
            int j = 0;
            double dd = 0.0;
            String ss = "";
            
        /* Read and save an integer, double, and String to your variables.*/
            j = scan.nextInt();
            dd = scan.nextDouble(); //scanner stays at the end of the double line
            ss = scan.nextLine(); //move scanner to next line
            ss = scan.nextLine(); //read in the line

        /* Print the sum of both integer variables on a new line. */
            System.out.println((i+j));
            
        /* Print the sum of the double variables on a new line. */
            System.out.println((d+dd));
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
            System.out.println(s + ss);

        scan.close();
    }
}
