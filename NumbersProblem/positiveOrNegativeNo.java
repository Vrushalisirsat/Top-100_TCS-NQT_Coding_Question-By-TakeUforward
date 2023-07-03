/*
Problem statement: Given a number n check whether it’s positive or negative.
Examples:
Example 1:
Input: n=5
Output: Positive

Example2:
Input: n=-6
Output: Negative

*/

import java.util.*;
class positiveOrNegativeNo
{
    static void isPositiveOrNegativeNo(int n)
    {
       if(n >= 0)
       {
          System.out.println("Positive Number");
       }
       else{
        System.out.println("Negative Number");
       }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        
        isPositiveOrNegativeNo(n);
    }
}