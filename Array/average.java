/*
Average of all the elements in the array
Problem Statement: Given an array, we have to find the average of all the elements in the array.

Examples:

Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 3
Explanation: Average is the sum of all the elements divided by number of elements.Therefore (1+2+3+4+5)/5 = 3.

*/

/*
Solution
Approach: 
Using for loop traverse through the array and while traversing  maintain  a variable for storing sum of the elements in the array.
After completing the traversal simply divide the sum by no. of elements in the array.

Time Complexity: O(n) As we are traversing the array once.

Space Complexity: O(1).
*/

import java.util.*;
class average
{
    static int averageOfElemenets(int[] arr , int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum = sum + arr[i];
        }
        return sum/n;
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

       int average = averageOfElemenets(arr,n);
      System.out.println("Average = " + average);

        
    }
}