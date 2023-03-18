/*
Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
Examples:
Example 1:
Input: [1,2,4,7,7,5]
Output: Second Smallest : 2
	    Second Largest : 5
Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

*/

/*
Solution 1: (Brute Force) [this approach only works if there are no duplicates]
Intuition: What do we do to find the largest or the smallest element present in an array? We ideally sort them and the first element would be the smallest of all while the last element would be the largest. Can we find the second smallest and second-largest using a similar approach?
Approach:
Sort the array in ascending order
The element present at the second index is the second smallest element
The element present at the second index from the end is the second largest element

Time Complexity: O(NlogN), For sorting the array

Space Complexity: O(1)
*/

/*
import java.util.*;
class secondSmallLargeEle
{
  static int printSecondSmallestEle(int[] arr , int n)
   {
    Arrays.sort(arr);
    return arr[1];
   }

   static int printSecondLargeestEle(int[] arr , int n)
   {
    Arrays.sort(arr);
    return arr[n-2];
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

        System.out.println(printSecondSmallestEle(arr,n));
        System.out.println(printSecondLargeestEle(arr,n));
    }
}

*/
//------------------------------------------------------------------------------------------------------------------------------------
/*
Solution 2(Better Solution)
Intuition: Even though we want to have just the second smallest and largest elements, we are still sorting the entire array for that and thus increasing the time complexity. Can we somehow try to not sort the array and still get our answer?

Approach:
Find the smallest and largest element in the array in a single traversal
After this, we once again traverse the array and find an element that is just greater than the smallest element we just found.
Similarly, we would find the largest element which is just smaller than the largest element we just found
Indeed, this is our second smallest and second largest element.

Time Complexity: O(N), We do two linear traversals in our array

Space Complexity: O(1)
*/

/*
import java.util.*;
class secondSmallLargeEle
{
  static int printSecondSmallestEle(int[] arr , int n)
   {
    int small=Integer.MAX_VALUE;
    int second_small=Integer.MAX_VALUE;

    for (int i = 0;i < n;i++)
	{
		small = Math.min(small,arr[i]);
		
	}

    for(int i=0;i<n;i++)
    {
        if(arr[i] < second_small && arr[i] != small)
        {
            second_small = arr[i];
        }
    }
    return second_small;
   }

   static int printSecondLargeestEle(int[] arr , int n)
   {
   int large=Integer.MIN_VALUE;
    int second_large=Integer.MIN_VALUE;

    for (int i = 0;i < n;i++)
	{
		large = Math.max(large,arr[i]);
	}

    for(int i=0;i<n;i++)
    {
        if(arr[i] > second_large && arr[i] != large)
        {
            second_large = arr[i];
        }
    }
    return second_large;
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

        System.out.println(printSecondSmallestEle(arr,n));
        System.out.println(printSecondLargeestEle(arr,n));
    }
}

*/

/*
Solution 3(Best Solution)
Intuition: In the previous solution, even though we were able to bring down the time complexity to O(N), we still needed to do two traversals to find our answer. Can we do this in a single traversal by using smart comparisons on the go?

Approach:
We would require four variable : small,second_small,large,second_large. Variable small and second_small are initialized to INT_MAX while large and second_large are initialized to INT_MIN.

Second Smallest Algo:

If the current element is smaller than ‘small’, then we update second_small and small variables
Else if the current element is smaller than ‘second_small’ then we update the variable ‘second_small’
Once we traverse the entire array, we would find the second smallest element in the variable second_small.
Here’s a quick demonstration of the same.
Second Largest Algo:

If the current element is larger than ‘large’ then update second_large and large variables
Else if the current element is larger than ‘second_large’ then we update the variable second_large.
Once we traverse the entire array, we would find the second largest element in the variable second_large.
Here’s a quick demonstration of the same.

Time Complexity: O(N), Single-pass solution

Space Complexity: O(1)
*/

import java.util.*;
class secondSmallLargeEle
{
  static int printSecondSmallestEle(int[] arr , int n)
   {
    int small=Integer.MAX_VALUE;
    int second_small=Integer.MAX_VALUE;


    for(int i=0;i<n;i++)
    {
        if(arr[i] < small)
        {
            second_small = small;
            small=arr[i];
        }
        if(arr[i] < second_small && arr[i] != small)
        {
            second_small = arr[i];
        }
    }
    return second_small;
   }



   static int printSecondLargeestEle(int[] arr , int n)
   {
   int large=Integer.MIN_VALUE;
    int second_large=Integer.MIN_VALUE;

    for(int i=0;i<n;i++)
    {
        if(arr[i] > large)
        {
            second_large = large;
            large=arr[i];
        }
        if(arr[i] > second_large && arr[i] != large)
        {
            second_large = arr[i];
        }
    }
    return second_large;
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

        System.out.println(printSecondSmallestEle(arr,n));
        System.out.println(printSecondLargeestEle(arr,n));
    }
}
