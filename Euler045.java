/*      Triangle 	  	Tn=n(n+1)/2 	  	1, 3, 6, 10, 15, ...
        Pentagonal 	  	Pn=n(3n−1)/2 	  	1, 5, 12, 22, 35, ...
        Hexagonal 	  	Hn=n(2n−1) 	  	    1, 6, 15, 28, 45, ...

        It can be verified that T285 = P165 = H143 = 40755.*/

import java.math.BigInteger;

/**
 * Created by Elizabeth Perk on 12/03/14.
 * Triangular, pentagonal, hexagonal, where for T(n), n > 285
 */

public class Euler045 {

    public static void main(String[] args)
    {
        boolean found = false;
        BigInteger i = BigInteger.ONE;
        BigInteger t = new BigInteger("285");
        BigInteger p = new BigInteger("165");
        BigInteger h = new BigInteger("143");
        BigInteger triang = i;
        BigInteger pentag = i;
        BigInteger hexag = i;
        BigInteger TWO = new BigInteger("2");
        BigInteger THR = new BigInteger("3");
        while (!found)
        {
            h = h.add(i);
            String z = "" + h;
            BigInteger hz = new BigInteger(z);
            hexag = ((TWO.multiply(hz)).subtract(BigInteger.ONE)).multiply(hz);
            //System.out.println("For n = " + h + "H(n)= " + hexag);

            while ((hexag.compareTo(pentag) == 1)|| (hexag.compareTo(pentag) == 0))
            {
                if (hexag.compareTo(pentag) == 0)
                {
                    while ((hexag.compareTo(triang) == 1) || (hexag.compareTo(triang) == 0))
                    {
                        if (hexag.compareTo(triang) == 0)
                        {
                            found = true;
                            System.out.println("For n = " + t + "T(n)= " + triang);
                            break;
                        }
                        else
                        {
                            t = t.add(i);
                            String x = "" + t;
                            BigInteger tx = new BigInteger(x);
                            triang = (tx.multiply(tx.add(BigInteger.ONE))).divide(TWO);
                            //t*(t+1)/2;

                        }
                    }
                }
                if (found) break;
                p = p.add(i);
                String y = "" + p;
                BigInteger py = new BigInteger(y);
                pentag = ((THR.multiply(py)).subtract(BigInteger.ONE)).multiply(py).divide(TWO);
                // p*((3*p) -1)/2;
                //System.out.println("For n = " + p + "P(n)= " + pentag);
            }
        }
    }
}
