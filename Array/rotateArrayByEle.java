/*
Rotate array by K elements

Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.

Examples:

Example 1:
Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
Output: 6 7 1 2 3 4 5
Explanation: array is rotated to right by 2 position .

Example 2:
Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left 
Output: 9 10 11 3 7 8
Explanation: Array is rotated to right by 3 position.
*/

import java.util.*;

class rotateArrayByEle
{
    static void reverse(int arr[],int start,int end)
    {
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateArrayByRight(int arr[],int k,String dir)
    {
        int n = arr.length;
       if(dir.equals("right"))
       {
         reverse(arr,n-k,n-1);
         reverse(arr,0,n-k-1);
         reverse(arr,0,n-1);
       }
       else if(dir.equals("left"))
       {
        // Reverse first k elements
    Reverse(arr, 0, k - 1);
    // Reverse last n-k elements
    Reverse(arr, k , n - 1);
    // Reverse whole array
    Reverse(arr, 0, n - 1);
       }
       else {
            System.out.println("Invalid direction. Please specify 'left' or 'right'.");
        }

      for(int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array Element : ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter value of k : ");
        int k = sc.nextInt();

        rotateArrayByRight(arr,k,"right");
        rotateArrayByRight(arr,k,"left");

        
    }
}