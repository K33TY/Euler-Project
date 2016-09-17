//======================================================================
// CS 2 : # Euler Problem 3
// Semester : # Fall 2014
//
// # Perk, Elizabeth
//
// Description:
// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143
//======================================================================

import java.math.BigInteger;

public class Euler3
{
	public BigInteger TWO = new BigInteger("2");
		
	public static int primeOrDivide(int largeNumber)
	{
		int largestPrime = 1;
		for (int i = 1; i<= largeNumber; i++)
		{
			if (largeNumber % i == 0) 
			{
				largeNumber= largeNumber/i;
				largestPrime = i;
			}
		}
		return largestPrime;
	}
	
	public static BigInteger primeOrDivide(BigInteger largeNumber, BigInteger secondLargestPrime)
	{
		for (BigInteger i = BigInteger.ONE; i.compareTo(largeNumber) < 0; i = i.add(BigInteger.ONE))
		{
			if (largeNumber.mod(i) == BigInteger.ZERO) 
			{
				largeNumber = largeNumber.divide(i);
				secondLargestPrime = i;
			}
		}
		return largeNumber;
	}
	
	public static void main(String[] args)
	{
		System.out.print("The largest prime factor of the number 13195 is ");
		System.out.println(primeOrDivide(13195));
		System.out.print("The largest prime factor of the number 600851475143 is ");
		System.out.println(primeOrDivide(new BigInteger ("600851475143"), BigInteger.ONE));
	}
}