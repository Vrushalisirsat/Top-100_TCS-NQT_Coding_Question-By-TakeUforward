/*
Find Median of the given Array
Problem Statement: Given an unsorted array, find the median of the given array.

Examples:

Example 1:
Input: [2,4,1,3,5]
Output: 3

*/

import java.util.*;
class median
{
    static void median(int[] arr , int n)
    {
       Arrays.sort(arr);

       if(n%2 == 0)
       {
        int ind1 = (n/2)-1;
        int ind2 = (n/2);
        System.out.println((arr[ind1] + arr[ind2])/2);
       }
       else{
          System.out.println(arr[n/2]);
       }
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

      
      System.out.println("Median = " );
      median(arr,n);

        
    }
}