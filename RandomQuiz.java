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

public class RandomQuiz
{
    static void Ask () throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	Random Rand = new Random ();
	int i = Rand.nextInt (500) + 1;
	int j = Rand.nextInt (500) + 1;
	System.out.print ("Solve: " + i + " + " + j + ": ");
	int input = Integer.parseInt (stdin.readLine ());
	if (input == (i + j))
	{
	    System.out.print ("Correct!\n");
	}
	else
	{
	    System.out.print ("Incorrect, the right answer is: " + (i + j) + "\n");
	}
    }


    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#.##");
	System.out.print ("How many Questions: ");
	int input = Integer.parseInt (stdin.readLine ());
	for (int i = 0 ; i < input ; i++)
	{
	    Ask ();
	}
    }
}


