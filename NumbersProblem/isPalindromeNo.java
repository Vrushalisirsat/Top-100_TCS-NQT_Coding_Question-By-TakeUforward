/*
Problem Statement:  Given a number check if it is a palindrome.
An integer is considered a palindrome when it reads the same backward as forward.
Examples:
Example 1:
Input: N = 123
Output: Not Palindrome Number
Explanation: 123 read backwards is 321.Since these are two different numbers 123 is not a palindrome.

Example 2:
Input: N =  121 
Output: Palindrome Number
Explanation: 121 read backwards as 121.Since these are two same numbers 121 is a palindrome.


Time Complexity: O(logN) for reversing N digits of input integer.
Space Complexity: O(1)

*/

import java.util.*;
class isPalindromeNo
{
    static int isPalindrome(int n)
    {
       int rev=0;
        while(n > 0)
        {
            int rem = n%10;
            rev = (rev * 10) + rem;
            n = n/10;
        }
        return rev;
    }
    public static void main(String args[])
    {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int m = n;        

        int rev = isPalindrome(n);
        if(rev == m)
        {
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }

    }
}