import java.util.*;
import java.lang.*;
import java.io.*;
/* Stanley Galleta - FloodFill Exercise */
public class GalletaF1
{
	static int cases,m,n; 
	/* Recursive method for filling*/
	public static void fill(char[][] arr, int r, int c, char replace)
	{
		if (arr[r][c] == '.')
        {
            arr[r][c] = replace;
            fill(arr, r + 1, c, replace);
            fill(arr, r - 1, c, replace);
            fill(arr, r, c + 1, replace);
            fill(arr, r, c - 1, replace);      	
        }
	}
	/* Display method */
	private static void display(char[][] arr)
    {
        for (int i = 1; i < arr.length - 1; i++)
        {
            for (int j = 1; j < arr[i].length - 1; j++)
                System.out.print(arr[i][j] +" ");
            System.out.println();
        }
    }
	public static void main(String args[]) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		cases = scan.nextInt();
		for(int num = 0; num<cases; num++)
		{
			 m = scan.nextInt();
			 n = scan.nextInt();
			char[][] arr = new char[m + 2][n + 2];
        	for (int i = 0; i < m + 2; i++)  // populate extra border with walls
        	{
        		Arrays.fill(arr[i], '#');
        	}
        	for (int i = 1; i < m + 1; i++) // entering the grid into 2d array
        	{
            	for (int j = 1; j < n + 1; j++)
            	{
            		  arr[i][j] = scan.next().charAt(0);    
            	}
            }
      		int xr = scan.nextInt();
      	    int xc = scan.nextInt();
      	    char xre = scan.next().charAt(0);
 
        	if (arr[xr][xc] != '.') // if you start on a wall,exit.
       		 {
           		 System.exit(0);
       		 }
 
     	    GalletaF1 test = new GalletaF1();
        	test.fill(arr, xr, xc, xre);  
        	display(arr);    
		}

	}
}

