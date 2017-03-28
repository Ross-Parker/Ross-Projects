/*--------------------------------------------------------------------------------------*/
/*   Says which rectangle is bigger after given input                                   */
/*                                                                                      */
/*--------------------------------------------------------------------------------------*/
/*  Author: Ross                                                                        */
/*  Date: March 23, 2017                                                                */
/*--------------------------------------------------------------------------------------*/
/*  Input: Length and width values                                                      */
/*  Output: Which  reactangle is larger                                                 */
/*--------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.*;
import java.text.*;

public class u3Rectangles
{

    static void input (double[] measure) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	for (int i = 0 ; i < 4 ; i++)
	{
	    System.out.print ("Measurement " + (i + 1) + ": ");
	    measure [i] = Double.parseDouble (stdin.readLine ());
	    if (measure [i] == 0)
	    {
		System.out.print ("Invalid\n");
		i--;
	    }
	}
    }


    public static void main (String str[])
	throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#.##");
	String response;
	do
	{
	    double[] measure = new double [4];
	    input (measure);
	    if ((measure [0] += measure [1]) > (measure [2] += measure [3]))
	    {
		System.out.print ("Rectangle 1 is larger");
	    }
	    else if ((measure [0] += measure [1]) == (measure [2] += measure [3]))
	    {
		System.out.print ("They are equal");
	    }
	    else
	    {
		System.out.print ("Rectangle 2 is larger");
	    }
	    System.out.print ("\nAgain(Y/N): ");
	    response = stdin.readLine ();
	}
	while (response.equals ("Y") || response.equals ("y"));
	System.exit (0);
    }
}


