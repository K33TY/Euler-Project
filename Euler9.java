/*

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a^2 + b^2 = c^2

For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

*/

import java.util.ArrayList;

public class Euler9 {

    public static ArrayList<Integer> squares = new ArrayList<>();

    public static void main(String[] args)
    {
        // Get all the squares below 1000
        int x = 1;
        while (x < 1000) {
            squares.add(x * x);
            x++;
        }

        int product = 1;

        // Check for triplet
        for (int a = 1; a <= squares.size(); a++) {
            int a2 = squares.get(a-1);
            for (int b = a+1; b <= squares.size(); b++) {
                int b2 = squares.get(b-1);
                int c2 = a2 + b2;

                int c = squares.indexOf(c2) + 1;
                if (squares.contains(c2) && (a + b + c) == 1000) {
                    product = a * b * c;
                }
            }
        }

        System.out.println("The product of this pythagorean triplet is: " + product);
    }
}
