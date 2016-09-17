         //----------------------------------------------------------------------//
        //----------------------------------------------------------------------//
       //  CS 2 : # Euler  #17                                                 //
      //   Semester : # Fall 2014                                             //
     //                                                                      //
    //     Perk, Elizabeth                                                  //
   //                                                                      //
  //       Description:                                                   //
 //        Number Letter Counting                                        //
/*----------------------------------------------------------------------//
|/---------------------------------------------------------------------*/

public class Euler17
{
	private static int[] numLetters = new int[1001];
	private static String[] numStrings = new String[1001];
	private static String[] words = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
								"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", 
								"seventeen", "eighteen", "nineteen", "twenty", "thirty", "forty", "fifty",
								"sixty", "seventy", "eighty", "ninety", "hundred"};
								
	public static void fillNumLetters (int n)
	{
		for (int i = 0; i <= n; i++)
		{
			if (i <= 20) numStrings[i] = words[i];
			else if (i > 20 && i < 100) 
			{
				int tens = i/10; 
				int ones = i%10;
				numStrings[i] = words[20 + tens - 2] + words[ones];	
			}
			else if (i >= 100 && i < 1000) 
			{
				int hundreds = i/100;
				int tens = (i - (hundreds * 100))/10;
				int underTwenty = i%100;
				int ones = (i - (hundreds * 100))%10;
				//System.out.println(i + " hundreds: " + hundreds + " tens: " + tens + " ones:" + ones);
				if (tens == 0 && ones == 0) numStrings[i] = words[hundreds] + "hundred";
				else if ((tens == 2 && i == 0 ) || tens < 2) numStrings[i] = words[hundreds] + "hundredand" + words[underTwenty];
				else numStrings[i] = words[hundreds] + "hundredand" + words[20 + tens - 2] + words[ones];
				
			}
			else if (i == 1000) numStrings[i] = "onethousand";
		}
	}

	public static int countLetters(int n)
	{
		int totalLetters = 0;
		for (int i = 1; i <= n; i++)
		{
			numLetters[i] = numStrings[i].length();
			//System.out.println(numStrings[i] + " contains this many letters: " + numLetters[i]);
			totalLetters += numLetters[i];
		}
		return totalLetters;
	}							
	
	public static void main(String[] args)
	{
		fillNumLetters(1000);
		System.out.println(countLetters(1000));
	}
}