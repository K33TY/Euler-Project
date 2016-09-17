import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Elizabeth Perk on 12/03/14.
 * Route with max sum
 */
public class Euler18 {

    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> lines = new ArrayList<ArrayList<Integer>>();
        if (args.length == 1)
        {
            try {
                Scanner scan = new Scanner(new File(args[0]));
                Scanner scanLine;
                while (scan.hasNextLine()) {
                    String line = scan.nextLine();
                    scanLine = new Scanner(line);
                    ArrayList<Integer> intLine = new ArrayList<Integer>();
                    while (scanLine.hasNextInt())
                    {
                        intLine.add(scanLine.nextInt());
                    }
                    lines.add(intLine);
                }
                scan.close();

                int sum = lines.get(0).get(0);
                System.out.println(sum);
                int pointer = 0;
                for (int i = 1; i < lines.size(); i++)
                {
                    int num = 0;
                    if (lines.get(i).get(pointer) > lines.get(i).get(pointer+1))
                    {
                        if ((pointer>0) && (lines.get(i).get(pointer-1) > lines.get(i).get(pointer)))
                        {
                            num += lines.get(i).get(pointer-1);
                            pointer--;
                        }
                        else num += lines.get(i).get(pointer);
                    }
                    else if ((pointer>0) && (lines.get(i).get(pointer-1) > lines.get(i).get(pointer)))
                    {
                        num += lines.get(i).get(pointer-1);
                        pointer--;
                    }
                    else
                    {
                        num += lines.get(i).get(pointer+1);
                        pointer++;
                    }
                    System.out.println(num);
                    sum += num;
                }
                System.out.println(sum);


            } catch (FileNotFoundException e) {}
        }
        else
        {
            System.out.println("Proper usages is java Euler18 <input>");
        }
    }
}
