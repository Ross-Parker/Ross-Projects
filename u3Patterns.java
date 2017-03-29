/*--------------------------------------------------------------------------------------*/
/*                                                                                      */
/*                                                                                      */
/*--------------------------------------------------------------------------------------*/
/*  Author: Ross                                                                        */
/*  Date:                                                                               */
/*--------------------------------------------------------------------------------------*/
/*  Input:                                                                              */
/*  Output: Scores                                                                      */
/*--------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.*;
import java.text.*;

public class u3Patterns
{
    static void make (int length, int width) throws IOException
    {
	for (int i = 0 ; i < length ; i++)
	{
	    for (int j = 0 ; j < width ; j++)
	    {
		System.out.print ("*");
	    }
	    System.out.println ();
	}
    }


    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#.##");
	System.out.print ("Length: ");
	int Length = Integer.parseInt (stdin.readLine ());
	System.out.print ("Width: ");
	int Width = Integer.parseInt (stdin.readLine ());
	make (Length, Width);
    }
}


