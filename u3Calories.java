/*--------------------------------------------------------------------------------------*/
/*                                                                                      */
/*                                                                                      */
/*--------------------------------------------------------------------------------------*/
/*  Author: Ross                                                                        */
/*  Date: March 28, 2017                                                                */
/*--------------------------------------------------------------------------------------*/
/*  Input: nothing                                                                      */
/*  Output: Calories                                                                    */
/*--------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.*;
import java.text.*;

public class u3Calories
{
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#.##");
	for (int i = 10 ; i <= 30 ; i += 5)
	{
	    System.out.print ("You will burn " + i * 4.2 + " in " + i + " minutes.\n");
	}
    }
}


