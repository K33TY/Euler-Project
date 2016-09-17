         //----------------------------------------------------------------------//
        //----------------------------------------------------------------------//
       //  # Euler  #10                                                        //
      //                                                                      //
     //     Perk, Elizabeth                                                  //
    //                                                                      //
   //       Description:                                                   //
  //        Summation of primes below 2 million                           //
 /*----------------------------------------------------------------------//
 |/---------------------------------------------------------------------*/

import java.math.*;
import java.math.BigInteger;
import java.util.*;

public class Euler10v2
{
	
	public static boolean isPrime(int n)
	{
		for (int i = 2; i <= n/2; i++)
		{
			if (n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args)
	{
		BigInteger addedPrimes = BigInteger.ZERO;
		String primeString ="";
		
		for (int i = 2; i < 2000000; i++)
		{
			if (isPrime(i)) 
            {
                primeString = Integer.toString(i);
                double percent = (double)i / (double)20000;
                System.out.print(" Current progress is at: " + percent + "%\r");
			    BigInteger prime = new BigInteger(primeString);
			    addedPrimes = addedPrimes.add(prime);
            }
		}
        System.out.println();
		System.out.println("The final result is: " + addedPrimes);
	}
}