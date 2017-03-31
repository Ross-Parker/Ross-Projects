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
    static void Read () throws IOException
    {
	BufferedReader reader = new BufferedReader (new FileReader ("Divers.txt"));
	String[] Read = new String [100];
	String line = null;
	while ((line = reader.readLine ()) != null)
	{

	}

	reader.close ();
    }
}


public static void main (String str[]) throws IOException
{
    BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
    DecimalFormat df = new DecimalFormat ("#.##");

}
}


