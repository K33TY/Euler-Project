import java.math.BigInteger;

/**
 * Created by liz on 12/5/14.
 * Sum of all amicable numbers under 10000
 */

public class Euler21 {

    public static void main(String[] args)
    {
        int totalSum = 0;
        for (int i = 10000; i > 0; i--)
        {
            int amicable = 0;
            int pair = 0;
            for (int j = 1; j < i; j++)
            {
                if (i%j==0)
                {
                    amicable += j;
                }
            }
            for (int k = 1; k < amicable; k++)
            {
                if (amicable%k == 0)
                    pair += k;
            }
            if ((pair == i) && (amicable != pair)) {totalSum += i;
            }
        }

        System.out.println(totalSum);
    }
}

