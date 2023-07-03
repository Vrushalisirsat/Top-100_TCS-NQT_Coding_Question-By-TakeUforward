// Given a number N, print the smallest and largest digits present in the number.
//Examples:
//Input: N = 2746
//Output: Largest digit: 7  ,  Smallest digit: 2

//Time Complexity: O(log N)
//Space Complexity: O(1)


import java.util.*;
class maxMinDigitNo
{
static void maxMinNo(int n)
{
	int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    int d;
	int rev = 0;
	while (n != 0)
	{
		d = n % 10;
        max = Math.max(max,d);
		min = Math.min(min,d);
		n = n / 10;
	}
    System.out.println("Largest Digit = " + max);
    System.out.println("Smallest Digit = " + min);
}
public static void main(String[] args)
{
	int n = 472;
	maxMinNo(n);
}
}