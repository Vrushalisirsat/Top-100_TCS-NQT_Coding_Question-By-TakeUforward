/*
Replace elements by its rank in the array

Problem Statement: Given an array of N integers, the task is to replace each element of the array by its rank in the array.

Examples:

Example 1:
Input: 20 15 26 2 98 6
Output: 4 3 5 1 6 2
Explanation: When sorted,the array is 2,6,15,20,26,98. So the rank of 2 is 1,rank of 6 is 2,rank of 15 is 3 and so…

*/

import java.util.*;
class rank
{

 static void replaceElementByRank(int[] arr,int n) {
   int brr[] =new int[n]; 
 
   int temp = 1;
   
   HashMap<Integer,Integer> map = new HashMap<>();

     for (int i = 0; i < n; i++) {
      brr[i] = arr[i];
    }
  Arrays.sort(brr);
   for(int i=0;i<n;i++)
   {
     if(map.get(brr[i]) == null)
     {
        map.put(brr[i],temp);
        temp++;
     }
   }

   for(int i=0;i<n;i++)
   {
    System.out.println(map.get(arr[i]) + " ");
   } 
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
      
        System.out.println("The array elements replacing by its rank is : ");
        replaceElementByRank(arr,n);
       
       
    }
}