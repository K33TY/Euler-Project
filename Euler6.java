           //----------------------------------------------------------------------//
          //----------------------------------------------------------------------//
         //  Euler 6                                                             //
        //   Semester : # Fall 2014                                             //
       //                                                                      //
      //     Perk, Elizabeth                                                  //
     //                                                                      //
    //       Description:                                                   //
   //        The difference of (1-100)^2 and (1^2-100^2)                   //
  /*----------------------------------------------------------------------//
 |/----------------------------------------------------------------------*/
public class Euler6 {

    public static void main(String[] args)
    {
        int sumOfSquares = 0;
        int sumSquared = 0;
        for (int i = 1; i<=100; i++)
        {
            sumOfSquares += (i*i);
            sumSquared += i;
        }
        sumSquared *= sumSquared;
        int result = sumSquared-sumOfSquares;
        System.out.println(sumSquared + " - " + sumOfSquares + " = " + result);
        System.out.println("The result is " + result);
    }
}
