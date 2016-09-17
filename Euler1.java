// Find the sum of all the multiples of 3 or 5 below 1000.

public class Euler1
{
    public static void main(String[] args)
    {
        int sum = 0;

        for (int i = 999; i > 0; i--)
        {
            if (i % 5 == 0)
            {
                sum += i;
            }
            else if (i % 3 == 0)
            {
                sum += i;
            }
        }
        
        System.out.println("The sum of all the multiples of 3 or 5 below 1000 is: " + sum);
    }
}