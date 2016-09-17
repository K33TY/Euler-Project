           //----------------------------------------------------------------------//
          //----------------------------------------------------------------------//
         //  Euler 7                                                             //
        //   Semester : # Fall 2014                                             //
       //                                                                      //
      //     Perk, Elizabeth                                                  //
     //                                                                      //
    //       Description:                                                   //
   //        Finding the 10001 prime number                                //
  /*----------------------------------------------------------------------//
 |/----------------------------------------------------------------------*/
public class Euler7
{
    public static int[] primes;

    public static boolean isPrime(int value, int i)
    {
        for (int j = i; j >= 0; j--)
        {
            if (value % primes[j] == 0) return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        primes = new int[10001];
        int value = 2;
        for (int i=0; i<primes.length; i++)
        {
            if (value == 2)
            {
                primes[i] = value;
                value++;
                continue;
            }
            while (!isPrime(value, i-1))
            {
                value++;
            }
            primes[i] = value;
        }
        System.out.println(primes[10000]);
    }
}
