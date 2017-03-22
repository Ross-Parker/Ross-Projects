/*--------------------------------------------------------------------------------------*/
/* Takes meal cost and service quality and ouputs total and tip                         */
/*                                                                                      */
/*--------------------------------------------------------------------------------------*/
/*  Author: Ross                                                                        */
/*  Date: March 22, 2017                                                                */
/*--------------------------------------------------------------------------------------*/
/*  Input: Meal and service quality                                                     */
/*  Output: Total and Tip                                                               */
/*--------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.*;
import java.text.*;

public class u3Tip
{
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#.##");
	double meal, tip;
	String serve;
	System.out.print ("How was your service (E/S/N): ");
	serve = stdin.readLine ();
	if (serve.equals ("E") || serve.equals ("e"))
	{
	    tip = 0.2;
	}
	else if (serve.equals ("S") || serve.equals ("s"))
	{
	    tip = 0.15;
	}
	else
	{
	    tip = 0.1;
	}
	System.out.print ("What was the cost of your meal: $");
	meal = Double.parseDouble (stdin.readLine ());
	System.out.print ("Your total is: $" + df.format (meal * 1.13) + "\nYour tip is: $" + df.format (meal * tip));
    }
}


