import java.math.BigInteger;

/**
 * Created by Elizabeth Perk on 12/03/14.
 * Large non-Mersenne prime
 * 28433×2^7830457+1
 */

public class Euler097 {

    public static void main(String[] args)
    {
        BigInteger prime = new BigInteger("2");

            System.out.println("This may take some time to evaluate...");
            System.out.println("On my machine this took 11 minutes to finish.");

        System.out.println("Raising 2 to 7830457");
        prime = prime.pow(7830457);
        System.out.println("Multiplying with 28433");

            System.out.println("I was looking up the Karatsuba algorithm, but I was a little fuzzy as to how it worked.");
            System.out.println("Therefore, I'm not quite sure what would be the best way to implement it in this particular case.");

        prime = prime.multiply(new BigInteger("28433"));
        prime = prime.add(BigInteger.ONE);

        String primeString = prime.toString();
            System.out.println("The last 10 digits of the answer is: ");
        System.out.println(primeString.substring(primeString.length()-10, primeString.length()));
        // This will print 8739992577

    }
}
