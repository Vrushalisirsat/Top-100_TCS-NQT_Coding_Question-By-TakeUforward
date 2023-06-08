/*
Problem Statement: Finding Equilibrium index in an array

Given a 0-indexed integer array nums, find the leftmost equilibrium Index.

An equilibrium Index is an index at which sum of elements on its left is equal to the sum of element on its right. That is, nums[0] + nums[1] + … + nums[equilibriumIndex-1] == nums[equilibriumIndex+1] + nums[equilibriumIndex+2] + … + nums[nums.length-1]. If equilibriumIndex == 0, the left side sum is considered to be 0. Similarly, if equilibriumIndex == nums.length – 1, the right side sum is considered to be 0.

Return the leftmost equilibrium Index that satisfies the condition, or -1 if there is no such index.

Examples:

Example 1:
Input: nums = [2,3,-1,8,4]
Output: 3
Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
The sum of the numbers after index 3 is: 4 = 4

Example 2:
Input: nums = [1,-1,4]
Output: 2
Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
The sum of the numbers after index 2 is: 0

*/

/*
Solution 1: Using Two Loops(Brute Force)
Consider two variables leftSum and rightSum initialized to zero.Now for every index, i calculate the leftSum till that index and rightSum till that index.
At any point if (leftSum == rightSum) return that index i.
If equilibrium index not found return -1.
*/

/*
import java.util.*;
class equilibriumidx {

    static int findEquilibriumIdx(int arr[] ,int n)
    {
      int leftSum,rightSum;

      for(int i=0;i<n;i++)
      {
        leftSum=0;
        for(int j=0;j<i;j++)
        {
            leftSum += arr[j];
        }

        rightSum=0;
        for(int j=i+1;j<n;j++)
        {
            rightSum += arr[j];
        }
      

      if(leftSum == rightSum)
      {
        return i;
      }
      }
      return -1;
     
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

        int equilibriumidx = findEquilibriumIdx(arr,n);
        System.out.println(equilibriumidx);
       
    }
}
*/
/*

Solution 2: Using Total Sum
Calculate the sum = total sum of all the integers in the array.
Keep leftSum = 0, rightSum = sum.
leftSum = sum of all the integers to its left 
rightSum = sum of all the integers to it’s right.
At every index i rightSum would be rightSum excluding the current index value.now we will is Check if(leftSum == rightSum) If yes then return that index else keep moving forward.while moving forward it can be seen that we are considering that current index value to be on left so update the leftSum value. leftSum = leftSum + nums[i].
If no such index is found return -1.

*/

import java.util.*;
class equilibriumidx {

    static int findEquilibriumIdx(int arr[] ,int n)
    {
      int totalSum = 0;
      for(int i=0;i<n;i++)
      {
        totalSum += arr[i];
      }
      
      int leftSum=0,rightSum=totalSum;

      for(int i=0;i<n;i++)
      {
        rightSum -= arr[i];

      if(leftSum == rightSum)
      {
        return i;
      }

      leftSum += arr[i];
      }
      return -1;
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

        int equilibriumidx = findEquilibriumIdx(arr,n);
        System.out.println(equilibriumidx);
       
    }
}