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

public class FindQuadrant
{
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#.##");
	String response;
	do
	{
	    System.out.print ("X value: ");
	    int x = Integer.parseInt (stdin.readLine ());
	    System.out.print ("Y value: ");
	    int y = Integer.parseInt (stdin.readLine ());
	    if (x > 0 && y > 0)
	    {
		System.out.print ("1st Quadrant\n");
	    }
	    else if (x > 0 && y < 0)
	    {
		System.out.print ("4th Quadrant\n");
	    }
	    else if (x < 0 && y < 0)
	    {
		System.out.print ("3rd Quadrant\n");
	    }
	    else if (x < 0 && y > 0)
	    {
		System.out.print ("2nd Quadrant\n");
	    }
	    else if (x == 0 || y == 0)
	    {
		System.out.print ("On Line\n");
	    }
	    System.out.print ("Again(Y/N): ");
	    response = stdin.readLine ();
	}
	while (response.equals ("Y") || response.equals ("y"));
    }
}


