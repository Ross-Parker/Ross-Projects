/*--------------------------------------------------------------------------------------*/
/*  u3RateOfPay - Will take hours and rates and tell you earnings                       */
/*                                                                                      */
/*--------------------------------------------------------------------------------------*/
/*  Author: Ross                                                                        */
/*  Date: 3/21/2017                                                                     */
/*--------------------------------------------------------------------------------------*/
/*  Input: Pay Rate, Hours, Overtime Rate                                               */
/*  Output: Earnings                                                                    */
/*--------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.*;
import java.text.*;

public class u3RateOfPay
{
    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#.##");
	double PayRate, Hours, OverRate, OverHours;

	System.out.print ("What is your rate of pay: $");
	PayRate = Double.parseDouble (stdin.readLine ());

	System.out.print ("How many hours have you worked: ");
	Hours = Double.parseDouble (stdin.readLine ());

	System.out.print ("What is your overtime rate: ");
	OverRate = Double.parseDouble (stdin.readLine ());

	System.out.print ("How many overtime hours have you worked: ");
	OverHours = Double.parseDouble (stdin.readLine ());

	System.out.print ("Your total payment is: $" + df.format ((PayRate * Hours) + ((PayRate * OverRate) * OverHours)));


    }
}


