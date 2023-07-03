/*
Check if a number is prime or not
Problem Statement: Given a number, check whether it is prime or not. A prime number is a natural number that is only divisible by 1 and by itself.

Examples 1 2 3 5 7 11 13 17 19 …

Examples:

Example 1:
Input: N = 3
Output: Prime
Explanation: 3 is a prime number

Example 2:
Input: N = 26
Output: Non-Prime
Explanation: 26 is not prime

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;
class isPrime
{
    static int isPrimeNo(int n)
    {
       int count=0;
       for(int i=1;i<=n;i++)
       {
        if(n%i == 0)
        {
            count++;
        }
       }
        return count;
    }
    public static void main(String args[])
    {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
             

        int count = isPrimeNo(n);
        if(count == 2)
        {
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }

    }
}

