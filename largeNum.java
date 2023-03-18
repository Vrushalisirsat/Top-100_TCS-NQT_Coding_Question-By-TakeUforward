/*
 Given an array, we have to find the largest element in the array.
Examples:
Input: arr[] = {2,5,1,3,0};
Output: 5
Explanation: 5 is the largest element in the array. 
*/
/*
Solution1: Sorting
Intuition: We can sort the array in ascending order, hence the largest element will be at the last index of the array. 
Approach: 
Sort the array in ascending order.
Print the (size of the array -1)th index.

Time Complexity: O(N*log(N))

Space Complexity: O(n)
*/
/*

import java.util.*;
class largeNum
{
   static int printLargeNum(int[] arr , int n)
   {
    Arrays.sort(arr);
    return arr[n-1];
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

        System.out.println(printLargeNum(arr,n));

    }
}
*/
//---------------------------------------------------------------------------------------------------------------------------------------
/*

Solution2: Using a max variable

Intuition: We can maintain a max variable which will update whenever the current value is greater than the value in the max variable.  

Approach: 

Create a max variable and initialize it with arr[0].
Use a for loop and compare it with other elements of the array
If any element is greater than the max value, update max value with the element’s value
Print the max variable.

Time Complexity: O(N)

Space Complexity: O(1)

*/
/*
import java.util.*;
class smallNum
{
   static int printSmallNum(int[] arr , int n)
   {
    int max=arr[0];
    for(int i=0;i<n;i++)
    {
        if(arr[i] > max)
        {
            max = arr[i];
        }
    }
    return max;
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

        System.out.println(printSmallNum(arr,n));

    }
}

*/

