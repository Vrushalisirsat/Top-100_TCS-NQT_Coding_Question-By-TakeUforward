/*
Rearrange array in increasing-decreasing order
Problem Statement: Rearrange the array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order

Examples:

Example 1:
Input: 8 7 1 6 5 9
Output: 1 5 6 9 8 7
Explanation: First three elements are in the ascending order and next three elements are in the descending order.

*/

/*
Solution:
Intuition: Sort the whole array. Then print the first half of the array to get the first half in the ascending order and then print the rest of the array in the reverse order.
Approach:

Sort the given array.
Print the first half of the array i.e from 0 to (n/2 -1)th index,to print the first half in the ascending order.
Then print elements from n-1 to n/2th index to get the second half in the descending order.

Time Complexity: O(nlogn) +O(n), O(nlogn) for sorting the array and O(n) for printing the elements. 

Space Complexity: O(1).
*/
/*
import java.util.*;
class rearrangrArray
{
    public static int[] sortArray(int[] arr,int n)
    {
         for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void rearrangerArr(int[] arr,int n)
    {
        int[] ans = new int[n];
       sortArray(arr,n);
       for(int i=0;i<n/2;i++)
       {
        System.out.print(arr[i] + " ");
       }

       for(int i=n-1;i>=n/2;i--)
       {
        System.out.print(arr[i] + " ");
       }
      
    }

    static void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        } 

     rearrangerArr(arr,n);
       
    }
}

/*

//---------------------------------------------------------------------------------------------------------------------

/*
Solution 2: Using collection in Java or STL in C++

Approach:

 

For Java: Instream sum() gives the sum of all the elements in the stream.

*/

import java.util.*;
import java.util.stream.IntStream;
public class Main {
  public static void main(String args[]) {
    int n = 5;
    int arr[] = {1,2,3,4,5};
    int sum = IntStream.of(arr).sum();
    System.out.println("The sum of the elements of the array is "+sum);
  }
}