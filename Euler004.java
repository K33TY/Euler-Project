           //----------------------------------------------------------------------//
          //----------------------------------------------------------------------//
         //  Euler 4                                                             //
        //   Semester : # Fall 2014                                             //
       //                                                                      //
      //     Perk, Elizabeth                                                  //
     //                                                                      //
    //       Description:                                                   //
   //        Finding the largest palindrone from a product                 //
  //        of two 3 digit numbers                                        //
 /*----------------------------------------------------------------------//
|/----------------------------------------------------------------------*/
public class Euler004 {
    public static boolean keepGoing = true;

    public static boolean check(int i)
    {
        int length = String.valueOf(i).length();
        int[] digits = new int[length];
        for (int j = 0; j < length; j++)
        {
            digits[j] = i % 10;
            i /= 10;
        }

        int end = digits.length-1;
        for (int j = 0; j < digits.length; j++)
        {
            if (digits[j] != digits[end]) return false;
            else
            {
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        int maxPalidrome = 0;
        int val1 = 0;
        int val2 = 0;
        for (int i = 999; i >= 1; i--)
        {
            int largeNum = 0;
            for (int j = 999; j >=1; j--) {
                largeNum = i * j;
                keepGoing = check(largeNum);
                if (!keepGoing) {
                    keepGoing = true;
                    continue;
                }
                if ((largeNum > maxPalidrome) && check(largeNum))
                {
                    maxPalidrome = largeNum;
                    val1 = i;
                    val2 = j;
                }

            }
        }
        System.out.println(maxPalidrome  + " = " + val1 + " * " + val2);
    }
}
