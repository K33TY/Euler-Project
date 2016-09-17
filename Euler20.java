import java.math.BigInteger;

/**
 * Created by liz on 12/4/14.
 * Sum of digits of 100!
 */

public class Euler20 {

    public static void main(String[] args)
    {
        BigInteger bigNum = new BigInteger("100");
        for (int i = 99; i > 0; i--)
        {
            bigNum = bigNum.multiply(new BigInteger(i+""));
        }
        String bigN = bigNum.toString();
        //System.out.println(bigN);
        int total = 0;
        for (int i = 0; i < bigN.length(); i++)
        {
            int n = bigN.charAt(i) - '0';
            total += n;
        }
        System.out.println(total);
    }
}

