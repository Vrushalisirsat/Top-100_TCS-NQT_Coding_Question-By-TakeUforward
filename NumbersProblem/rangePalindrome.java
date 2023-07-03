/*
Problem Statement: Given a range of numbers, find all the palindrome numbers in the range.
Note: A palindromic number is a number that remains the same when its digits are reversed.OR  a palindrome is a number that reads the same forward and backward Eg: 121,1221, 2552
Examples:
Example 1:
Input: min = 10 , max = 50
Output: 11 22 33 44 
Explanation: 11, 22, 33, 44 will remain the same when they read from forward or backward.

Example2:
Input: min = 100 , max = 150
Output: 101 111 121 131 141 
Explanation: 11, 22, 33, 44 will remain the same when they read from forward or backward.

*/

import java.util.*;
class rangePalindrome
{
    static boolean isPalindrome(int n)
    {
        int rev=0;
        int m=n;
        while(n > 0)
        {
            int rem = n%10;
            rev = (rev * 10) + rem;
            n = n/10;
        }

        if(rev == m)
          return true;
        else
          return false; 
       }
        
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a start range.");
        int start = sc.nextInt();
        System.out.println("Enter a last range.");
        int end = sc.nextInt();  

        for(int i=start;i<=end;i++)
        {
          if(isPalindrome(i))
          {
            System.out.print(i + " ");
          }
        }

    }
}