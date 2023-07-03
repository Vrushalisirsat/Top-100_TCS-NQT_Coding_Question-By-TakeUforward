/*
Problem Statement: Given a and b, find prime numbers in a given range [a,b], (a and b are included here).
Examples:
Examples:
Input: 2 10
Output: 2 3 5 7 
Explanation: Prime Numbers b/w 2 and 10 are 2,3,5 and 7.

Example 2:
Input: 10 16
Output: 11 13 
Explanation: Prime Numbers b/w 10 and 16 are 11 and 13.

*/

import java.util.*;
class rangePrimeNo
{
    static boolean isPrimeNo(int n)
    {
       int count=0;
       for(int i=1;i<=n;i++)
       {
        if(n%i == 0)
        {
            count++;
        }
       }
       if(count == 2)
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
          if(isPrimeNo(i))
          {
            System.out.print(i + " ");
          }
        }
    }
}

