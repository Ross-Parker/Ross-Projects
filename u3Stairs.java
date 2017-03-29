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

public class u3Stairs
{
    static void make (int height) throws IOException
    {
	System.out.println ();
	for (int i = height ; i > 0 ; i--)
	{
	    for (int j = i ; j > 0 ; j--)
	    {
		System.out.print (" ");
	    }
	    System.out.print ("#\n");
	}
    }


    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#.##");
	System.out.print ("Height: ");
	int height = Integer.parseInt (stdin.readLine ());
	make (height);
    }
}


