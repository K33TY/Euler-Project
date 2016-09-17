         //----------------------------------------------------------------------//
        //----------------------------------------------------------------------//
       //  CS 2 : # Euler  #42                                                //
      //   Semester : # Fall 2014                                             //
     //                                                                      //
    //     Perk, Elizabeth                                                  //
   //                                                                      //
  //       Description:                                                   //
 //        Digit canceling fractions                                     //
/*----------------------------------------------------------------------//
|/---------------------------------------------------------------------*/

import java.io.*;
import java.util.*;

public class Euler42
{	
	public static int[] triangleNumbers = new int[50];
	public static int count = 0;
	
	//Triangle number formula
	public static void fillTriangleNums()
	{
		int n = 1;
		for (int i = 0; i < 50; i++)
		{
			triangleNumbers[i] = n * (n + 1) / 2;
			n++;
		}
	}
	
	public static int charSum(String s)
	{
		int sum = 0;
		for (int i = 0; i < s.length(); i++)
		{
			//This gets the value of the char to numerical value from uppercase ascii
			int charVal = s.charAt(i) - 64;
			sum += charVal;
		}
		return sum;
	}
	
	public static void countTriangleNum(int x)
	{
		for (int i = 0; i < triangleNumbers.length; i++)
		{
			if (x == triangleNumbers[i]) 
			{
				count++;
				break;
			}
		}
	}
	
	public static void main(String[] args)
	{
		fillTriangleNums();
		if (args.length > 0) 
		{
			try
			{
				Scanner scan = new Scanner(new File(args[0]));
				scan.useDelimiter("\",\"|\"");
				while (scan.hasNext())
				{
					String word = scan.next();
					int wordVal = charSum(word);
					countTriangleNum(wordVal);
				}
			}
			catch (FileNotFoundException e)
			{
				System.out.println("Specified file could not be found.");
				System.exit(0);
			}
			System.out.println("The total number of triangle words in this file is " + count + " words.");
		}
		else
		{
			System.out.println("Proper usage is: java Euler42 <infile>");
		}
		
		
	}
}