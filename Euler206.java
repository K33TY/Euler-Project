
/**
 * Created by Elizabeth Perk on 12/04/14.
 * Find the unique positive integer whose square has the form 1_2_3_4_5_6_7_8_9_0,
 * where each “_” is a single digit.
 */
public class Euler206 {
    public static void main(String[] args)
    {
        boolean found = false;
        long i = 1L;


        if (found) System.out.println("The answer is: " + i + " which has the square form of " + integerSearch);
        //1389019170
    }
}

//integerSearch.compareTo(new BigInteger("1929394959697989990"))==-1

/*
   boolean found = false;
        BigInteger integerSearch = BigInteger.ONE;
        BigInteger i = new BigInteger("1000000000");
        while(!found)
        {
            System.out.println("Checking " + i + "...");
            integerSearch = i.multiply(i);
            String toCheck = integerSearch.toString();
            int k = 1;
            for (int j = 0; j < toCheck.length(); j+=2)
            {
                if (k>9) k = 0;
                int x = toCheck.charAt(j) - '0';
                if (x!=k)
                {
                    found = false;
                    break;
                }
                else { found = true; }
                k++;
            }
            if (found) break;
            i = i.add(BigInteger.ONE);
        }

        if (found) System.out.println("The answer is: " + i + " which has the square form of " + integerSearch);
        //1389019170
* */
