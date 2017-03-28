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
public class ExactlyElectrical
{
    public static int total = -1;
    static void Convert (String Pos, int[] pos) throws IOException
    {
	int split = Pos.indexOf (",");
	int x = Integer.parseInt (Pos.substring (0, split));
	int y = Integer.parseInt (Pos.substring (split + 1));
	total += 1;
	pos [total] = x;
	total += 1;
	pos [total] = y;
    }


    static void Check (int[] pos, int fuel, boolean foobar) throws IOException
    {
	double check = pos [0] / fuel;
	double check1 = fuel / pos [0];
	if (Math.floor (check) - check == 0)
	{
	    System.out.print ("Yes");
	}
	else if (Math.floor (check1) - check1 == 0)
	{
	    System.out.print ("Yes");
	}
    }


    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#.##");
	boolean foobar = false;
	int[] pos = new int [10];
	System.out.print ("Start Co-ordinate (eg. X,Y): ");
	String Start = stdin.readLine ();
	Convert (Start, pos);
	System.out.print ("End Co-ordinate (eg. X,Y): ");
	String Finish = stdin.readLine ();
	Convert (Finish, pos);
	pos [0] -= pos [2];
	pos [1] -= pos [3];
	pos [0] += pos [1];
	System.out.print ("How many units of fuel do yo have: ");
	int fuel = Integer.parseInt (stdin.readLine ());
	Check (pos, fuel, foobar);
    }
}


