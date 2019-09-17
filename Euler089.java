import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Elizabeth Perk on 12/03/14.
 * Total characters saved by writing roman numerals properly
 */
public class Euler089 {

    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int totalCharsPre = 0;
        if (args.length == 1)
        {
            try {
                Scanner scan = new Scanner(new File(args[0]));
                while(scan.hasNextLine())
                {
                    String num = scan.nextLine();
                    int sum = 0;
                    totalCharsPre += num.length();
                    for (int i=0; i<num.length(); i++)
                    {
                        if (num.charAt(i) == 'M') sum += 1000;
                        if (num.charAt(i) == 'D') sum += 500;
                        if (num.charAt(i) == 'C')
                        {
                            if (i < num.length()-1)
                            {
                                if (num.charAt(i+1)=='D')
                                {
                                    sum += 400;
                                    i++;
                                }
                                else if (num.charAt(i+1)=='M')
                                {
                                    sum += 900;
                                    i++;
                                }
                                else sum += 100;
                            }
                            else sum += 100;
                        }
                        if (num.charAt(i) == 'L') sum += 50;
                        if (num.charAt(i) == 'X')
                        {
                            if (i < num.length()-1)
                            {
                                if (num.charAt(i+1)=='L')
                                {
                                    sum += 40;
                                    i++;
                                }
                                else if (num.charAt(i+1)=='C')
                                {
                                    sum += 90;
                                    i++;
                                }
                                else sum += 10;
                            }
                            else sum += 10;
                        }
                        if (num.charAt(i) == 'V') sum += 5;
                        if (num.charAt(i) == 'I')
                        {
                            if (i < num.length()-1)
                            {
                                if (num.charAt(i+1)=='V')
                                {
                                    sum += 4;
                                    i++;
                                }
                                else if (num.charAt(i+1)=='X')
                                {
                                    sum += 9;
                                    i++;
                                }
                                else sum += 1;
                            }
                            else sum += 1;
                        }
                    }
                    numbers.add(sum);
                }


                /*
                I = 1
                V = 5
                X = 10
                L = 50
                C = 100
                D = 500
                M = 1000 */
                //  Only one I, X, and C can be used as the leading numeral in part of a subtractive pair.
                //  I can only be placed before V and X.
                //  X can only be placed before L and C.
                //  C can only be placed before D and M.


                        scan.close();

                String newString = "";
                for (int i=0; i < numbers.size(); i++)
                {
                    int x = numbers.get(i);
                    while (x >= 1000)
                    {
                        x -= 1000;
                        newString += "M";
                    }
                    if (x >= 900)
                    {
                        x -= 900;
                        newString += "CM";
                    }
                    if (x >= 500)
                    {
                        x -= 500;
                        newString += "L";
                    }
                    if (x >= 400)
                    {
                        x -= 400;
                        newString += "CL";
                    }
                    while (x >= 100)
                    {
                        x -= 100;
                        newString += "C";
                    }
                    if (x >= 90)
                    {
                        x -= 90;
                        newString += "XC";
                    }
                    if (x >= 50)
                    {
                        x -= 50;
                        newString += "L";
                    }
                    if (x >= 40)
                    {
                        x -= 40;
                        newString += "XL";
                    }
                    while (x >= 10)
                    {
                        x -= 10;
                        newString += "X";
                    }
                    if (x >= 9)
                    {
                        x -= 9;
                        newString += "IX";
                    }
                    if (x >= 5)
                    {
                        x -= 5;
                        newString += "V";
                    }
                    if (x >= 4)
                    {
                        x -= 4;
                        newString += "IV";
                    }
                    while (x >= 1)
                    {
                        x -= 1;
                        newString += "I";
                    }
                }
                System.out.println("The total characters saved are " + (totalCharsPre - newString.length()));

            } catch (FileNotFoundException e) {}
        }
        else
        {
            System.out.println("Proper usages is java Euler89 <input>");
        }


    }
}
