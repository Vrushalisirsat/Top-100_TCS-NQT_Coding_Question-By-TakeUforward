/*
Maximum Product Subarray in an Array
Problem Statement: Given an array that contains both negative and positive integers, find the maximum product subarray.

Examples:

Example 1:
Input:
 Nums = [1,2,3,4,5,0]
Output:
 120
Explanation:
 In the given array, we can see 1×2×3×4×5 gives maximum product value.

 */
+
/*
Solution: Optimised Brute Force
Approach:
We can optimize the brute force by making 3 nested iterations to 2 nested iterations
Following are the steps for the approach:
Run a loop to find the start of the subarrays.
Run another nested loop
Multiply each element and store the maximum value of all the subarray.

Time Complexity: O(N2)
Reason: We are using two nested loops

Space Complexity: O(1)
Reason: No extra data structures are used for computation
*/
/*
import java.util.*;
class maxProductSubArr
{

 static int maxProductSubArray(int[] arr,int n) {
      
   int result = arr[0];
   for(int i=0;i<n;i++)
   {
    int p=arr[i];
    for(int j=i+1;j<n;j++)
    {
        result = Math.max(p,result);
        p *= arr[j]; 
    }
     result = Math.max(p,result);
   }

   return result;
}

 public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter Element in an array : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        } 
      
        System.out.println("The array of Non-Repeating elements is ");
        int maxproduct = maxProductSubArray(arr,n);
         System.out.println(maxproduct);
       
    }
}
*/
//-----------------------------------------------------------------------------------------------------------------------------------

/*
Solution: Kadane’s Algorithm
Approach:
The following approach is motivated by Kandane’s algorithm. To know Kadane’s Algorithm follow Kadane’s Algorithm
The pick point for this problem is that we can get the maximum product from the product of two negative numbers too.

Following are the steps for the approach:
Initially store 0th index value in prod1, prod2 and result.
Traverse the array from 1st index. 
For each element, update prod1 and prod2.
Prod1 is maximum of current element, product of current element and prod1, product of current element and prod2
Prod2 is minimum of current element, product of current element and prod1, product of current element and prod2
Return maximum of result and prod1
*/

import java.util.*;
class maxProductSubArr
{

 static int maxProductSubArray(int[] arr,int n) {
      
   int prod1=arr[0],prod2=arr[0],result=arr[0];

   for(int i=1;i<n;i++)
   {
     int temp = Math.max(arr[i] , Math.max(prod1*arr[i] , prod2*arr[i]));
     prod2 = Math.min(arr[i] , Math.min(prod1*arr[i] , prod2*arr[i]));
     prod1 = temp;

     result = Math.max(result,prod1);
   }
   return result;
}

 public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter Element in an array : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        } 
      
        System.out.println("The array of Non-Repeating elements is ");
        int maxproduct = maxProductSubArray(arr,n);
         System.out.println(maxproduct);
       
    }
}


