/*
Given an integer, find the sum of digits of that integer.
Examples:
Example 1:
Input: N = 472
Output: 13
Explanation: The digits in the number are 4,7 and 2. Summing them up gives us a value of 13

Time Complexity: O(N), N is the no. of digits
Space Complexity: O(1)
*/

import java.io.*;
class Test
{
static private int getSum(int n)
{
	int d;
	int sum = 0;
	while (n != 0)
	{
		d = n % 10;
		sum += d;
		n = n / 10;
	}
	return sum;
}
public static void main(String[] args)
{
	int n = 472;
	System.out.print("Sum of digits of the given number is "+getSum(n));
}
}

