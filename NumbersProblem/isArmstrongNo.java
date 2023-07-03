/*
Problem Statement: Given a number, check if it is Armstrong Number or Not.

Examples:

Example 1:
Input:153 
Output: Yes, it is an Armstrong Number
Explanation: 1^3 + 5^3 + 3^3 = 153

Input:170 
Output: No, it is not an Armstrong Number
Explanation: 1^3 + 7^3 + 0^3 != 170

*/

import java.util.*;
class isArmstrongNo
{
    static int isArmstrongNo(int n)
    {
       int rev=0;
       while(n > 0)
       {
        int rem = n%10;
        rev += (rem*rem*rem);
        n=n/10;
       }
        return rev;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int m = n;

        int arm = isArmstrongNo(n);
        if(m == arm)
        {
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }

    }
}