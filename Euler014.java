/**
 * Created by Elizabeth Perk on 11/30/14.
 * First triangle number with 500 divisors
 */
public class Euler014
{
    public static int findTriangle()
    {
        boolean notTheOne = true;
        int i = 1;
        int sum = 0;
        while (notTheOne)
        {
            sum += i;
            if (i%15 == 0) System.out.println("Checking divisors for " + i + ". We'll see...");
            notTheOne = (!check(sum));
            i++;
        }
        return sum;
    }

    public static boolean check(int n)
    {
        int countDivisors = 1;
        for (int i = 2; i < n; i++)
        {
            if (n%i == 0)
            {
                countDivisors++;
            }
        }
        if (countDivisors == 500) return true;
        else return false;
    }

    public static void main(String[] args)
    {
        System.out.println("Triangle number with 500 divisors is " + findTriangle());
    }
}
