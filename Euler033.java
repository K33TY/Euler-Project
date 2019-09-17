         //----------------------------------------------------------------------//
        //----------------------------------------------------------------------//
       //  CS 2 : # Euler  # 33                                                //
      //   Semester : # LA LA LA                                              //
     //                                                                      //
    //     Perk, Elizabeth                                                  //
   //                                                                      //
  //       Description:                                                   //
 //        Digit canceling fractions!                                    //
/*----------------------------------------------------------------------//
|/---------------------------------------------------------------------*/

import java.io.*;
import java.util.*;

public class Euler033
{	
	public static int createNum(int a, int b)
	{
		String c = Integer.toString(a) + Integer.toString(b);
		return Integer.parseInt(c);
	}

	public static int testTerms(int i, int j, int k)
	{
		// four forms:
		int n = createNum(i, k);
		int d = createNum(j, k);
		if (reduce(i, j, n, d))
		{
			System.out.println(d);
			return d;
		}

		n = createNum(k, i);
		d = createNum(j, k);
		if (reduce(i, j, n, d))
		{
			System.out.println(d);
			return d;
		}

		n = createNum(k, i);
		d = createNum(k, j);
		if (reduce(i, j, n, d))
		{
			System.out.println(d);
			return d;
		}
		else return 1;
	}

	public static boolean reduce(int i, int j, int n, int d)
	{
		if (n == d)
		{
			return false;
		}
		if ((n % i == 0) && (d % j == 0))
		{
			if ((n/i) == (d/j))
			{
				System.out.println("i: " + i + " j: " + j);
				System.out.println("N: " + n + " D: " + d);
				return true;
			}
			else 
			{
				return false;
			}
		}
		return false;
	}

	  // Idea:	
	 //  At least one digit needs to be the same in numerator and denominator
	//   If that digit is removed, is the fraction still equal?
	public static void main(String[] args)
	{
		int numerator;
		int denominator;
		int product = 1;

		// Three different numbers at the same time:
		for (int i = 1; i < 10; i++)
		{
			for (int j = 1; j < 10; j++)
			{
				for (int k = 1; k < 10; k++)
				{
					if (i != k && j != k)
					{
						//System.out.println("i: " + i + " j: " + j + " k: " + k);
						product *= testTerms(i, j, k);
					}
				}
			}
		}

		System.out.println("The product is: " + product);
	}
}
