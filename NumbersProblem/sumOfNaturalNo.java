/*
Problem statement: Given a number ‘N’, find out the sum of the first N natural numbers.

Examples:

Example 1:
Input: N=5
Output: 15
Explanation: 1+2+3+4+5=15

Example 2:
Input: N=6
Output: 21
Explanation: 1+2+3+4+5+6=15


Time Complexity: O(N)
Space Complexity: O(1)
*/

import java.util.*;
class sumOfNaturalNo
{
    static void sumOfNaturalNO(int n)
    {
        int sum=0;
       for(int i=1;i<=n;i++)
       {
        sum += i;
       }
        System.out.println(sum);
       }
    

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        
        sumOfNaturalNO(n);
    }
}