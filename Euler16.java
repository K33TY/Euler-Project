import java.math.BigInteger;

/**
 * Created by liz on 12/4/14.
 * Sum of digits of 2^1000
 */

public class Euler16 {

    public static void main(String[] args)
    {
        BigInteger bigNum = new BigInteger("2").pow(1000);
        String bigN = bigNum.toString();
        int total = 0;
        for (int i = 0; i < bigN.length(); i++)
        {
            int n = bigN.charAt(i) - '0';
            total += n;
        }
        System.out.println(total);
    }
}

