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

public class ShiftySum
{

    static void Run (int N) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	int total = N;
	System.out.print ("K=");
	int K = Integer.parseInt (stdin.readLine ());
	for (int i = K ; i > 0 ; i--)
	{
	    N *= 10;
	    total += N;
	}
	System.out.print (total);
    }


    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#.##");
	System.out.print ("N=");
	int N = Integer.parseInt (stdin.readLine ());
	Run (N);
    }
}


