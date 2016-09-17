import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;
/**
 * Created by Elizabeth Perk on 12/01/14.
 * Finding the shortest possible passcode derivation
 */
public class Euler79
{
    public static ArrayList<Integer> keys = new ArrayList<Integer>();
    public static ArrayList<Digit> digitsH = new ArrayList<Digit>();
    public static ArrayList<Digit> digitsT = new ArrayList<Digit>();
    public static ArrayList<Digit> digitsO = new ArrayList<Digit>();
    public static HashMap <Integer, Integer> parent = new HashMap<Integer, Integer>();
    public static HashMap <Integer, Integer> child = new HashMap<Integer, Integer>();

    static class Digit
    {
        Digit(int d) { digit = d; }

        private int digit;
        private Digit parent;
        private Digit child;

        public void setChild(Digit c) { child = c; }
        public void setParent(Digit p) { parent = p; }
        public void setDigit(int d) { digit = d; }
        public Digit getChild() { return child; }
        public Digit getParent() { return parent; }
        public int getDigit() { return digit; }
    }

    public static void separateDigits(int n)
    {
        int hundreds = n / 100;
        int ones = n % 10;
        int tens = (n % 100 - ones) / 10;
        Digit h = new Digit(hundreds);
        Digit t = new Digit(tens);
        Digit o = new Digit(ones);
        h.setChild(t);
        t.setChild(o);
        o.setParent(t);
        t.setParent(h);

        digitsH.add(h);
        digitsT.add(t);
        digitsO.add(o);
    //    System.out.println("hundred: " + hundreds);
    //    System.out.println("tens: " + tens);
    //    System.out.println("ones: " + ones);
    }

    public static void findParent()
    {
        for (int i = 0; i < digitsH.size(); i++)
        {
            if (digitsH.get(i).getParent() == NULL)
            {
                if (parent.containsKey(digitsH.get(i).getDigit()) parent.put(digitsH.get(i).getDigit(), parent.get(digitsH.get(i).getDigit()))+1);
                else parent.put(digitsH.get(i).getDigit(), 1);
            }
        }

    }

    public static void findChild()
    {
        for (int i = 0; i < digitsO.size(); i++)
        {
            if (digitsO.get(i).getChild() == NULL)
            {
                if (child.containsKey(digitsO.get(i).getDigit()) child.put(digitsO.get(i).getDigit(), child.get(digitsO.get(i).getDigit()))+1);
                else child.put(digitsH.get(i).getDigit(), 1);
            }
        }
    }

    public static void main(String[] args)
    {
        //Scanner scanLine;
        if (args.length == 1)
        {
            try {
                Scanner scan = new Scanner(new File(args[0]));
                while (scan.hasNextInt()) {
                    int key = scan.nextInt();
                //    System.out.println(key);
                    keys.add(key);
                    separateDigits(key);
                }
                scan.close();

            } catch (FileNotFoundException e) {}

            findParent();
            findChild();

            System.out.println("done");
        }
        else
        {
            System.out.println("Proper usages is java Euler79 <input>");
        }
    }
}
