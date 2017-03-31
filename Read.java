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

public class Read
{
    static void Reed () throws IOException
    {
	BufferedReader reader = new BufferedReader (new FileReader ("ReadME.txt"));
	String[] Read = new String [100];
	int count = 0;
	String line = null;
	while ((line = reader.readLine ()) != null)
	{
	    Read [count] = (line);
	    System.out.println (Read [count] + " ");
	    count++;
	}
	reader.close ();
    }


    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#.##");
	Reed ();
    }
}
