//Given an integer. Write a program to reverse digits of a number.
// Examples: Input: N = 472  ,  Output: 274

import java.io.*;
class reverseNo
{
static private int Rev(int n)
{
	int d;
	int rev = 0;
	while (n != 0)
	{
		d = n % 10;
		rev = rev * 10 + d;
		n = n / 10;
	}

	return rev;
}
public static void main(String[] args)
{
	int n = 472;
	System.out.print("The reverse of the given number is: "+Rev(n));
}
}