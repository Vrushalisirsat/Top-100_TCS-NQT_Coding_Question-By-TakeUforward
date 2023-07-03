/*
Check whether a given number is even or odd
Problem Statement: Given a number n, check whether a given number is even or odd.

Examples:

Example 1:
Input: n=5
Output: odd
Explanation: 5 is not divisible by 2.
 
Example 2:  
Input: n=6
Output: even
Explanation: 6 is divisible by 2.


Time complexity: O(1)
Space Complexity: O(1)
*/


import java.util.*;
class evenOddNo
{
    static void isNOisEvenOrOdd(int n)
    {
       if(n%2 == 0)
       {
          System.out.println("Even Number");
       }
       else{
        System.out.println("Odd Number");
       }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        
        isNOisEvenOrOdd(n);
    }
}