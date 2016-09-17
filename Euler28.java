         //----------------------------------------------------------------------//
        //----------------------------------------------------------------------//
       //  CS 2 : # Euler  #28                                                 //
      //   Semester : # Fall 2014                                             //
     //                                                                      //
    //     Perk, Elizabeth                                                  //
   //                                                                      //
  //       Description:                                                   //
 //        Number Spiral Diagonals                                       //
/*----------------------------------------------------------------------//
|/---------------------------------------------------------------------*/

public class Euler28
{
	private static int rows = 1001;
	private static int cols = 1001;
	private static int[][] spiralNumbers = new int[rows][cols];		
	
	public static void fillArray()
	{
		int currentRow = (spiralNumbers.length/2);
		int currentCol = spiralNumbers[currentRow].length/2;
		int iteration = 1;
		int count = 1;
		int maxVal = rows * cols;
		
		spiralNumbers[currentRow][currentCol]=count;
		for (int j = 0; j<rows; j++) 
		{
			//go right
			for (int i=0; i<iteration; i++) 
			{
				currentCol++;
				count++;
				spiralNumbers[currentRow][currentCol]=count;
			}
			//go down
			for (int i=0; i<iteration; i++) 
			{
				currentRow++;
				count++;
				spiralNumbers[currentRow][currentCol]=count;
			}
			iteration++;
			//go left
			for (int i=0; i<iteration; i++) 
			{
				currentCol--;
				count++;
				spiralNumbers[currentRow][currentCol]=count;
			}
			//go up
			for (int i=0; i<iteration; i++) 
			{
				currentRow--;
				count++;
				spiralNumbers[currentRow][currentCol]=count;
			}
			iteration++;
			if (iteration > (rows-2)) break;
		}
		//last right
		for (int i=0; i<iteration-1; i++) 
		{
			currentCol++;
			count++;
			spiralNumbers[currentRow][currentCol]=count;
		}	
	}	
	
	public static int sum()
	{
		int sum = 0;
		int r = rows-1;
		int c = cols-1;
		for (int i=0; i<rows; i++)
		{
			sum += spiralNumbers[r][c];
			r--;
			c--;
		}
		r = rows-1;
		c = 0;
		for (int i=0; i<rows; i++)
		{
			if (r!=c)
			{
				sum += spiralNumbers[r][c];
			}
			r--;
			c++;
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		fillArray();
		System.out.println(sum());
		
	}
}