import java.math.BigInteger;

/**
 * Created by Elizabeth Perk on 12/01/14.
 * Fibonacci Number with 1000 digits
 */
public class Euler025
{
    public static int fibTerm = 0;

    public static BigInteger findFibonacci()
    {
        BigInteger limit = (BigInteger.TEN).pow(999);
        BigInteger fibVal = BigInteger.ONE;
        BigInteger fibPrev = BigInteger.ONE;
        fibTerm = 2;
        while (fibVal.compareTo(limit) == -1)
        {
            BigInteger temp = fibVal.add(fibPrev);
            fibPrev = fibVal;
            fibVal = temp;
            fibTerm++;
        }
        return fibVal;
    }

    public static void main(String[] args)
    {
        BigInteger fib = findFibonacci();
        System.out.println("The first fibonacci term to have 1000 digits is " + fibTerm + "\n resulting in the value: " + fib);
    }
}
