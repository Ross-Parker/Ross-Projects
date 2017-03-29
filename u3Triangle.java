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

public class u3Triangle
{
    static void make (int height) throws IOException
    {
	for (int i = 0 ; i <= height ; i++)
	{
	    for (int j = 0 ; j < i ; j++)
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
	System.out.print ("Height: ");
	int height = Integer.parseInt (stdin.readLine ());
	make (height);

    }
}


