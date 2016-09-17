import java.math.BigInteger;
import java.util.ArrayList;

public class Euler29
{
    public static ArrayList<BigInteger> values = new ArrayList<BigInteger>();

    public static int count;

    public static void addVal(BigInteger val)
    {
        System.out.println(val.toString());
        values.add(val);
        count++;
    }

    public static void main(String[] args)
    {
        count = 0;

        // Iterate through the range of values and raise to the power of the range of values
        // Base
        for (long i = 100; i > 1; i--)
        {
            // Reset list index for new base
            int index = 0;

            // Exponent
            for (int j = 100; j > 1; j--)
            {
                BigInteger val = BigInteger.valueOf(i).pow(j);
                if (values.size() > 0 )
                {
                    boolean exists = false;
                    // Loop through the values that are already in the list
                    for (int k = index; k < values.size(); k++)
                    {
                        if (val.compareTo(values.get(k)) == 0)
                        {
                            exists = true;
                            break;
                        }
                    } 
                    if (!exists)
                    {
                        addVal(val);
                    }
                }
                else
                {
                    addVal(val);
                }
            }
        }
        
        System.out.println("The total number of distinct values is: " + count);
    }
}