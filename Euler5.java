         //----------------------------------------------------------------------//
        //----------------------------------------------------------------------//
       //  CS 2 : # Euler  #5                                                  //
      //   Semester : # Fall 2014                                             //
     //                                                                      //
    //     Perk, Elizabeth                                                  //
   //                                                                      //
  //       Description:                                                   //
 //        Smallest Common Multiple of 1-20                              //
/*----------------------------------------------------------------------//
|/---------------------------------------------------------------------*/

import java.math.*;
import java.math.BigInteger;

public class Euler5
{

	public static int[] powers = new int[20];
	public static int[] factorSet = new int[20];
	
	public static void factor(int n)
	{
		boolean prime = true;
		for (int i = 2; i <= n ; i++)
		{
			if (n % i == 0) 
			{
				int x = n / i;
				factorSet[i-1]++;
				factor(x);
				prime = false;
				break;
			}
		}
		if (prime) factorSet[n-1]++;
		
		for (int i = 1; i < n; i++)
		{
			if (factorSet[i] > powers[i]) powers[i] = factorSet[i];
			factorSet[i] = 0;
		}
	}
	
	public static void main(String[] args)
	{
		for (int i = 1; i <= 20; i++)
		{
			factor(i);
		}
		
		BigInteger smallestMultiple = BigInteger.ONE;
		for (int i = 1; i <= 20; i++)
		{
			String factorString = Integer.toString((int)(Math.pow(i, powers[i-1])));
			BigInteger factor = new BigInteger(factorString);
			smallestMultiple = smallestMultiple.multiply(factor);
		}
		System.out.println(smallestMultiple);
	}
}