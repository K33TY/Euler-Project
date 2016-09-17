/**
 * Created by liz on 12/4/14.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Euler345 {


    public static String matrix  =
            "7  53 183 439 863 497 383 563  79 973 287  63 343 169 583 \n" +
            "627 343 773 959 943 767 473 103 699 303 957 703 583 639 913 \n" +
            "447 283 463  29  23 487 463 993 119 883 327 493 423 159 743 \n" +
            "217 623   3 399 853 407 103 983  89 463 290 516 212 462 350 \n" +
            "960 376 682 962 300 780 486 502 912 800 250 346 172 812 350 \n" +
            "870 456 192 162 593 473 915  45 989 873 823 965 425 329 803 \n" +
            "973 965 905 919 133 673 665 235 509 613 673 815 165 992 326 \n" +
            "322 148 972 962 286 255 941 541 265 323 925 281 601  95 973 \n" +
            "445 721  11 525 473  65 511 164 138 672  18 428 154 448 848 \n" +
            "414 456 310 312 798 104 566 520 302 248 694 976 430 392 198 \n" +
            "184 829 373 181 631 101 969 613 840 740 778 458 284 760 390 \n" +
            "821 461 843 513  17 901 711 993 293 157 274  94 192 156 574 \n" +
            "34 124   4 878 450 476 712 914 838 669 875 299 823 329 699 \n" +
            "815 559 813 459 522 788 168 586 966 232 308 833 251 631 107 \n" +
            "813 883 451 509 615  77 281 613 459 205 380 274 302  35 805 \n";

    public static Scanner scan = new Scanner(matrix);
    public static int[][] array = new int[15][15];
    public static ArrayList<Integer> rowsAvailable = new ArrayList<Integer>();
    public static ArrayList<Integer> colsAvailable = new ArrayList<Integer>();

    public static void main(String[] args)
    {
         for (int r = 0; r < array.length; r++)
         {
             for (int c = 0; c < array[r].length; c++)
             {
                 array[r][c] = scan.nextInt();
                 System.out.print(array[r][c] + " ");
             }
         }

        for (int i = 0; i < 15; i++)
        {
            rowsAvailable.add(i);
            colsAvailable.add(i);
        }

        int sum = 0;
        for (int i = 0; i < 15; i++)
        {
            int max = 0;
            int row = 0;
            int col = 0;
            for (int r = 0; r < array.length; r++)
            {
                if (!rowsAvailable.contains(r)) continue;
                for (int c = 0; c < array[r].length; c++)
                {
                    if (!colsAvailable.contains(c)) continue;
                    if (array[r][c] > max)
                    {
                        max = array[r][c];
                        row = r;
                        col = c;
                    }
                }
            }
            System.out.println(max);
            sum += max;
            int r = rowsAvailable.indexOf(row);
            int c = colsAvailable.indexOf(col);
            rowsAvailable.remove(r);
            colsAvailable.remove(c);
        }
        System.out.println(sum);

    }
}
