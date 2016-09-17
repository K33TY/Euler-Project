import java.math.BigInteger;

/**
 * Created by Elizabeth Perk on 12/03/14.
 * Sum of self powers
 */
public class Euler48 {

    public static void main(String[] args)
    {
        BigInteger sum = BigInteger.ZERO;
        for( int i = 1000; i >= 1; i--)
        {
            String n = "" + i;
            BigInteger iter = new BigInteger(n);
            iter = iter.pow(i);
            sum = sum.add(iter);
        }
        String answer = sum.toString();
        System.out.println(answer.substring(answer.length()-10, answer.length()));
    }
}
